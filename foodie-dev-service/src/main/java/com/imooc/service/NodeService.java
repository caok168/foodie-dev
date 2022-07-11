package com.imooc.service;

import com.imooc.pojo.Nodes;
import java.util.List;

public interface NodeService {

    public Nodes getNodeInfo(int id);

    public List<Nodes> getList();

    public void saveNode();

    public void updateNode(int id);

    public void deleteNode(int id);
}
