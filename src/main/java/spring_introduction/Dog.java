package spring_introduction;

public class Dog implements Pet {

    public Dog() {
        System.out.println("Dog bean created");
    }

    @Override
    public void say () {
        System.out.println("Dog says 'hello'");
    }

    public void init () {
        System.out.println("Dog init method");
    }

    public void destroy () {
        System.out.println("Dog destroy method");
    }
}
