package practice.constructorDI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main12 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appPractContext12.xml");


        Sandwich sandwich = (Sandwich) context.getBean("sandwich", Sandwich.class);
        Cheese cheese = (Cheese) context.getBean("cheese", Cheese.class);
        sandwich.anyMethod(cheese);
        sandwich.eatSandvich();
        context.close();
    }
}

// creating di using properties file