package io.beaniejoy.bootapiserver.controller;

import io.beaniejoy.bootapiserver.model.User;
import io.beaniejoy.bootapiserver.network.request.UserRegistrationRequestDto;
import io.beaniejoy.bootapiserver.network.response.UserResponseDto;
import io.beaniejoy.bootapiserver.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<UserResponseDto> signup(@RequestBody UserRegistrationRequestDto resource) throws URISyntaxException {
        UserResponseDto userResponseDto = userService.singUp(resource);

        return new ResponseEntity<>(userResponseDto, HttpStatus.CREATED);
    }
}
