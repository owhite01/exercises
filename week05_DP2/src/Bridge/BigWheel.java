package Bridge;


public class BigWheel extends Car {
    private final Product product;
    private final String typeCar;

    public BigWheel(Product product, String carType) {
        super(product, carType);
        this.product = product;
        this.typeCar = carType;
    }

    @Override
    public void assemble() {
        String carProd = product.productName();
        System.out.println("Assembling "+carProd
                +" for "+ typeCar);
    }


    @Override
    public void produceProduct() {
        String carProd = product.productName();
        product.produce();
        System.out.println("Modifing product "+carProd
                +" according to "+ typeCar);
    }

}
