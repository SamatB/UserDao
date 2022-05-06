package com.company.Dao;

import com.company.Model.User;

import java.util.List;

public class UserDao {
    public List<User> users;

    public UserDao(List<User> users) {
        this.users = users;
    }

    public UserDao() {
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "UserDao: " +
                "users: " + users;
    }
}
