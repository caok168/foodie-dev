package com.imooc.service.impl;

import com.imooc.pojo.Stu;
import com.imooc.service.StuService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;

@Service
public class StuServiceImpl implements StuService {

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public Stu getStuInfo(int id) {

        return null;
    }

    @Override
    public void saveStu(){

    }

    @Override
    public void updateStu(){

    }

    @Override
    public void deleteStu(){

    }
}
