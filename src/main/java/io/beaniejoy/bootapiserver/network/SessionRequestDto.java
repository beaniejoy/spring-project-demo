package io.beaniejoy.bootapiserver.network;

import lombok.Data;

@Data
public class SessionRequestDto {

    private String email;

    private String password;
}
