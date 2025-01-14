package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Dog myDog = (Dog) context.getBean("myDog", Dog.class);
        myDog.say();

        context.close();
    }
}
