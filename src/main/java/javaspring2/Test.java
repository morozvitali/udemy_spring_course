package javaspring2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Sandwich sandwich = context.getBean(Sandwich.class);
        sandwich.sayYammy();

        context.close();    
    }
}
