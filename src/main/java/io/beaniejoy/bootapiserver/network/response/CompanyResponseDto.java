package io.beaniejoy.bootapiserver.network.response;

import io.beaniejoy.bootapiserver.network.request.EmployeeRequestDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompanyResponseDto {

    private Long id;

    private String companyName;

    private String companyAddress;

    private List<EmployeeRequestDto> employeeList;
}
