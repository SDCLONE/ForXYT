package com.yzblike.service.impl;

import com.yzblike.dao.CrudMapper;
import com.yzblike.model.Member;
import com.yzblike.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrudServiceImpl implements CrudService {

    @Autowired
    private CrudMapper crudMapper;


    @Override
    public List<Member> getAllMembers() {
        return crudMapper.getAllMembers();
    }

    @Override
    public Member getMemberById(int id) {
        return crudMapper.getMemberById(id);
    }

    @Override
    public List<Member> getMembersByPage(int page, int pageSize) {
        return crudMapper.getMembersByPage((page-1)*pageSize,pageSize);
    }

    @Override
    public int getMembersCount() {
        return crudMapper.getMembersCount();
    }
}
