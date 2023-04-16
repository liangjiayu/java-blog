package com.me.blog.service.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.me.blog.dao.modal.User;
import com.me.blog.service.dto.UserDto;
import com.me.blog.service.dto.UserPageDto;

public interface IUserService {
    IPage<User> list(UserPageDto userPageDto);

    boolean create(UserDto userDto);

    boolean update(UserDto userDto);
}
