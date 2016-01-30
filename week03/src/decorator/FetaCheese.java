package decorator;

public class FetaCheese implements Pizza{
    public FetaCheese(Pizza pizza) {
    }

    @Override
    public String getDesc() {
        return null;
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
