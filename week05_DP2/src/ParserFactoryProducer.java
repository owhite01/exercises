
public class ParserFactoryProducer {

    public static AbstractParserFactory getFactory(String factoryType){

        if(factoryType == "NYCFactory"){
            return new NYCParserFactory();
        }

        if(factoryType == "LondonFactory"){
            return new LondonParserFactory();
        }

        return null;
    }

}
