package com.dsj.wms.serviceimpl.userServiceImpl;

import com.dsj.wms.dao.userDao.UserMapper;
import com.dsj.wms.entity.User;
import com.dsj.wms.service.userService.UserService;
import com.dsj.wms.utils.Md5Util;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User userLogin(String userName, String userPassword) throws Exception {
        User user = null;
        boolean flag;
        user = userMapper.getLoginUser(userName);

        //匹配密码
        /*if (null != user) {
            if (!user.getUserPassword().equals(userPassword)) {
                user = null;
            }
        }*/

        //MD5+盐 匹配密码
        if (null != user) {
            String password = user.getUserPassword();
            flag = Md5Util.verify(userPassword, password);
            if (flag = true) {
                return user;
            } else {
                user = null;
            }
        }
        return user;
    }
}
