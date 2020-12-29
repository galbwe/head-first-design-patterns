package ch4;

public class ChPizzaStore extends PizzaStore {
     public Pizza createPizza(String type) {
        Pizza pizza;
        if (type.equals("cheese")) {
            pizza = new ChStyle(new CheesePizza());
        } else if (type.equals("pepperoni")) {
            pizza = new ChStyle(new PepperoniPizza());
        } else if (type.equals("clam")) {
            pizza = new ChStyle(new ClamPizza());
        } else if (type.equals("veggie")) {
            pizza = new ChStyle(new VeggiePizza());
        } else {
            return null;
        }
        return pizza;
     }
}
