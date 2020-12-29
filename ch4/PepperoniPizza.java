package ch4;

public class PepperoniPizza extends Pizza {
     void prepare() {
        System.out.println("Prepraing pepperoni pizza.");
    }

    void bake() {
        System.out.println("Baking pepperoni pizza");
    }

    void cut() {
        System.out.println("Cutting pepperoni pizza.");
    }

    void box() {
        System.out.println("Boxing pepperoni pizza.");
    }
}
