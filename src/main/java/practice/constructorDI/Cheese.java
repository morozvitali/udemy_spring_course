package practice.constructorDI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Cheese {

    Cheese() {
        System.out.println("Cheese empty default constructor");
    }
}
