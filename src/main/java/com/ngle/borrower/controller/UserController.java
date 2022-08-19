package com.ngle.borrower.controller;

import com.ngle.borrower.Beans.User;
import com.ngle.borrower.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/api/user/login")
    public String getUserData(@RequestParam("user_id") int user_id){
       User userData =  userService.getUserData(user_id);
       String user_email = userData.getUser_email();
       String user_password = userData.getUser_password();
       return user_email+","+user_password;
    }

}
