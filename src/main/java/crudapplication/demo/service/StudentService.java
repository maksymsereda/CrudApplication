package crudapplication.demo.service;

import crudapplication.demo.model.Student;

import java.util.List;

public interface StudentService {
    void add(Student student);
    void edit(Student student);
    void delete(int studentId);
    Student getStudent(int studentId);
    List getAllStudent();
}
