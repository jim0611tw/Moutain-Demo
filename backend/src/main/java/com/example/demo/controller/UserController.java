package com.example.demo.controller;

import com.example.demo.common.RegisterDTO;
import com.example.demo.model.UserModel;
import com.example.demo.service.UserService;
import com.example.demo.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/user")
public class UserController {

    @Autowired
    UserModel userModel;

    @Autowired
    UserService userService;

    @PostMapping("/register")
    ResultVo<UserModel> register(@RequestBody RegisterDTO registerDTO){
        ResultVo<UserModel> resultVo;
        UserModel user = userService.register(registerDTO);
        if(user != null){
            resultVo = new ResultVo<UserModel>(0, "regist success", user);
        }
        else {
            resultVo = new ResultVo<UserModel>(0, "regist fail", null);
        }
        return resultVo;
    }



    @PostMapping("/login")


    public void addUser(){
        userModel = new UserModel();
        userModel.setUserName("");
        userModel.setEmail("");
        userModel.setPassword("");
        userModel.setBiography("");
        userService.addUser(userModel);
    }

}
