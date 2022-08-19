package com.ngle.borrower.dao;

import com.ngle.borrower.Beans.User;
import com.ngle.borrower.mapper.UserMapper;
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
