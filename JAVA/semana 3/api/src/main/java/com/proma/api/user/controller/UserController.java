package com.proma.api.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proma.api.user.businesslogic.UserBl;
import com.proma.api.user.da.UserRepository;
import com.proma.api.user.dto.UserDto;

@RestController
@RequestMapping("api/user")
public class UserController {
    
    @Autowired
    private UserRepository userRep;

    @GetMapping
    public List<UserDto> userList() {
        UserBl _userBl = new UserBl(userRep);
        return _userBl.list();
    }
}
