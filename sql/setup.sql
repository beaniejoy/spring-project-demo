CREATE TABLE UserProfile
(
    id      VARCHAR(64) PRIMARY KEY,
    name    VARCHAR(64),
    phone   VARCHAR(64),
    address VARCHAR(256)
);

CREATE TABLE company
(
    id              BIGINT AUTO_INCREMENT PRIMARY KEY,
    company_name    VARCHAR(128),
    company_address VARCHAR(128),
    INDEX           `idx_company_name` (company_name)
);

CREATE TABLE employee
(
    id               BIGINT AUTO_INCREMENT PRIMARY KEY,
    company_id       BIGINT,
    employee_name    VARCHAR(128),
    employee_address VARCHAR(128),
    INDEX            `idx_employee_name` (employee_name),
    FOREIGN KEY (company_id) REFERENCES company (id)
);