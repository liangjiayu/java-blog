package com.me.blog.service.dto;

import lombok.Data;

@Data
public class UserPageDto {
    Integer pageNum = 1;
    Integer pageSize = 10;
}
