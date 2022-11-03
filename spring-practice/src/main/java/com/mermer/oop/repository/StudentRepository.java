package com.mermer.oop.repository;

import com.mermer.oop.vo.Student;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class StudentRepository {

    private final Map<String, Student> storage;

    public StudentRepository(Map<String, Student> storage) {
        this.storage = storage;
    }

    @Cacheable("student")
    public Student getStudent(String name){
        System.out.println("repo + 병목구간");
        return storage.get(name);
    }

    public Student enroll(String name) {
        return storage.put(name, new Student(name));
    }
}
