package com.service;

import com.model.User;

public interface UserService {
     User createUser(User user);
     User readUserById(long id);
     User readUserByName(int id);
     User updateUser(User user);
     User deleteUserById(int id);
     
}
