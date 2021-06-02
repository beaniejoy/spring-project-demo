package io.beaniejoy.bootapiserver.network.request;

import io.beaniejoy.bootapiserver.model.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompanyRequestDto {
    private String companyName;

    private String companyAddress;

    private List<EmployeeRequestDto> employeeList;
}
