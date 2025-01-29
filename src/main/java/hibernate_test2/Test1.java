package hibernate_test2;

import hibernate_test2.entity.Employee;
import hibernate_test2.entity.Detail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        /*     TODO основнаий код який не треба видаляти       */
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
        /*     TODO основнаий код який не треба видаляти       */

            Employee employee = new Employee("Bill", "Murray", "cinema", 658468);
            Detail detail = new Detail("Los Angeles", "1651", "murray@gmail.com");
            employee.setDetail(detail);

            session.beginTransaction();
            session.save(employee);

            session.getTransaction().commit();
            System.out.println("+");
        } finally {
            factory.close();
        }
    }
}