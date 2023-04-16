package com.me.blog.web.controller;

import com.me.blog.common.api.CommonResult;
import com.me.blog.service.dto.UserPageDto;
import com.me.blog.service.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    IUserService userService;

    @RequestMapping(path = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult list(UserPageDto userPageDto) {
        return CommonResult.success(this.userService.list(userPageDto));
    }

    @RequestMapping(path = "/getUserList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getUserList() {
        return CommonResult.success(this.userService.getUserList());
    }
}
