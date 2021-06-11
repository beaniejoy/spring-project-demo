package io.beaniejoy.bootapiserver.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Long userId;

    private String userName;

    private String email;

    private String password;

    private String address;

    private String phoneNumber;

    private Boolean seller;

    private RoleType roleType;

    private String salt;

    public User(String userName,
                String email,
                String password,
                String address,
                String phoneNumber,
                Boolean seller,
                RoleType roleType,
                String salt) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.seller = seller;
        this.roleType = roleType;
        this.salt = salt;
    }
}
