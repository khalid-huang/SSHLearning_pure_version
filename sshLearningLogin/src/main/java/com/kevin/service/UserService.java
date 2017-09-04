package com.kevin.service;

import com.kevin.entity.User;

import java.util.List;

/**
 * Created by kinthon on 17-6-23.
 */
public interface UserService {
    public boolean addUser(User user);

    public boolean login(User user);

    public List getAllUser();

    public User getUserById(int id);

    public boolean updateUser(User user);

    public boolean deleteUser(int id);
}

