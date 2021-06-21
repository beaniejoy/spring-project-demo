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
        Company company = Company.builder()
                .companyName(resource.getCompanyName())
                .companyAddress(resource.getCompanyAddress())
                .build();

        companyMapper.insert(company);
    }
    public List<Company> getAll() {
        List<Company> companyList = companyMapper.getAll();

        CompanyRequestDto dto = CompanyRequestDto.builder()
                .companyName("update된 company")
                .companyAddress("update된 company address")
                .build();

        update(companyList.get(0).getId(), dto);
        return companyList;
    }

    public Company getById(Long id) {
        return companyMapper.getById(id);
    }

    public void update(Long id, CompanyRequestDto resource) {
        Company company = companyMapper.getById(id);
        company.updateInfo(
                resource.getCompanyName(),
                resource.getCompanyAddress());

        companyMapper.update(company);
    }

}
