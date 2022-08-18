package com.ngle.borrower2.Beans;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Admin {

    private long admin_id;
    private String admin_email;
    private String admin_password;




    private LocalDateTime createDate;




    public void createDate(){
        this.createDate = LocalDateTime.now();
    }

}
