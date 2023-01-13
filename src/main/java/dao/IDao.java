package dao;

import entity.Student;

import java.util.List;

public interface IDao<t>{

    void save(t a);

    void update(t a);

    Student getById(long id);

    List<Student> getAll();

    void delete(long id);
}
