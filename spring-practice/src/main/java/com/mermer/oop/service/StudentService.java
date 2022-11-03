package com.mermer.oop.service;

import com.mermer.oop.repository.StudentRepository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class StudentService {
    final private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void printStudentName(String name){
        System.out.println("student name is " + studentRepository.getStudent(name).getName());
    }

    @PostConstruct
    public void init() {
        studentRepository.enroll("jack");
    }
}
