package com.crosslab.blockchain.core.model;


import javax.persistence.Entity;
import javax.persistence.Table;

import com.crosslab.blockchain.core.model.base.BaseEntity;

@Entity
@Table(name = "permission")
public class Permission extends BaseEntity {

    private String rid;
    private String url;
    private String role;

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
