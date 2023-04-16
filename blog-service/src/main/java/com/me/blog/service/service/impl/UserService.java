package com.me.blog.service.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.me.blog.dao.mapper.UserMapper;
import com.me.blog.dao.modal.User;
import com.me.blog.service.dto.UserDto;
import com.me.blog.service.dto.UserPageDto;
import com.me.blog.service.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public IPage<User> list(UserPageDto userPageDto) {
        Page<User> page = new Page<>(userPageDto.getPageNum(), userPageDto.getPageSize());
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();

        return this.userMapper.selectPage(page, queryWrapper);
    }

    @Override
    public boolean create(UserDto userDto) {
        return false;
    }

    @Override
    public boolean update(UserDto userDto) {
        return false;
    }
}
