package com.seven.security.demo.service;

import com.seven.security.demo.dao.UserDao;
import com.seven.security.demo.pojo.User;
import com.seven.common.utils.ApiResponse;
import com.seven.common.utils.IdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private IdGenerator idGenerator;

    public ApiResponse findAll() {
        return ApiResponse.success(userDao.findAll());
    }

    public void save(User user) {
        user.setId(idGenerator.nextId() + "");
        userDao.save(user);
    }

    public void update(User user) {
        userDao.save(user);
    }

    public void deleteById(String id) {
        userDao.deleteById(id);
    }


}
