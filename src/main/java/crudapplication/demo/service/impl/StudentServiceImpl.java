package crudapplication.demo.service.impl;

import crudapplication.demo.dao.StudentDao;
import crudapplication.demo.model.Student;
import crudapplication.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Transactional
    public void add(Student student) {
        studentDao.add(student);
    }

    @Transactional
    public void edit(Student student) {
        studentDao.edit(student);
    }

    @Transactional
    public void delete(int studentId) {
        studentDao.delete(studentId);
    }

    @Transactional
    public Student getStudent(int studentId) {
        return studentDao.getStudent(studentId);
    }

    @Transactional
    public List getAllStudent() {
        return studentDao.getAllStudent();
    }
}
