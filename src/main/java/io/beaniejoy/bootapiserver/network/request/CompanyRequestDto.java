package io.beaniejoy.bootapiserver.network.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CompanyRequestDto {
    private String companyName;

    private String companyAddress;
}
