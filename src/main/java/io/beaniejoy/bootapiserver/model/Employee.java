package io.beaniejoy.bootapiserver.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @JsonIgnore
    private Long companyId;

}