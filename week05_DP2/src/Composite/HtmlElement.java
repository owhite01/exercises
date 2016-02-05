package Composite;



public class HtmlElement extends HtmlTag {

    public String name;
    public String startTag;
    public String endTag;
    public String tagBody;



    public HtmlElement(String tagName){
        this.name = tagName;
        this.tagBody = "";
        this.startTag = "";
        this.endTag = "";
    }


    @Override
    public String getTagName() {
        return name;
    }


    @Override
    public void setStartTag(String tag) {
        this.startTag = tag;
    }

    @Override
    public void setEndTag(String tag) {
        this.endTag = tag;
    }


    @Override
    public void setTagBody(String tagBody){
        this.tagBody = tagBody;
    }


    @Override
    public void generateHtml() {
        System.out.println(startTag+""+tagBody+""+endTag);
    }

}
