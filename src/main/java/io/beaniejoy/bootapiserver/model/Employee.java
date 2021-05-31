package io.beaniejoy.bootapiserver.model;

public class Employee {

    private Long id;
    private String employeeName;
    private String employeeAddress;
    private Long companyId;

    public Employee() {
    }

    public Employee(Long id, String employeeName, String employeeAddress, Long companyId) {
        this.id = id;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.companyId = companyId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }
}