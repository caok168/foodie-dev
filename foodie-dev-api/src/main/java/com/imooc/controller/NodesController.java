package com.imooc.controller;

import com.imooc.service.NodeService;
import com.imooc.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@RestController
@ApiIgnore
public class NodesController {
    @Autowired
    private NodeService nodeService;

    @GetMapping("/getNode")
    public Object getNode(int id) {
        return nodeService.getNodeInfo(id);
    }

    @GetMapping("/getList")
    public Object getList(){
        return nodeService.getList();
    }
}
