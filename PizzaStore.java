import Pizzas.BasePizza;
import Pizzas.PlainPizza;
import Topping.CheeseTopping;
import Topping.MushroomTopping;

public class PizzaStore {

      public static void main(String[] args){

        //Create Base Plain Pizza
        BasePizza pizza1 = new PlainPizza();
        System.out.println("Order 1: " + pizza1.getDescription() + "Bill: " + pizza1.getCost() );

        //Add Topping of cheese to it
        BasePizza pizza2 = new CheeseTopping(pizza1);
        System.out.println("Order 2: " + pizza2.getDescription() + "Bill: " + pizza2.getCost() );

        //Add Topping of mushroom to pizza2
        BasePizza pizza3 = new MushroomTopping(pizza2);
        System.out.println("Order 3: " + pizza3.getDescription() + "Bill: " + pizza3.getCost() );
      }




  }