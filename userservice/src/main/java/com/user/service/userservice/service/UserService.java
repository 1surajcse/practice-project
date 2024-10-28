package com.user.service.userservice.service;

import com.user.service.userservice.entity.User;
import com.user.service.userservice.repository.UserRepository;
import com.user.service.userservice.vo.Department;
import com.user.service.userservice.vo.TemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public TemplateVO getUserWithDepartment(Long userId) {

        User user=userRepository.findByUserId(userId);
        Department department=restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+user.getDepartmentId(),Department.class);

        TemplateVO templateVO=new TemplateVO();

        templateVO.setDepartment(department);
        templateVO.setUser(user);

        return templateVO;

    }
}
