package com.insart.traineeprogram.model;

/**
 * Created by Семья on 23.01.2016.
 */
public class Role {
    private Integer roleId;
    private String roleCaption;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleCaption() {
        return roleCaption;
    }

    public void setRoleCaption(String roleCaption) {
        this.roleCaption = roleCaption;
    }

    public String toString(){
        return getRoleId() + " " + getRoleCaption();
    }
}
