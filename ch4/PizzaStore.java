package ch4;

public class PizzaStore {
    static SimplePizzaFactory factory = new SimplePizzaFactory();
    public static void main(String[] args) {
        makePizza("cheese");
        makePizza("pepperoni");
        makePizza("clam");
        makePizza("veggie");
    }

    static void makePizza(String type) {
        Pizza pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
