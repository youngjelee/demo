package com.example.demo.test.java21;

public record User(String userName ,
                   String phone,
                   String address ) {



    public User (String userName , String phone ) {
        this(userName, phone, /* default address */ null);
    }




}
