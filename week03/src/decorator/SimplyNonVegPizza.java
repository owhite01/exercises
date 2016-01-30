package decorator;

public class SimplyNonVegPizza implements Pizza {
    @Override
    public String getDesc() {
        return "SimplyNonVegPizza";
    }

    @Override
    public double getPrice() {
        return 350.00;
    }
}
