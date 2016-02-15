package com.insart.traineeprogram.DAO;

import com.insart.traineeprogram.model.User;

import java.util.List;

/**
 * Created by Семья on 13.02.2016.
 */
public interface UsersDAO {
    String CREATE_NEW_USER = "INSERT INTO users (user_login, user_password, user_email, role_id) VALUES (?, ?, ?, ?)";

    String GET_ALL_USERS = "SELECT * FROM users";
    String GET_USER_BY_EMAIL = "SELECT * FROM users WHERE email = ?";
    String GET_USER_BY_ID = "SELECT * FROM users WHERE user_id = ?";
    String GET_USER_BY_LOGIN = "SELECT * FROM users WHERE user_login = ?";
    String GET_USER_WHERE_LOGIN_AND_PASSWORD = "SELECT * FROM users WHERE email = ? and password = ?";
    String GET_USERS_BY_ROLE_CAPTION = "SELECT users.* FROM users, roles WHERE users.role_id = roles.role_id and role_caption = ?";
//    String GET_ALL_USERS_WITH_RIGHTS_BY_OBJECT_ID = "SELECT user_id, privilage_id WHERE object_id = ?";

    String DELETE_USER_BY_ID = "DELETE FROM users WHERE user_id = ?";
    String DELETE_USER_BY_LOGIN = "DELETE FROM users WHERE user_login = ?";


    public boolean isExist(String userLogin);

    public  void addUser(User user);

    public void deleteUserById(Integer id);

    public void deleteUserByLogin(String login);

    public  List<User> getAllUsers();

    public User getUserById(int index);

    public List<User> getUsersByRoleCaption(String caption);
}
