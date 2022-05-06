package com.company.Service;

import com.company.Model.User;

public interface UserService {

    void addUser(User user);

    void getById(int id) throws RuntimeException;

    void deleteById(int id);

    default void getAllUsers () {

    }

}
