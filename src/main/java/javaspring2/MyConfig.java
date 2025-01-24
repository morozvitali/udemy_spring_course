package javaspring2;

import javaspring2.Sandwich;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean(name = "sandwich")


    public Sandwich makeSandwich() {
        return new Sandwich();
    }
//    @Bean(name = "Cheese")
//    public Cheese makeCheese () {
//        return new Cheese ();
//    }
}
