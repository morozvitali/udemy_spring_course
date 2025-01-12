package spring_introduction;

public class Dog implements Talker{

    @Override
    public void say () {
        System.out.println("Dog says 'hello'");
    }
}
