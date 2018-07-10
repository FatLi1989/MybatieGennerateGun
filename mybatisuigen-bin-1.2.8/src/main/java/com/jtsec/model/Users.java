package com.jtsec.model;

import java.io.Serializable;

/**
 * [STRATO MyBatis Generator]
 * Table: sys_users
@mbggenerated do_not_delete_during_merge 2018-07-10 15:58:54
 */
public class Users implements Serializable {
    /**
     * Column: sys_users.id
    @mbggenerated 2018-07-10 15:58:54
     */
    private Long id;

    /**
     * Column: sys_users.username
    @mbggenerated 2018-07-10 15:58:54
     */
    private String username;

    /**
     * Column: sys_users.password
    @mbggenerated 2018-07-10 15:58:54
     */
    private String password;

    /**
     * Column: sys_users.salt
    @mbggenerated 2018-07-10 15:58:54
     */
    private String salt;

    /**
     * Column: sys_users.locked
    @mbggenerated 2018-07-10 15:58:54
     */
    private Boolean locked;

    /**
     * Table: sys_users
    @mbggenerated 2018-07-10 15:58:54
     */
    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }
}