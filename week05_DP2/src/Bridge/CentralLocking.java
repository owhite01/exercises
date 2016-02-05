package Bridge;


public class CentralLocking implements Product {
    private String product;

    public CentralLocking(String productName) {
        this.product = productName;
    }

    @Override
    public void produce() {
        System.out.println("Producing Central Locking System");
    }




    @Override
    public String productName() {
        return product;
    }

}
