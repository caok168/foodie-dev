package com.imooc.service;

import com.imooc.pojo.Userinfo;
import com.imooc.pojo.bo.UserBO;

public interface UserService {

    /**
     * 判断用户名是否存在
     * @param usernam
     * @return
     */
    public boolean queryUsernameIsExist(String usernam);

    public Userinfo createUser(UserBO userBO);
}
