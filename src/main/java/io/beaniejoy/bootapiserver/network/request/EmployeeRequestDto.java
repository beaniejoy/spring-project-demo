package io.beaniejoy.bootapiserver.network.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeRequestDto {

    private String employeeName;

    private String employeeAddress;

    private Long companyId;

}
