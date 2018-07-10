package com.jtsec.model;

import java.io.Serializable;

/**
 * [STRATO MyBatis Generator]
 * Table: sys_roles
@mbggenerated do_not_delete_during_merge 2018-07-10 15:58:54
 */
public class Roles implements Serializable {
    /**
     * Column: sys_roles.id
    @mbggenerated 2018-07-10 15:58:54
     */
    private Long id;

    /**
     * Column: sys_roles.role
    @mbggenerated 2018-07-10 15:58:54
     */
    private String role;

    /**
     * Column: sys_roles.description
    @mbggenerated 2018-07-10 15:58:54
     */
    private String description;

    /**
     * Column: sys_roles.available
    @mbggenerated 2018-07-10 15:58:54
     */
    private Boolean available;

    /**
     * Table: sys_roles
    @mbggenerated 2018-07-10 15:58:54
     */
    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
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