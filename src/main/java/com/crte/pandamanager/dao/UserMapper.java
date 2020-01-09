package com.crte.pandamanager.dao;

import com.crte.pandamanager.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> getUserList();
}
