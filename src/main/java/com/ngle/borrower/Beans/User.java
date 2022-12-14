package com.ngle.borrower.Beans;

import lombok.Data;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Data
@Repository
public class User {

    private int user_id;
    private String user_email;
    private String user_password;
    private LocalDateTime createDate;

    public void createDate(){
        this.createDate = LocalDateTime.now();
    }



}