package com.crosslab.blockchain.core.model;


import javax.persistence.*;

import com.crosslab.blockchain.core.model.base.BaseEntity;

@Entity
@Table(name="user")
public class UserEntity extends BaseEntity{
    private Long id;
    private String unitno;
    private String unittype;
    private String roletype;
    private String idnumber;
    private String usertype;
    private String name;
    private String password;
    private String ifcheck;

    public String getIfcheck() {
        return ifcheck;
    }
    public void setIfcheck(String ifcheck) {
        this.ifcheck = ifcheck;
    }

    public String getUnitno() {
        return unitno;
    }

    public void setUnitno(String unitno) {
        this.unitno = unitno;
    }

    public String getUnittype() {
        return unittype;
    }

    public void setUnittype(String unittype) {
        this.unittype = unittype;
    }

    public String getRoletype() {
        return roletype;
    }

    public void setRoletype(String roletype) {
        this.roletype = roletype;
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getId(){
        return id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", id=" + id +
                ", unitno='" + unitno + '\'' +
                ", unittype=" + unittype +
                ", roletype=" + roletype +
                ", idnumber='" + idnumber + '\'' +
                ", usertype=" + usertype +
                '}';
    }
}
