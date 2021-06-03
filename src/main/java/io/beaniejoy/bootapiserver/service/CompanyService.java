package io.beaniejoy.bootapiserver.service;

import io.beaniejoy.bootapiserver.mapper.CompanyMapper;
import io.beaniejoy.bootapiserver.model.Company;
import io.beaniejoy.bootapiserver.network.request.CompanyRequestDto;
import io.beaniejoy.bootapiserver.network.response.CompanyResponseDto;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class CompanyService {

    private final CompanyMapper companyMapper;

    public void postCompany(CompanyRequestDto resource) {
        Company company = new Company(resource.getCompanyName(), resource.getCompanyAddress());
        companyMapper.insert(company);
    }

    public List<Company> getAll() {
        return companyMapper.getAll();
    }

    public Company getById(Long id) {
        return companyMapper.getById(id);
    }

}
