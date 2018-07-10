package com.jtsec.dao.mapper;

import com.jtsec.model.UsersRolesKey;

public interface UsersRolesMapper {
    int deleteByPrimaryKey(UsersRolesKey key);

    int insert(UsersRolesKey record);

    int insertSelective(UsersRolesKey record);
}