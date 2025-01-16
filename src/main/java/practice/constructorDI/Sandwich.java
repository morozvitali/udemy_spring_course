package practice.constructorDI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Sandwich {
//@Autowired
//@Qualifier("rokfor")
    private Cheese cheese;
    private int price;
    private int weight;
    private Ham ham;



//    public Sandwich(Cheese cheese) {
//        this.cheese = cheese;
//        System.out.println("Sandwich constructor");
//    }

    public Sandwich () {
        System.out.println("Sandwich empty default constructor");
    }

    public void eatSandvich () {
        System.out.println("Client eats sandvich :");
        System.out.println("---------------------------------------");
        System.out.println("Sandwich price is " + price);
        System.out.println("Sandwich weight is " + weight);
        System.out.println("Sandwich cheese is " + cheese);
        System.out.println("Sandwich Ham is " + ham);
        System.out.println("---------------------------------------");
    }

    public Cheese getCheese() {
        return cheese;
    }


    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    @Autowired
    public void anyMethod (@Qualifier ("parmesan") Cheese cheese) {
        this.cheese = cheese;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    public Ham getHam() {
        return ham;
    }

    public void setHam(Ham ham) {
        this.ham = ham;
    }
}
