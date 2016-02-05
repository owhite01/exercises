package Bridge;


public class BigWheel extends Car {
    private final Product product;
    private final String carType;

    public BigWheel(Product product, String carType) {
        super(product, carType);
        this.product = product;
        this.carType = carType;
    }

    @Override
    public void assemble() {
        String carProd = product.productName();
        System.out.println("Assembling "+carProd
                +" for "+carType);
    }


    @Override
    public void produceProduct() {
        String carProd = product.productName();
        product.produce();
        System.out.println("Modifing product "+carProd
                +" according to "+carType);
    }

}
