package io.beaniejoy.bootapiserver.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String id;

    private String name;

    private String email;

    private String password;

    private String phone;

    private String address;
}
