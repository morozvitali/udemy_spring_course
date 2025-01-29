package spring_introduction;

public class Cat implements Talker {

    public Cat() {
        System.out.println("Cat bean created");
    }

    public void say() {
        System.out.println("I am a Cat and i'm talking");
    }
}
