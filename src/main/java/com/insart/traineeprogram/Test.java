package com.insart.traineeprogram;

import com.insart.traineeprogram.DAO.FileSystemObjectsDAO;
import com.insart.traineeprogram.DAO.FileSystemObjectsDAOImpl;
import com.insart.traineeprogram.DAO.InitDestroyDAO;
import com.insart.traineeprogram.DAO.InitDestroyDAOImpl;
import com.insart.traineeprogram.service.UserService;

/**
 * Created by Семья on 13.02.2016.
 */
public class Test {
    public static void main(String[] args) {
        FileSystemObjectsDAO fsDAO = new FileSystemObjectsDAOImpl();
//        MyDbConnection.checkConnection();
//        System.out.println(fsDAO.getFsObjects());
//        MyDbConnection.checkConnection();
//        System.out.println(fsDAO.getFsObjectById(8));
//        MyDbConnection.checkConnection();
//        System.out.println(fsDAO.getFsObjectsByName("name"));
//        InitDestroyDAO initDestroy = new InitDestroyDAOImpl();
//        initDestroyDAO.initDb();
//        initDestroy.destroyDb();
        boolean result = UserService.registerNewUser("kvetal", "1111", "kvetal@gmail.com", 2);
        System.out.println(result);
        result = UserService.registerNewUser("kvetal", "2222", "kvetals@yahoo.com", 2);
        System.out.println(result);

    }
}
