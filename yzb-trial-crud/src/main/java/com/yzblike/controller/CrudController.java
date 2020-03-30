package com.yzblike.controller;


import com.yzblike.model.Member;
import com.yzblike.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @RequestMapping("/getAllMembers")
    public List<Member> getAllMembers(){
        return crudService.getAllMembers();
    }
}
