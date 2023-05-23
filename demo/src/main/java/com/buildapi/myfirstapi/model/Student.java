package com.buildapi.myfirstapi.model;
// POJO - model
public class Student {

    private long id;
    private  String name;
    private String Picture;

    public Student() {
    }

    public Student(long id, String name, String picture) {
        this.id = id;
        this.name = name;
        Picture = picture;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return Picture;
    }

    public void setPicture(String picture) {
        Picture = picture;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Picture='" + Picture + '\'' +
                '}';
    }
}
