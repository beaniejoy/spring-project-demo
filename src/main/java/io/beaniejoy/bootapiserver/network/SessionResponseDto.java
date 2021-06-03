package io.beaniejoy.bootapiserver.network;

import lombok.Data;

@Data
public class SessionResponseDto {

    private String name;

    private Integer level;

    private String address;
}
