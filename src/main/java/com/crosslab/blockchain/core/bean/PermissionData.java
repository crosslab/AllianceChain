package com.crosslab.blockchain.core.bean;

import java.util.List;

/**
 * @author crosslab wrote on 2018/4/10.
 */
public class PermissionData extends BaseData {
    private List<Permission> permissions;

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }
}
