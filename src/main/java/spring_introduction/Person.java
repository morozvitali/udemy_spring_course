package spring_introduction;

public class Person {
    private Pet pet;

//    public Person(Pet pet) {
//        System.out.println("Person bean created");
//    this.pet = pet;
//    }

    public Person() {
        System.out.println("Person bean created in constructor");
    }

    public void setPet (Pet pet) {
        this.pet = pet;
        System.out.println("Person set pet");
    }

    public void callYourPet() {
        System.out.println("Calling your pet");
        pet.say();
    }
}