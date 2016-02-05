package Bridge;

/**
 * Created by OliverW on 05/02/2016.
 */
public class GearLocking implements Product {
    private String product;

    public GearLocking(String productName) {
        this.product = productName;
    }

    @Override
    public void produce() {

    }

    @Override
    public String productName() {
        return null;
    }
}
