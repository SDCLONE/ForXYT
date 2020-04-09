package com.yzblike.service;

import com.yzblike.model.Member;

import java.util.List;

public interface CrudService {
    List<Member> getAllMembers();
    Member getMemberById(int id);
    List<Member> getMembersByPage(int page,int pageSize);
    int getMembersCount();
}
