package Topping;

import Pizzas.BasePizza;

public class CheeseTopping extends ToppingDecorator{
    public CheeseTopping(BasePizza pizza){
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + Extra Cheese";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 20;
    }
}
