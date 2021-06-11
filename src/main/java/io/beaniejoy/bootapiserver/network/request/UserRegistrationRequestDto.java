package io.beaniejoy.bootapiserver.network.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRegistrationRequestDto {

    private String userName;

    private String email;

    private String password;

    private String address;

    private String phoneNumber;

    private Boolean seller;

}
