package com.yzblike.dao;

import com.yzblike.model.Member;

import java.util.List;

public interface CrudMapper {
    List<Member> getAllMembers();
}
