package com.ngle.borrower2.mapper;

import com.ngle.borrower2.Beans.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface UserMapper {

    @Select("select user_email,user_password from user where user_id=#{user_id}")
    User getUserData(int user_id);
}
