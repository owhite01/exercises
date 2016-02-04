package Strategy;


public class NYCParserFactory implements AbstractParserFactory {
    @Override
    public XMLParser getParserInstance(String parserType) {
        if(parserType == "NYCORDER"){
            return new NYCFeedbackParser();
        }


        return null;
    }
}
