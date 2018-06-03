package crudapplication.demo.dao.impl;

import crudapplication.demo.dao.StudentDao;
import crudapplication.demo.model.Student;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao {

    private final SessionFactory session;

    @Autowired
    public StudentDaoImpl(SessionFactory session) {
        this.session = session;
    }

    @Override
    public void add(Student student) {
        session.getCurrentSession().save(student);
    }

    @Override
    public void edit(Student student) {
        session.getCurrentSession().update(student);
    }

    @Override
    public void delete(int studentId) {
        session.getCurrentSession().delete(getStudent(studentId));
    }

    @Override
    public Student getStudent(int studentId) {
        return (Student)session.getCurrentSession().get(Student.class, studentId);
    }

    @Override
    public List getAllStudent() {
        return session.getCurrentSession().createQuery("from Student").list();
    }
}
