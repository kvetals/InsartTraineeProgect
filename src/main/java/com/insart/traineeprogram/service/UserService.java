package com.insart.traineeprogram.service;

import com.insart.traineeprogram.DAO.UsersDAO;
import com.insart.traineeprogram.DAO.UsersDAOImpl;
import com.insart.traineeprogram.model.User;

/**
 * Created by Семья on 14.02.2016.
 */
public class UserService {
    public static boolean registerNewUser(String userLogin, String userPassword, String userEmail, Integer roleId){
        boolean result = false;
        UsersDAO usersDAO = new UsersDAOImpl();
        User user = new User(userLogin, userPassword, userEmail, roleId);
        if (!usersDAO.isExist(userLogin)) {
            usersDAO.addUser(user);
            result = true;
        }
        return result;
    }

    public static void authenticateUser(String userLogin, String userPassword){

    }

    public static void restoreUserPassword(){};
}
