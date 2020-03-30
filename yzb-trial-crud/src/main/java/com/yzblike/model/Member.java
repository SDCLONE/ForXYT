package com.yzblike.model;

import lombok.Data;

@Data
public class Member {
    int id;
    String name;
    int age;
    String gender;
    String pic_url;

    public Member(){

    }

    public Member(int id, String name, int age, String gender, String pic_url) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.pic_url = pic_url;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", pic_url='" + pic_url + '\'' +
                '}';
    }
}
