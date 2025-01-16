package practice.constructorDI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main9 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appPractContext9.xml");
        Sandwich sandwich = (Sandwich) context.getBean("mySandwich", Sandwich.class);
        sandwich.eatSandvich();
        context.close();
    }
}


// creating di using fields and other