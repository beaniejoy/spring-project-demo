package io.beaniejoy.bootapiserver.mapper;

import io.beaniejoy.bootapiserver.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserRepository {

    void insert(@Param("user") User user);

//    List<User> findAll();
//
//    User findById(@Param("userId") Long userId);

    User findByEmail(@Param("email") String email);

}
