package com.jtsec.dao.mapper;

import com.jtsec.model.RolesPermissionsKey;

public interface RolesPermissionsMapper {
    int deleteByPrimaryKey(RolesPermissionsKey key);

    int insert(RolesPermissionsKey record);

    int insertSelective(RolesPermissionsKey record);
}