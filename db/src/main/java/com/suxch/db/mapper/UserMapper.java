package com.suxch.db.mapper;

import com.suxch.db.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User findUserById(int id);
}
