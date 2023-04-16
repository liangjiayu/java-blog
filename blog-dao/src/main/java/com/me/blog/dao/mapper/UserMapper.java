package com.me.blog.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.me.blog.dao.modal.User;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {
    List<User> getUserList();
}
