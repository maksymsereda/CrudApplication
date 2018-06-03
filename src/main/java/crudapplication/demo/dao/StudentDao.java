package crudapplication.demo.dao;

import crudapplication.demo.model.Student;

import java.util.List;

public interface StudentDao {
    void add(Student student);
    void edit(Student student);
    void delete(int studentId);
    Student getStudent(int studentId);
    List getAllStudent();
}
