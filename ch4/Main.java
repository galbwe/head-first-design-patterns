package ch4;

public class Main {
   public static void main(String[] args) {
       PizzaStore nyStore = new NyPizzaStore();
       placeOrders(nyStore);
       PizzaStore chStore = new ChPizzaStore();
       placeOrders(chStore);
   }

   static void placeOrders(PizzaStore store) {
        store.orderPizza("cheese");
        store.orderPizza("pepperoni");
        store.orderPizza("clam");
        store.orderPizza("veggie");
   }
}
