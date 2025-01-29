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

        Session session = null;

        try {
            session = factory.getCurrentSession();
            session.beginTransaction();
        /*     TODO основнаий код який не треба видаляти       */


            Employee emp = session.get(Employee.class, 4);
            session.delete(emp);
/*
            Employee employee = new Employee("Arto", "Lindsay", "pop", 345);
            Detail detail = new Detail("Brasil", "1345345134", "arto@gmail.com");
            employee.setDetail(detail);


            Employee employee = new Employee("Aito", "Esay", "p", 3355);
            Detail detail = new Detail("Cil", "15345134", "qwo@gmail.com");
            employee.setDetail(detail);

*/


            //session.save(employee);

            session.getTransaction().commit();
            System.out.println("+");
        } finally {
            session.close();
            factory.close();
        }
    }
}