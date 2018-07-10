package com.jtsec.model;

import java.io.Serializable;

/**
 * [STRATO MyBatis Generator]
 * Table: sys_permissions
@mbggenerated do_not_delete_during_merge 2018-07-10 15:58:54
 */
public class Permissions implements Serializable {
    /**
     * Column: sys_permissions.id
    @mbggenerated 2018-07-10 15:58:54
     */
    private Long id;

    /**
     * Column: sys_permissions.permission
    @mbggenerated 2018-07-10 15:58:54
     */
    private String permission;

    /**
     * Column: sys_permissions.description
    @mbggenerated 2018-07-10 15:58:54
     */
    private String description;

    /**
     * Column: sys_permissions.available
    @mbggenerated 2018-07-10 15:58:54
     */
    private Boolean available;

    /**
     * Table: sys_permissions
    @mbggenerated 2018-07-10 15:58:54
     */
    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission == null ? null : permission.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }
}