package com.insart.traineeprogram.utils;

import java.util.ResourceBundle;

/**
 * Created by Семья on 04.02.2016.
 */
public class Requests {

    public static ResourceBundle resourceBundle = ResourceBundle.getBundle("sqlstatements");

//    Roles table
    public static final String ADD_ROLE = resourceBundle.getString("ADD_ROLE");
    public static final String ADD_ROLE_BY_INDEX = resourceBundle.getString("ADD_ROLE_BY_INDEX");
    public static final String DELETE_ROLE_BY_ID = resourceBundle.getString("DELETE_ROLE_BY_ID");
    public static final String DELETE_ROLE_BY_CAPTION = resourceBundle.getString("DELETE_ROLE_BY_CAPTION");
    public static final String GET_ALL_ROLES = resourceBundle.getString("GET_ALL_ROLES");
    public static final String GET_ROLE_BY_ID = resourceBundle.getString("GET_ROLE_BY_ID");
    public static final String GET_ROLE_BY_CAPTION = resourceBundle.getString("GET_ROLE_BY_CAPTION");


    public static final String INITIAL_ADMIN_ROLE = resourceBundle.getString("INITIAL_ADMIN_ROLE");
    public static final String INITIAL_USER_ROLE = resourceBundle.getString("INITIAL_USER_ROLE");

//    Privileges table
    public static final String ADD_PRIVILEGE = resourceBundle.getString("ADD_PRIVILEGE");
    public static final String DELETE_PRIVILEGE_BY_ID = resourceBundle.getString("DELETE_PRIVILEGE_BY_ID");
    public static final String DELETE_PRIVILEGE_BY_CAPTION = resourceBundle.getString("DELETE_PRIVILEGE_BY_CAPTION");
    public static final String GET_ALL_PRIVILEGES = resourceBundle.getString("GET_ALL_PRIVILEGES");
    public static final String ADD_PRIVILEGE_BY_INDEX = resourceBundle.getString("ADD_PRIVILEGE_BY_INDEX");
    public static final String GET_PRIVILEGE_BY_ID = resourceBundle.getString("GET_PRIVILEGE_BY_ID");
    public static final String GET_PRIVILEGE_BY_CAPTION = resourceBundle.getString("GET_PRIVILEGE_BY_CAPTION");

//    Users table
    public static final String GET_ALL_USERS = resourceBundle.getString("GET_ALL_USERS");
    public static final String GET_USER_BY_EMAIL = resourceBundle.getString("GET_USER_BY_EMAIL");
    public static final String GET_USER_BY_ID = resourceBundle.getString("GET_USER_BY_ID");
    public static final String GET_USER_BY_LOGIN = resourceBundle.getString("GET_USER_BY_LOGIN");
    public static final String GET_USER_WHERE_LOGIN_AND_PASSWORD = resourceBundle.getString("GET_USER_WHERE_LOGIN_AND_PASSWORD");
    public static final String GET_USERS_BY_ROLE_CAPTION = resourceBundle.getString("GET_USERS_BY_ROLE_CAPTION");

    public static final String CREATE_NEW_USER = resourceBundle.getString("CREATE_NEW_USER");
    public static final String DELETE_USER_BY_ID = resourceBundle.getString("DELETE_USER_BY_ID");
    public static final String DELETE_USER_BY_LOGIN = resourceBundle.getString("DELETE_USER_BY_LOGIN");




//    Objects table
    public static final String GET_ALL_OBJECTS = resourceBundle.getString("GET_ALL_USERS");

//    ObjectTypes table
    public static final String ADD_OBJECT_TYPE = resourceBundle.getString("ADD_OBJECT_TYPE");
    public static final String DELETE_OBJECT_TYPE_BY_ID = resourceBundle.getString("DELETE_OBJECT_TYPE_BY_ID");
    public static final String DELETE_OBJECT_TYPE_BY_CAPTION = resourceBundle.getString("DELETE_OBJECT_TYPE_BY_CAPTION");
    public static final String GET_ALL_OBJECT_TYPES = resourceBundle.getString("GET_ALL_OBJECT_TYPES");
    public static final String ADD_OBJECT_TYPE_BY_INDEX = resourceBundle.getString("ADD_OBJECT_TYPE_BY_INDEX");
    public static final String GET_OBJECT_TYPE_BY_ID = resourceBundle.getString("GET_OBJECT_TYPE_BY_ID");
    public static final String GET_OBJECT_TYPE_BY_CAPTION = resourceBundle.getString("GET_OBJECT_TYPE_BY_CAPTION");

//    FsObjects table
    public static final String ADD_FS_OBJECT = resourceBundle.getString("ADD_FS_OBJECT");
    public static final String DELETE_FS_OBJECT_BY_ID = resourceBundle.getString("DELETE_FS_OBJECT_BY_ID");
    public static final String DELETE_FS_OBJECT_BY_PATH = resourceBundle.getString("DELETE_FS_OBJECT_BY_PATH");
    public static final String GET_ALL_FS_OBJECTS = resourceBundle.getString("GET_ALL_FS_OBJECTS");
    public static final String GET_ALL_FS_OBJECTS_BY_USER_ID = resourceBundle.getString("GET_ALL_FS_OBJECTS_BY_USER_ID");
    public static final String GET_FS_OBJECT_BY_ID = resourceBundle.getString("GET_FS_OBJECT_BY_ID");
    public static final String GET_FS_OBJECTS_BY_PATH = resourceBundle.getString("GET_FS_OBJECTS_BY_PATH");

}
