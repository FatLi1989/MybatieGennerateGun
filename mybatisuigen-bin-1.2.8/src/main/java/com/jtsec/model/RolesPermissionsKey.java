package com.jtsec.model;

import java.io.Serializable;

/**
 * [STRATO MyBatis Generator]
 * Table: sys_roles_permissions
@mbggenerated do_not_delete_during_merge 2018-07-10 15:58:54
 */
public class RolesPermissionsKey implements Serializable {
    /**
     * Column: sys_roles_permissions.role_id
    @mbggenerated 2018-07-10 15:58:54
     */
    private Long roleId;

    /**
     * Column: sys_roles_permissions.permission_id
    @mbggenerated 2018-07-10 15:58:54
     */
    private Long permissionId;

    /**
     * Table: sys_roles_permissions
    @mbggenerated 2018-07-10 15:58:54
     */
    private static final long serialVersionUID = 1L;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }
}