package com.zero.springboot.beans;

/**
 * @author zero
 * @description User
 * @date 2022/8/20 12:52
 */
public class User {
    private String username = "Lucifer";
    private int age = 100;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

