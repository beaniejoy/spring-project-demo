package io.beaniejoy.bootapiserver.mapper;

import io.beaniejoy.bootapiserver.model.Company;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CompanyMapper {

    int insert(@Param("company") Company company);

    List<Company> getAll();

    Company getById(@Param("id") Long id);

    void update(@Param("company") Company company);
}
