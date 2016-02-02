/**
 * Created by OliverW on 02/02/2016.
 */
public class NYCParserFactory implements AbstractParserFactory{
    @Override
    public XMLParser getParserInstance(String parserType) {
        if(parserType == "NYCORDER"){
            return new NYCFeedbackParser();
        }


        return null;
    }
}
