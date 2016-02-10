package factory;


public class ConcreteCreator implements Creator {

    //Returns an instance of ConcreteProduct
    static ConcreteProduct returnInstance() {
        return new ConcreteProduct();
    }


}
