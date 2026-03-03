package Pizzas;

public class VegDelight implements BasePizza{
    @Override
    public String getDescription() {
        return "Veg Delight";
    }

    @Override
    public int getCost() {
        return 250;
    }
}
