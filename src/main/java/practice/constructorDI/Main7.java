package practice.constructorDI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main7 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appPractContext.xml");
        Sandwich sandwich = (Sandwich) context.getBean("mySandwich", Sandwich.class);
        sandwich.eatSandvich();
        context.close();
    }
}


// Створити Di за допомогою конструктора