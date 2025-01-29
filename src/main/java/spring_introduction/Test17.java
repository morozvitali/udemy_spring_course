package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test17 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = (Person) context.getBean("personBean");
        person.callYourPet();
        context.close();
    }
}
