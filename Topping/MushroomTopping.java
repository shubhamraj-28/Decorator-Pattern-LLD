package Topping;

import Pizzas.BasePizza;

public class MushroomTopping extends ToppingDecorator{
    public MushroomTopping(BasePizza pizza){
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + Mushroom Topping";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 40;
    }
}
