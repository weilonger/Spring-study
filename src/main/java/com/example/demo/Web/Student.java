package com.example.demo.Web;

import java.util.Date;

public class Student {
    private int id;
    private String username;
    private String password;
    private Date birth;

    Student(int id,String username,String password,Date birth){
        setId(id);
        setUsername(username);
        setPassword(password);
        setBirth(birth);
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", birth=" + birth +
                '}';
    }
}
