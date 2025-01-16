package practice.constructorDI;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
@Qualifier ("parmesan")
public class Parmesan extends Cheese {

    public Parmesan() {
        System.out.println("Cheese empty default Parmesan constructor");
    }

    public void doYamy () {
        System.out.println("Parmesan doYamy");
    }
}
