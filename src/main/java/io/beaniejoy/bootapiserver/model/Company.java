package io.beaniejoy.bootapiserver.model;

import java.util.List;

public class Company {
    private Long id;
    private String companyName;
    private String companyAddress;
    private List<Employee> employeeList;

    public Company() {
    }

    public Company(Long id, String companyName, String companyAddress, List<Employee> employeeList) {
        this.id = id;
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.employeeList = employeeList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
