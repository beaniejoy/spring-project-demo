package io.beaniejoy.bootapiserver.service;

import io.beaniejoy.bootapiserver.mapper.CompanyMapper;
import io.beaniejoy.bootapiserver.mapper.EmployeeMapper;
import io.beaniejoy.bootapiserver.model.Company;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    private final CompanyMapper companyMapper;

    private final EmployeeMapper employeeMapper;

    public CompanyService(CompanyMapper companyMapper, EmployeeMapper employeeMapper) {
        this.companyMapper = companyMapper;
        this.employeeMapper = employeeMapper;
    }

    public List<Company> getAll() {
        List<Company> companyList = companyMapper.getAll();
        if (companyList != null && companyList.size() > 0) {
            for (Company company : companyList) {
                company.setEmployeeList(employeeMapper.getByCompanyId(company.getId()));
            }
        }

        return companyList;
    }
}
