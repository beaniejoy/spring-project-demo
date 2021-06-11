package io.beaniejoy.bootapiserver.network.response;

import io.beaniejoy.bootapiserver.model.RoleType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponseDto {

    private Long userId;

    private String userName;

    private String email;

    private String address;

    private String phoneNumber;

    private Boolean seller;

    private RoleType roleType;

}
