package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Talker talker = (Talker) context.getBean("myTalker", Talker.class);

        Person person = new Person(talker);
        person.callYourPet();

        context.close();

    }
}
