package com.dsj.wms.dao.userDao;

import com.dsj.wms.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    /**
     * 通过userName获取User
     *
     * @param userName
     * @return
     * @throws Exception
     */
    public User getLoginUser(@Param("userName") String userName) throws Exception;

    public int modifyPwd(@Param("id") Integer id, @Param("userPassword") String userPassword) throws Exception;
}
