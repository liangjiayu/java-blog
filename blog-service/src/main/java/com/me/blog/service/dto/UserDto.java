package com.me.blog.service.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class UserDto {
    private long id;

    @NotBlank
    private String username;

    @NotBlank
    private String password;
}
