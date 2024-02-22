package com.simple.command;

import java.util.ArrayList;

public class MemberVo {
    private String id;
    private String name;
    private ArrayList<String> inter;
    private int age;

    @Override
    public String toString() {
        return "MemberVo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", inter=" + inter +
                ", age=" + age +
                '}';
    }

    public MemberVo(String id, String name, ArrayList<String> inter, int age) {
        this.id = id;
        this.name = name;
        this.inter = inter;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getInter() {
        return inter;
    }

    public void setInter(ArrayList<String> inter) {
        this.inter = inter;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
