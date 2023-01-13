package util;

import entity.Student;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryProvider {
    public static SessionFactory provideSessionFactory()
    {
        Configuration config = null;
        try{
            config=new Configuration().configure();
        }catch(HibernateException exception){
            exception.printStackTrace();
        }
        return config
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();
    }
}
