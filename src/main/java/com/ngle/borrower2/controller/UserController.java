package com.ngle.borrower2.controller;

import com.ngle.borrower2.Beans.User;
import com.ngle.borrower2.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/api/user/login")
    public String getUserData(@RequestParam(name="user_id") int user_id){
       User userData =  userService.getUserData(user_id);
       String user_email = userData.getUser_email();
       String user_password = userData.getUser_password();
       return user_email+","+user_password;
    }

}
