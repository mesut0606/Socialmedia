package com.vektorel.VektorerSocialmedia.controller;

import com.vektorel.VektorerSocialmedia.repository.entity.User;

public class UserController {
    public void deneme (){
        User.builder().avatar("sdsa").build();
        User.builder().build().toString();
    }
}
