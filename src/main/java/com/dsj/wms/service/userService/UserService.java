package com.dsj.wms.service.userService;

import com.dsj.wms.entity.User;

public interface UserService {
    /**
     * 用户登录
     * @param userName
     * @param userPassword
     * @return
     */
    public User userLogin(String userName,String userPassword) throws Exception;

    public boolean modifyPwd() throws Exception;
}
