
public class ParserFactoryProducer {
    private ParserFactoryProducer(){
        throw new AssertionError();
    }

    public static AbstractParserFactory getFactory(String factoryType){

        if(factoryType == "NYFactory"){
            return new NYParserFactory();
        }


        return null;
    }

}
