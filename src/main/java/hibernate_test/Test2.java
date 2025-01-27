package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();

            Employee employee = new Employee
                    ("Diablo", "Two", "hell", 666);
            session.beginTransaction();
            session.save(employee);
            // session.getTransaction().commit();

            int myId = employee.getId();
            // session = factory.getCurrentSession();
            // session.beginTransaction();
            Employee getgetEmployee = session.get(Employee.class, myId);
            session.getTransaction().commit();
            System.out.println(getgetEmployee);
            System.out.println("Connection is done >|<");

        } finally {
            factory.close();
        }
    }
}
