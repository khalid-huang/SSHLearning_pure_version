package com.kevin.service.impl;

import com.kevin.dao.UserDao;
import com.kevin.entity.User;
import com.kevin.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by kinthon on 17-6-23.
 */
//注入服务
@Service("userService")
public class UserServiceImpl implements UserService{
    //自动注入userDao，也可以使用@Autowired
    @Resource
    private UserDao userDao;


    @Override
    public boolean addUser(User user) {
        this.userDao.add(user);
        return true;
    }

    @Override
    public boolean login(User user) {
        return this.userDao.login(user);
    }

    @Override
    public List getAllUser() {
        return this.userDao.getUser();
    }

    @Override
    public User getUserById(int id) {
        return this.userDao.getUser(id);
    }

    @Override
    public boolean updateUser(User user) {
        this.userDao.update(user);
        return true;

    }

    @Override
    public boolean deleteUser(int id) {
        this.userDao.delete(id);
        return true;
    }
}

