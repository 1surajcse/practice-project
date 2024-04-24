package com.user.service.userservice.vo;

import com.user.service.userservice.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TemplateVO {
    public User user;
    public  Department department;
}
