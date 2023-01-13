import dao.StudentDao;
import entity.Student;

public class Run {

    public static void main(String[] args) {
        Student student = new Student("kunal" , "pandey" , 9);
        StudentDao studentDao = new StudentDao();
//        studentDao.save(student);
        System.out.println(studentDao.getAll());
    }
}
