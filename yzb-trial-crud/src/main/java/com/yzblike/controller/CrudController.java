package com.yzblike.controller;


import com.yzblike.model.Member;
import com.yzblike.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/yzbTrial")
@CrossOrigin
public class CrudController {

    @Autowired
    private CrudService crudService;

    @RequestMapping("/helloWorld")
    public String helloWorld(){
        return "Hello world!";
    }

    // http://localhost:7071/yzbTrial/getAllMembers
    @RequestMapping("/getAllMembers")
    public List<Member> getAllMembers(){
        return crudService.getAllMembers();
    }

    @RequestMapping("/getMemberById")
    public Member getMemberById(@RequestParam("id") int id){
        return crudService.getMemberById(id);
    }


    // http://localhost:7071/yzbTrial/getMembersByPage?page=2&pageSize=5
    @RequestMapping("/getMembersByPage")
    public Map<String,Object> getMembersByPage(@RequestParam(value = "page") int page, @RequestParam(value = "pageSize") int pageSize){
        List<Member> membersByPage = crudService.getMembersByPage(page, pageSize);
        int count=crudService.getMembersCount();
        Map<String,Object> map=new HashMap<>();
        map.put("count",count);
        map.put("members",membersByPage);
        return map;
    }

}
