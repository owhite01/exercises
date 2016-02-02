
public class ParserFactoryProducer {

    public static AbstractParserFactory getFactory(String factoryType){

        if(factoryType == "NYCFactory"){
            return new NYCFeedbackParser();
        }

        if(factoryType == "LondonFactory"){
            return new LondonFeedbackParser();
        }

        return null;
    }

}
