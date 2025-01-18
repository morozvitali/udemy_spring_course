package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConf.class);

        Library library = (Library) context.getBean("library");
        library.getBook();
        context.close();

    }
}
