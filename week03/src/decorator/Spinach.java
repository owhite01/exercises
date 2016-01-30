package decorator;

public class Spinach implements Pizza{

    private Pizza pizza;

    public Spinach(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", Spinach(7.92) ";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 7.92;
    }
}
