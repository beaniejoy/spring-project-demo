package io.beaniejoy.bootapiserver.controller;

import io.beaniejoy.bootapiserver.mapper.UserMapper;
import io.beaniejoy.bootapiserver.model.User;
import io.beaniejoy.bootapiserver.service.UserService;
import lombok.RequiredArgsConstructor;
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

    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") String id) {
        return null;
    }

    @GetMapping("/all")
    public List<User> getUserList() {
        return null;
    }

    @PostMapping("/{id}")
    public ResponseEntity<?> registerUser(@PathVariable("id") String id,
                                       @RequestBody User user) throws URISyntaxException {

        return ResponseEntity.created(new URI("")).build();
    }

    @PutMapping("/{id}")
    public void updateUser(@PathVariable("id") String id,
                                @RequestParam("name") String name,
                                @RequestParam("phone") String phone,
                                @RequestParam("address") String address) {

    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") String id) {
    }
}
