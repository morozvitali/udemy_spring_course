package javaspring;

import org.springframework.stereotype.Component;

@Component
public class Sandwich {
    private int id;
    private Cheese cheese;


    public Sandwich () {
        System.out.println("Sandwich created in parametred constructor");
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cheese getCheese() {
        return cheese;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }
}
