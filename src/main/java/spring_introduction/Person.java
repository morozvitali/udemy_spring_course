package spring_introduction;

public class Person {
    private Talker talker;

    public Person(Talker talker) {
        System.out.println("Person bean created");
    this.talker = talker;



    }

    public void callYourPet() {
        System.out.println("Calling your pet");
        talker.say();
    }
}
