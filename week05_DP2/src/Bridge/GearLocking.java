package Bridge;


public class GearLocking implements Product {
    private String product;

    public GearLocking(String productName) {
        this.product = productName;
    }

    @Override
    public void produce() {
        System.out.println("Producing " + this.product);
    }




    @Override
    public String productName() {
        return product;
    }
}
