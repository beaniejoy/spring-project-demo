package io.beaniejoy.bootapiserver.controller;

import io.beaniejoy.bootapiserver.service.AsyncService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AsyncController {

    private static final Logger logger = LoggerFactory.getLogger(AsyncController.class);

    private final AsyncService asyncService;

    @GetMapping("/async_test")
    public ResponseEntity<?> testAsync() {
        asyncService.onAsync();
        logger.info("Beaniejoy Async Thread!!");
        logger.info("=========================");

        return ResponseEntity.ok("async");
    }

    @GetMapping("/sync_test")
    public ResponseEntity<?> testSync() {
        asyncService.onAsync();
        logger.info("Beaniejoy Sync Thread!!");
        logger.info("=========================");

        return ResponseEntity.ok("sync");
    }
}
