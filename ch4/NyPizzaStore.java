package ch4;

public class NyPizzaStore extends PizzaStore {
     public Pizza createPizza(String type) {
        Pizza pizza;
        if (type.equals("cheese")) {
            pizza = new NyStyle(new CheesePizza());
        } else if (type.equals("pepperoni")) {
            pizza = new NyStyle(new PepperoniPizza());
        } else if (type.equals("clam")) {
            pizza = new NyStyle(new ClamPizza());
        } else if (type.equals("veggie")) {
            pizza = new NyStyle(new VeggiePizza());
        } else {
            return null;
        }
        return pizza;
     }
}
