package hibernate_lazy_and_eager;

import hibernate_lazy_and_eager.entity.Department;
import hibernate_lazy_and_eager.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        /*     TODO основнаий код який не треба видаляти      */
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
        Session session = null;

        try {

            //
        /*     TODO основнаий код який не треба видаляти     */

            session = factory.getCurrentSession();
            Department department = new Department("unit", 1134, 8234);

            Employee employee = new Employee("Bill", "Evans", 2544);
            Employee employee1 = new Employee("Bob", "Bobins", 4454);

            employee.setDepartment(department);
            employee1.setDepartment(department);
            department.addEmployeeToDepartment(employee);
            department.addEmployeeToDepartment(employee1);

            session.beginTransaction();
            session.save(department);

            //Department department = session.get(Department.class, 3);
            //System.out.println(department.getEmps());
            //Employee employee = session.get(Employee.class, 2);
            //session.delete(employee);

            session.getTransaction().commit();
            System.out.println("+");
        } finally {
            session.close();
            factory.close();
        }
    }
}