package decorator;

public class Cheese implements Pizza{
    private final Pizza pizza;
    public Cheese(Pizza pizza) {
        this.pizza = pizza;

    }
    @Override
    public String getDesc() {
        return pizza.getDesc() + ", Cheese (20.72)";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 20.72;
    }
}
