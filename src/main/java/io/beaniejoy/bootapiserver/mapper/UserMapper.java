package io.beaniejoy.bootapiserver.mapper;

import io.beaniejoy.bootapiserver.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    User getUserById(@Param("id") String id);

    List<User> getUserList();

    int insertUser(@Param("user") User user);

    int updateUser(@Param("user") User user);

    void deleteUser(@Param("id") String id);
}
