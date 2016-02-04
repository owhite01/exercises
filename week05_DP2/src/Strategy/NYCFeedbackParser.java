package Strategy;

import Strategy.XMLParser;

public class NYCFeedbackParser implements XMLParser {

    @Override
    public String parse(){
        System.out.println("NY Parsing feedback XML...");
        return "NY Feedback XML Message";
    }
}
