package com.ngle.borrower.service;

import com.ngle.borrower.Beans.User;
import com.ngle.borrower.dao.UserDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserDao userDao;

    public User getUserData(int user_id){
        return userDao.getUserData(user_id);
    }


}
