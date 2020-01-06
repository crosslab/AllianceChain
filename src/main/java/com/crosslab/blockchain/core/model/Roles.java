package com.crosslab.blockchain.core.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.crosslab.blockchain.core.model.base.BaseEntity;

@Entity
@Table(name = "roles")
public class Roles extends BaseEntity {

    private String name;
    private String role;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"name\":\"")
                .append(name).append('\"');
        sb.append(",\"role\":\"")
                .append(role).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
