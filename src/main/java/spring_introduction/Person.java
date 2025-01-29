package spring_introduction;

public class Person {
    private Talker talker;

    public Person(Talker talker) {
        this.talker = talker;
    }

    public void callYourPet(){
        System.out.println("Calling your pet");
        talker.say();
    }

}
