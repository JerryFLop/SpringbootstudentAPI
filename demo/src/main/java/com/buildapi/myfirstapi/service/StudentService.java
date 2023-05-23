package com.buildapi.myfirstapi.service;

import com.buildapi.myfirstapi.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {
    //Fake DB
    private List<Student> students = new ArrayList<>(
            Arrays.asList(new Student(6L,"mike", "Profile.jpg"),
                           new Student(8L,"luke", "profile.jpg"),
                            new Student(4L, "kim", "profile.jpg")

            )
    );

    //Create a method that will allow me to fetch all the students in my database
    public List<Student> getStudents(){
        return students;
    }

//Add a student to the FakeDB List
    public void addStudent(Student student){
        students.add(student);
    }




}
