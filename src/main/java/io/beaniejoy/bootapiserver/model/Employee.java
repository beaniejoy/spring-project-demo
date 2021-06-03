package io.beaniejoy.bootapiserver.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    private Long id;

    private String employeeName;

    private String employeeAddress;

    private Long companyId;

}