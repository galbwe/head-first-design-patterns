package ch3;

import ch3.Beverage.Size;

public class Main {
   public static void main(String[] args) {
      try {
         Beverage darkRoast = new DarkRoast();
         System.out.println("dark roast: " + darkRoast.getDescription());
         System.out.println(" cost: " + darkRoast.cost());

         darkRoast.setSize(Size.GRANDE); Beverage darkRoastWithMilk = new Milk(darkRoast);
         System.out.println("dark roast with milk: " + darkRoastWithMilk.getDescription());
         System.out.println("cost: " + darkRoastWithMilk.cost());

         Beverage espresso = new Espresso();
         System.out.println("espresso: " + espresso.getDescription());
         System.out.println(" cost: " + espresso.cost());

         Beverage houseBlend = new Whip(new Soy(new Mocha(new HouseBlend())));
         System.out.println("gross drink: " + houseBlend.getDescription());
         System.out.println(" cost: " + houseBlend.cost());

         Beverage doubleMochaSoyLatte = new Mocha(new Mocha(new Soy(new Latte())));
         System.out.println("double mocha soy latte: " + doubleMochaSoyLatte.getDescription());
         System.out.println(" cost: " + doubleMochaSoyLatte.cost());
      } catch(Exception e) {
         System.out.println(e);
      }
   }
}
