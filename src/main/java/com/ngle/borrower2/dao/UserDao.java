package com.ngle.borrower2.dao;

import com.ngle.borrower2.Beans.User;
import com.ngle.borrower2.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserDao {

    private final UserMapper userMapper;

    public User getUserData(int user_id){
        return userMapper.getUserData(user_id);
    }

}
