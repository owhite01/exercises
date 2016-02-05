package Bridge;

/**
 * Created by OliverW on 05/02/2016.
 */
public class CentralLocking implements Product {
    private String product;

    public CentralLocking(String productName) {
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
