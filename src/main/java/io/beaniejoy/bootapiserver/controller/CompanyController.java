package io.beaniejoy.bootapiserver.controller;

import io.beaniejoy.bootapiserver.mapper.CompanyMapper;
import io.beaniejoy.bootapiserver.model.Company;
import io.beaniejoy.bootapiserver.service.CompanyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {

    private final CompanyMapper companyMapper;

    private final CompanyService companyService;

    public CompanyController(CompanyMapper companyMapper, CompanyService companyService) {
        this.companyMapper = companyMapper;
        this.companyService = companyService;
    }

    @PostMapping("")
    public Company post(@RequestBody Company company) {
        companyMapper.insert(company);
        // companyService.add(company);
        return company;
    }

    @GetMapping("")
    public List<Company> getAll() {
        return companyMapper.getAll();
    }

    @GetMapping("/{id}")
    public Company getById(@PathVariable("id") Long id) {
        return companyMapper.getById(id);
    }
}
