package com.example.demo.common;

import lombok.Data;

@Data
public class RegisterDTO {
    private String email;
    private String password;
    private String password2;
    private String mobile;
    private String captcha;
}
