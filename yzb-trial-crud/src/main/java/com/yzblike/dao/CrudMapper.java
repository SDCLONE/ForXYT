package com.yzblike.dao;

import com.yzblike.model.Member;

import java.util.List;

public interface CrudMapper {
    List<Member> getAllMembers();
    Member getMemberById(int id);
    List<Member> getMembersByPage(int start,int pageSize);
    int getMembersCount();
}
