package com.imooc.service.impl;

import com.imooc.mapper.StuMapper;
import com.imooc.pojo.Stu;
import com.imooc.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;

@Service
public class StuServiceImpl implements StuService {

    @Autowired
    private StuMapper stuMapper;

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public Stu getStuInfo(int id) {

        return stuMapper.selectByPrimaryKey(id);
    }

    @Override
    public void saveStu(){
        Stu stu = new Stu();
        stu.setName("caokai");
        stu.setAge(15);

        stuMapper.insert(stu);
    }

    @Override
    public void updateStu(int id){
        Stu stu = stuMapper.selectByPrimaryKey(id);
        stu.setAge(100);
        stuMapper.updateByPrimaryKeySelective(stu);
    }

    @Override
    public void deleteStu(int id){
        stuMapper.deleteByPrimaryKey(id);
    }
}
