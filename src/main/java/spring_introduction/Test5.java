package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


        Person person = (Person) context.getBean("personBean", Person.class);
        person.callYourPet();

        //Cat myCat = context.getBean("catBean", Cat.class);
        //myCat.say();

        context.close();
    }
}
