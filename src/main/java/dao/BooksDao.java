package dao;

import entity.Books;
import entity.Student;
import org.hibernate.Session;
import util.HibernateUtil;

import javax.transaction.Transaction;
import java.util.List;

public class BooksDao implements IDao<Books> {
    @Override
    public void save(Books books) {

    }

    @Override
    public void update(Books a) {

    }

    @Override
    public Student getById(long id) {
        return null;
    }

    @Override
    public List<Student> getAll() {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
