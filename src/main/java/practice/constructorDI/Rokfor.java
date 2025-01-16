package practice.constructorDI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
@Qualifier ("rokfor")
public class Rokfor extends Cheese {

    Rokfor() {
        System.out.println("Cheese empty default Rokfor constructor");
    }
    public void doYamy () {
        System.out.println("Rokfor doYamy");
    }
}
