ALTER TABLE `employee`
    ADD COLUMN `phone` VARCHAR(11) NOT NULL AFTER `employee_address`;

DELETE FROM employee;

INSERT INTO employee(employee_name, employee_address, phone, company_id) VALUES('test em1', 'test emaddress1', '01022223333', 1);
INSERT INTO employee(employee_name, employee_address, phone, company_id) VALUES('test em2', 'test emaddress2', '01044445555', 2);
INSERT INTO employee(employee_name, employee_address, phone, company_id) VALUES('test em3', 'test emaddress3', '01061234098', 2);
INSERT INTO employee(employee_name, employee_address, phone, company_id) VALUES('test em4', 'test emaddress4', '01084372943', 1);
INSERT INTO employee(employee_name, employee_address, phone, company_id) VALUES('test em5', 'test emaddress5', '01084763589', 1);
INSERT INTO employee(employee_name, employee_address, phone, company_id) VALUES('test em6', 'test emaddress6', '01072938674', 3);
INSERT INTO employee(employee_name, employee_address, phone, company_id) VALUES('test em7', 'test emaddress7', '01092838877', 3);