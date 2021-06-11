package io.beaniejoy.bootapiserver.controller;

import io.beaniejoy.bootapiserver.jwt.JwtUtil;
import io.beaniejoy.bootapiserver.network.TokenDto;
import io.beaniejoy.bootapiserver.network.request.LoginDto;
import io.beaniejoy.bootapiserver.network.response.UserResponseDto;
import io.beaniejoy.bootapiserver.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class AuthController {

    private final UserService userService;

    private final JwtUtil jwtUtil;

    @PostMapping("/signin")
    public ResponseEntity<TokenDto> signin(@RequestBody LoginDto resource) {
        UserResponseDto user = userService.authenticate(resource.getEmail(), resource.getPassword());
        String jwtToken = jwtUtil.createToken(user, "user");

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Authorization", "Bearer " + jwtToken);
        return new ResponseEntity<>(new TokenDto(jwtToken), httpHeaders, HttpStatus.CREATED);
    }
}
