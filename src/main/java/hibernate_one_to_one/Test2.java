package hibernate_one_to_one;

import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
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

            Employee employee = session.get(Employee.class, 3);
            employee.setDetail(null);


            Detail detail = session.get(Detail.class, 3);
            session.delete(detail);
            //System.out.println(detail);
            //System.out.println(detail.getEmployee());


/*
            Employee employee = new Employee("Bet", "Men", "hero", 2435632);
            Detail detail = new Detail("city", "1wert4", "gfd@gmail.com");
            employee.setDetail(detail);
            detail.setEmployee(employee);


             TODO основнаий код який не треба видаляти       */


            session.getTransaction().commit();
            System.out.println("+");
        } finally {
            session.close();
            factory.close();
        }
    }
}