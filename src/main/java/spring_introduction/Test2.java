package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Talker talker = (Talker) context.getBean("talker", Talker.class);
        talker.say();
        context.close();

    }
}
