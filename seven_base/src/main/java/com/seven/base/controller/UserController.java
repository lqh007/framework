package com.seven.base.controller;

import com.seven.base.service.UserService;
import com.seven.common.utils.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("base/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("findAll")
    public ApiResponse findAll(){
        return  userService.findAll();
    }

}
