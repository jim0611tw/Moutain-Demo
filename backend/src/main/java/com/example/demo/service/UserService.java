package com.example.demo.service;

import com.example.demo.common.RegisterDTO;
import com.example.demo.model.UserModel;
import com.example.demo.qo.LoginQo;
import com.example.demo.repository.UserRepository;
import com.example.demo.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    UserModel register(RegisterDTO registerDTO);

    String login(LoginQo loginQo);

    UserVo getUserInfo(String userId);

    /**
     * 取得用戶詳情(主要是判定權限)
     */
    //UserInfoVo getInfo(String userId);


}
