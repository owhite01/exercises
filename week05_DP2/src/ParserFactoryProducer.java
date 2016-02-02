
public class ParserFactoryProducer {

    public static AbstractParserFactory getFactory(String factoryType){

        if(factoryType == "NYFactory"){
            return new NYParserFactory();
        }

        if(factoryType == "TWFactory"){
            return new TWParserFactory();
        }

        return null;
    }

}
