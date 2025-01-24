package javaspring2;

public class Sandwich {
    private int id;
    private Cheese cheese;

    public Sandwich (Cheese cheese) {
        this.cheese = cheese;
        System.out.println("Sandwich created in parametred constructor");
    }

    public Sandwich () {
        System.out.println("Sandwich created in parametred constructor");
    }

    public void sayYammy () {
        System.out.println("Sandwich says yammy");
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
