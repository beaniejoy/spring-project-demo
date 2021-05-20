package io.beaniejoy.bootapiserver.mapper;

import io.beaniejoy.bootapiserver.model.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    int insert(@Param("employee") Employee employee);

    List<Employee> getAll();

    public Employee getById(@Param("id") Long id);
}
