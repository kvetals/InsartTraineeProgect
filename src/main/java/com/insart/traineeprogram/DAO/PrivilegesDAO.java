package com.insart.traineeprogram.DAO;

import com.insart.traineeprogram.model.Privilege;

import java.util.List;

/**
 * Created by Семья on 13.02.2016.
 */
public interface PrivilegesDAO {
    public static final String ADD_PRIVILEGE = "INSERT INTO privileges (privilege_caption) VALUES (?)";
    public static final String ADD_PRIVILEGE_BY_INDEX = "INSERT INTO privileges (privilege_id, privilege_caption) VALUES (?, ?)";

    public static final String GET_ALL_PRIVILEGES = "SELECT * FROM privileges";
    public static final String GET_PRIVILEGE_BY_ID = "SELECT * FROM privileges WHERE privilege_id = ?";
    public static final String GET_PRIVILEGE_BY_CAPTION = "SELECT * FROM privileges WHERE privilege_caption = ?";

    public static final String DELETE_PRIVILEGE_BY_ID = "DELETE FROM privileges WHERE privilege_id = ?";
    public static final String DELETE_PRIVILEGE_BY_CAPTION = "DELETE FROM privileges WHERE privilege_caption = ?";

    public List<Privilege> getPrivileges();

    public void addPrivilege(String caption);

    public void addPrivilegeByIndex(int index, String caption);

    public Privilege getPrivilegeById(Integer id);

    public Privilege getPrivilegeByCaption(String caption);

    public void deletePrivilegeById(int index);

    public void deletePrivilegeByCaption(String caption);
}
