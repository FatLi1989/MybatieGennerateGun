package com.jtsec.model;

import java.io.Serializable;

/**
 * [STRATO MyBatis Generator]
 * Table: sys_users_roles
@mbggenerated do_not_delete_during_merge 2018-07-10 15:58:54
 */
public class UsersRolesKey implements Serializable {
    /**
     * Column: sys_users_roles.user_id
    @mbggenerated 2018-07-10 15:58:54
     */
    private Long userId;

    /**
     * Column: sys_users_roles.role_id
    @mbggenerated 2018-07-10 15:58:54
     */
    private Long roleId;

    /**
     * Table: sys_users_roles
    @mbggenerated 2018-07-10 15:58:54
     */
    private static final long serialVersionUID = 1L;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}