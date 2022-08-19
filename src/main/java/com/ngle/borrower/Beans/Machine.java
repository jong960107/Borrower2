package com.ngle.borrower.Beans;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Machine {

    private int machine_id;
    private String machine_code;
    private String group;
    private String maker;
    private String machine_name;
    private String osVersion;
    private String phoneNumber;
    private String borrowStatus;
    private String teamBorrow;
    private String whoBorrow;

    private LocalDateTime createDate;

    public void createDate(){
        this.createDate = LocalDateTime.now();
    }
}
