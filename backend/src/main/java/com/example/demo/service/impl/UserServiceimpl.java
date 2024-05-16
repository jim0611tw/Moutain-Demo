package com.example.demo.service.impl;

import com.example.demo.common.RegisterDTO;
import com.example.demo.model.UserModel;
import com.example.demo.qo.LoginQo;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import com.example.demo.vo.UserVo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserServiceimpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserModel register(RegisterDTO registerDTO){
        try {
            UserModel userModel = new UserModel();
            userModel.setUserName(registerDTO.getMobile());
            userModel.setEmail(registerDTO.getEmail());
            userModel.setPassword(registerDTO.getPassword());
            userRepository.save(userModel);
            return userModel;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String login(LoginQo loginQo){
        return "";
    }

    public UserVo getUserInfo(String userId){
        UserVo userVo = null;
        return userVo;
    }

}
