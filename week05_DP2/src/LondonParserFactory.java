
public class LondonParserFactory implements AbstractParserFactory{
    @Override
    public XMLParser getParserInstance(String parserType) {
        if(parserType == "LondonFEEDBACK"){
            return new LondonFeedbackParser();
        }


        return null;
    }

}
