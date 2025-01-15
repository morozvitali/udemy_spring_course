package spring_introduction;
import org.springframework.stereotype.Component;

@Component("dogBean")
public class Dog implements Pet {

    public Dog() {
        System.out.println("Dog bean created");
    }

    @Override
    public void say() {
        System.out.println("Dog says 'hello'");
    }
}