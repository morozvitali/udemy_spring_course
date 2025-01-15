package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {

    private Pet pet;
    private int age;
    private String name;
    private String surname;

//    @Autowired
//    public Person(Pet pet) {
//        System.out.println("Person bean created");
//    this.pet = pet;
//    }

    public Person() {
        System.out.println("Person bean created");
    }

    @Autowired
    public void setPet (@Qualifier("dogBean") Pet pet) {
        this.pet = pet;
        System.out.println("Person set pet");
    }


//    public void methodSomeNameForTest (Pet pet) {
//        this.pet = pet;
//        System.out.println("Some method name => Person set pet");
//    }



    public void callYourPet() {
        System.out.println("Calling your pet");
        pet.say();
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Pet getPet() {
        return pet;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}