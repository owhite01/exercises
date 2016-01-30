package decorator;

public class Chicken implements Pizza{
    private final Pizza pizza;

    public Chicken(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public String getDesc() {
        return pizza.getDesc() + ", Chicken (12.75)";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 12.75;
    }
}

