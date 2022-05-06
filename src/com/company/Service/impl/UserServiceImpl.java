package com.company.Service.impl;

import com.company.Dao.UserDao;
import com.company.Model.User;
import com.company.MyException;
import com.company.Service.UserService;

import java.util.ArrayList;
import java.util.Arrays;



public class UserServiceImpl implements UserService {
    private UserDao userDaos;

    public UserServiceImpl(UserDao userDaos) {
        this.userDaos = userDaos;
    }

    @Override
    public void addUser(User user) {
        userDaos.users.add(user);
    }

    @Override
    public void getById(int id) throws MyException {
//        User [] users = userDaos.getUsers().toArray(new User[0]);
//        ArrayList<Integer> list = new ArrayList<>();
////        Arrays.stream(users).filter(x -> x.getId() == id).forEach(x-> System.out.println(x));
//        Arrays.stream(users).forEach(x -> {
//            list.add(x.getId());
//            if(x.getId() == id){
//                System.out.println(x);}
//            try {
//                if(!list.contains(id)) {
//                    throw new MyException("There is no user with this id!");
//                }
//            } catch (RuntimeException e) {
//            System.out.println(e.getMessage());
//        }
//        }); Стрим менен чыгаруу татаал болуп, аткара алган жокмун.

        ArrayList<Integer> list = new ArrayList<>();

        for (User us : userDaos.users) {
            list.add(us.getId());
            if (us.getId() == id) {
                System.out.println(us);
            }
        }
        try {
            if (!list.contains(id)) {
                throw new MyException("There is no user with this id!");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }


    @Override
    public void deleteById(int id) {
        userDaos.users.removeIf(user -> user.getId() == id);
    }

    @Override
    public void getAllUsers() {
        User [] users = userDaos.getUsers().toArray(new User[0]);
        Arrays.stream(users).forEach(x -> System.out.println(x));

    }
}
