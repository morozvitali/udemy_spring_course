package hibernate_one_to_many;

import hibernate_one_to_many.entity.Department;
import hibernate_one_to_many.entity.Employee;
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
            session = factory.getCurrentSession();
            session.beginTransaction();
        /*     TODO основнаий код який не треба видаляти


            Employee employee = new Employee("Bogdan", "Hmel", 1824);
            Employee employee1 = new Employee("Ivan", "Mazepa", 1924);
            Department department = new Department("Sich", 1156, 5164);
            employee.setDepartment(department);
            employee1.setDepartment(department);
            department.addEmployeeToDepartment(employee);
            department.addEmployeeToDepartment(employee1);
            session.save(department);

            Department department = session.get(Department.class, 3);
            System.out.println(department.getEmps());
   */

            Employee employee = session.get(Employee.class, 2);
            session.delete(employee);




            session.getTransaction().commit();
            System.out.println("+");
        } finally {
            session.close();
            factory.close();
        }
    }
}