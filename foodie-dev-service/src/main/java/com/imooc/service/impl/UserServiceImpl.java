package com.imooc.service.impl;

import com.imooc.enums.Sex;
import com.imooc.mapper.UserinfoMapper;
import com.imooc.pojo.Userinfo;
import com.imooc.pojo.bo.UserBO;
import com.imooc.service.UserService;
import com.imooc.utils.DateUtil;
import com.imooc.utils.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    public UserinfoMapper userinfoMapper;

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public boolean queryUsernameIsExist(String username) {
        Example example = new Example(Userinfo.class);
        Example.Criteria userCriteria = example.createCriteria();
        userCriteria.andEqualTo("username", username);

        Userinfo result = userinfoMapper.selectOneByExample(example);

        return result == null ? false: true;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public Userinfo createUser(UserBO userBO) {

        Userinfo user = new Userinfo();
        user.setUsername(userBO.getUsername());
        try{
            user.setPassword(MD5Utils.getMD5Str(userBO.getPassword()));
        } catch (Exception e){
            e.printStackTrace();
        }
        user.setFace("");
        // 设置默认生日
        user.setBirthday(DateUtil.stringToDate("1900-01-01"));
        user.setSex(Sex.secret.type);

        user.setCreatedTime(new Date());
        user.setUpdatedTime(new Date());

        userinfoMapper.insert(user);

        return null;
    }
}
