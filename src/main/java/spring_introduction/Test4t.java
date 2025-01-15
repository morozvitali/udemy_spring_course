package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4t {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


        //context.start();
        Cat myCat = context.getBean("catBean", Cat.class);
        myCat.say();
        context.close();




    }
}
