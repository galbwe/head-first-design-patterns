package ch3;
import ch3.Beverage;
import ch3.DarkRoast;

public class Main {
   public static void main(String[] args) {
      Beverage darkRoast = new DarkRoast();
      System.out.println("Dark roast: " + darkRoast.cost());
      darkRoast.setMilk(true);
      System.out.println("with milk: " + darkRoast.cost());
      darkRoast.setMocha(true);
      System.out.println("and mocha: " + darkRoast.cost());
      darkRoast.setWhip(true);
      System.out.println("oh and whipped please: " + darkRoast.cost());
   }
}
