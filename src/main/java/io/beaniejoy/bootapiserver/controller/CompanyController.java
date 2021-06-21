package io.beaniejoy.bootapiserver.controller;

import io.beaniejoy.bootapiserver.model.Company;
import io.beaniejoy.bootapiserver.network.request.CompanyRequestDto;
import io.beaniejoy.bootapiserver.service.CompanyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {

private final CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @PostMapping("")
    public String postCompany(@RequestBody CompanyRequestDto resource) {
        companyService.postCompany(resource);
        return "created";
    }

    @GetMapping("")
    public List<Company> getAll() {
        return companyService.getAll();
    }

    @GetMapping("/{id}")
    public Company getCompanyById(@PathVariable("id") Long id) {
        return companyService.getById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateInfo(@PathVariable("id") Long id,
                                             @RequestBody CompanyRequestDto resource) {
        companyService.update(id, resource);

        return ResponseEntity.ok("update Success");
    }
}
