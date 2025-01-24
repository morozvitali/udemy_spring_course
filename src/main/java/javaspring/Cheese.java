package javaspring;

import org.springframework.stereotype.Component;

@Component
public class Cheese {

    public Cheese() {
        System.out.println("Cheese created in default constructor");
    }
}
