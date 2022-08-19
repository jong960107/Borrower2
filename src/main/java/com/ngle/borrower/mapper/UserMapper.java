package com.ngle.borrower.mapper;

import com.ngle.borrower.Beans.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface UserMapper {

    @Select("select user_email,user_password from user where user_id=#{user_id}")
    User getUserData(@Param("user_id") int user_id);
}
