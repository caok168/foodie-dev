package com.imooc.service.impl;

import com.imooc.mapper.NodesMapper;
import com.imooc.pojo.Nodes;
import com.imooc.service.NodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class NodesServiceImpl implements NodeService {

    @Autowired
    private NodesMapper nodesMapper;

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public Nodes getNodeInfo(int id) {

        return nodesMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Nodes> getList() {
        return nodesMapper.selectAll();
    }

    @Override
    public void saveNode() {

    }

    @Override
    public void updateNode(int id) {

    }

    @Override
    public void deleteNode(int id) {

    }
}
