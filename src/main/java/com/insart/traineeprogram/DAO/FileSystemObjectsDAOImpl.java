package com.insart.traineeprogram.DAO;

import com.insart.traineeprogram.model.FileSystemObject;
import com.insart.traineeprogram.utils.MyDbConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static com.insart.traineeprogram.utils.DaoUtils.*;

/**
 * Created by ����� on 07.02.2016.
 */
public class FileSystemObjectsDAOImpl implements FileSystemObjectsDAO {

    public List<FileSystemObject> getFsObjects() {
        List<FileSystemObject> fsObjectList = new ArrayList<>();
        try (Connection connection = MyDbConnection.getConnection()) {
            ResultSet resultSet = executeQueryPreparedStatement(connection, GET_ALL_FS_OBJECTS);
            fsObjectList = parseResultSet(resultSet, fsObjectList, FileSystemObject.class);
        }catch (SQLException e){/*IGNORE*/}
        return fsObjectList;
    }

    public List<FileSystemObject> getFsObjectsByUserId(Integer userId) {
        ResultSet resultSet = null;
        List<FileSystemObject> fsObjectList = new ArrayList<>();
        try (Connection connection = MyDbConnection.getConnection()) {
            resultSet = executeQueryPreparedStatement(connection, GET_ALL_FS_OBJECTS_BY_USER_ID, "" + userId);
            fsObjectList = parseResultSet(resultSet, fsObjectList, FileSystemObject.class);
        }catch (SQLException e){/*IGNORE*/}
        return fsObjectList;
    }

    public FileSystemObject getFsObjectById(Integer id) {
        ResultSet resultSet = null;
        FileSystemObject fileSystemObject = null;
        try (Connection connection = MyDbConnection.getConnection()) {
            resultSet = executeQueryPreparedStatement(connection, GET_FS_OBJECT_BY_ID, "" + id);
            fileSystemObject = parseResultSet(resultSet, FileSystemObject.class);
        }catch (SQLException e){/*IGNORE*/}
        return fileSystemObject;
    }

    public void addFsObject(Integer objectTypeIdFk, Integer userIdFk, String fsObjectPath) {
        try (Connection connection = MyDbConnection.getConnection()) {
            executePreparedStatement(connection, ADD_FS_OBJECT, "" + objectTypeIdFk, "" + userIdFk, fsObjectPath);
        }catch (SQLException e){/*IGNORE*/}
    }

    public List<FileSystemObject> getFsObjectsByName(String name) {
        List<FileSystemObject> fsObjectList = new ArrayList<>();
        try (Connection connection = MyDbConnection.getConnection()) {
            ResultSet resultSet = executeQueryPreparedStatement(connection, GET_FS_OBJECTS_BY_NAME, "%" + name + "%");
            fsObjectList = parseResultSet(resultSet, fsObjectList, FileSystemObject.class);
        }catch (SQLException e){/*IGNORE*/}
        return  fsObjectList;
    }

    public List<FileSystemObject> getAllLinkedFsObjectsByUserId(Integer userId){
        List<FileSystemObject> list = new ArrayList<>();
        try (Connection connection = MyDbConnection.getConnection()) {
            ResultSet resultSet = executeQueryPreparedStatement(connection, GET_ALL_LINKED_FS_OBJECTS_BY_USER_ID, "" + userId);
            list = parseResultSet(resultSet, list, FileSystemObject.class);
        }catch (SQLException e){/*IGNORE*/}
        return  list;
    }

    public void deleteLinkByObjectId(Integer Id){
        try (Connection connection = MyDbConnection.getConnection()) {
            executePreparedStatement(connection, DELETE_LINK_BY_OBJECT_ID);
        }catch (SQLException e){/*IGNORE*/}
    }

    public void deleteLinkByObjectLink(String objectLink){
        try (Connection connection = MyDbConnection.getConnection()) {
            executePreparedStatement(connection, DELETE_LINK_BY_OBJECT_LINK);
        }catch (SQLException e){/*IGNORE*/}
    }

    public void deleteFsObjectById(int index) {
        try (Connection connection = MyDbConnection.getConnection()) {
            executePreparedStatement(connection, DELETE_FS_OBJECT_BY_ID, "" + index);
        }catch (SQLException e){/*IGNORE*/}
    }

    public void deleteFsObjectByPath(String caption) {
        try (Connection connection = MyDbConnection.getConnection()) {
            executePreparedStatement(connection, DELETE_FS_OBJECT_BY_PATH, caption);
        }catch (SQLException e){/*IGNORE*/}
    }
}
