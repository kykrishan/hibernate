package dao;

import entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.SessionFactoryProvider;

import java.util.List;

public class StudentDao implements IDao<Student> {

    @Override
    public void save(Student student) {
        Transaction transaction = null;
            try (Session session = SessionFactoryProvider.provideSessionFactory().getCurrentSession()) {
                // start the transaction
                transaction = session.beginTransaction();

                // save student object
                session.save(student);

            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
                System.out.println(e);
            if (transaction != null) {
                transaction.rollback();
            }
        }

    }

    @Override
    public void update(Student student) {
        Transaction transaction = null;
        try  {
            Session session = SessionFactoryProvider.provideSessionFactory().getCurrentSession();
            // start the transaction
            transaction = session.beginTransaction();

            // save student object
            session.saveOrUpdate(student);

            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

    @Override
    public Student getById(long id) {
        Transaction transaction = null;
        Student student = null;
        try  {
            Session session = SessionFactoryProvider.provideSessionFactory().getCurrentSession();
            // start the transaction
            transaction = session.beginTransaction();

            // get student object
            student =  session.get(Student.class, id);
            //student = session.load(Student.class, id);
            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
        return student;
    }

    @Override
    public List<Student> getAll() {
        Transaction transaction = null;
        List < Student > students = null;
        try  {
            Session session = SessionFactoryProvider.provideSessionFactory().getCurrentSession();
            // start the transaction
            transaction = session.beginTransaction();

            // get students
            students = session.createQuery("from Student").list();
//            student = session.load(Student.class, id);
            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
        return students;
    }

    @Override
    public void delete(long id) {
        Transaction transaction = null;
        Student student = null;
        try  {
            Session session = SessionFactoryProvider.provideSessionFactory().getCurrentSession();
            // start the transaction
            transaction = session.beginTransaction();

            student =  session.get(Student.class, id);
            // get student object
            session.delete(student);
            //student = session.load(Student.class, id);
            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }
}
