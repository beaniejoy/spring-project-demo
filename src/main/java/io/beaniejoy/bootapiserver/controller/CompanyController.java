package io.beaniejoy.bootapiserver.controller;

import io.beaniejoy.bootapiserver.mapper.CompanyMapper;
import io.beaniejoy.bootapiserver.model.Company;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {

    private final CompanyMapper companyMapper;


    public CompanyController(CompanyMapper companyMapper) {
        this.companyMapper = companyMapper;
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
