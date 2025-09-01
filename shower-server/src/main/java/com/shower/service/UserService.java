package com.shower.service;

import com.shower.dto.UserLoginDTO;
import com.shower.entity.User;

public interface UserService {

    /**
     * 微信登录
     * @param userLoginDTO
     * @return
     */
    User wxLogin (UserLoginDTO userLoginDTO);
}
