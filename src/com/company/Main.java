package com.company;

import com.company.Dao.UserDao;
import com.company.Model.Gender.Gender;
import com.company.Model.User;
import com.company.Service.impl.UserServiceImpl;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        User user1 = new User(1, "Samat", 26, Gender.MALE);
        User user2 = new User(2, "Asel", 24, Gender.FEMALE);
        User user3 = new User(3, "Muhammed", 25, Gender.MALE);


        UserServiceImpl userService = new UserServiceImpl(new UserDao(new ArrayList<>()));
        userService.addUser(user1);
        userService.addUser(user2);
        userService.addUser(user3);

        userService.getById(1);
        System.out.println("------");
        userService.getById(6);
        System.out.println("------");
        userService.getAllUsers();
        System.out.println("------");
        userService.deleteById(2);
        userService.getAllUsers();
    }
}

