package com.user.service.userservice.controller;

import com.user.service.userservice.entity.User;
import com.user.service.userservice.service.UserService;
import com.user.service.userservice.vo.TemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user){

        return userService.saveUser(user);
    }
    @GetMapping("/{id}")
    public TemplateVO getUserWithDepartment(@PathVariable("id") Long userId){
        return userService.getUserWithDepartment(userId);
    }

}
