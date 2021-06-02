package io.beaniejoy.bootapiserver.network.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRequestDto {

    private String name;

    private String email;

    private String password;

    private String phone;

    private String address;
}
