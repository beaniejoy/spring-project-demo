package io.beaniejoy.bootapiserver.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncService {

    private static final Logger logger = LoggerFactory.getLogger(AsyncService.class);

    @Async
    public void onAsync() {
        try {
            Thread.sleep(5000);
            logger.info("beaniejoy onAsync");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void onSync() {
        try {
            Thread.sleep(10000);
            logger.info("beaniejoy onSync");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
