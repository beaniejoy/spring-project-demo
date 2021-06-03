package io.beaniejoy.bootapiserver.controller;

import io.beaniejoy.bootapiserver.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LoginController {

    private final UserService userService;

    public void login() {

    }
}
