package Composite;

import java.util.ArrayList;
import java.util.List;


public class HtmlParentElement extends HtmlTag{
    public String name;
    private String startTag;
    private String endTag;
    private List<HtmlTag>childrenTag;


    public HtmlParentElement(String name) {
        this.name = name;
        this.startTag = "";
        this.endTag = "";
        this.childrenTag = new ArrayList<HtmlTag>();
        ;
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
    public void setTagBody(String tagBody) {
        super.setTagBody(tagBody);
    }

    @Override
    public void addChildTag(HtmlTag htmlTag){
        childrenTag.add(htmlTag);
    }

    @Override
    public void removeChildTag(HtmlTag htmlTag){
        childrenTag.remove(htmlTag);
    }


    @Override
    public List<HtmlTag>getChildren(){
        return childrenTag;
    }


    @Override
    //Had to look online for some additional pointers for this method.
    public void generateHtml() {
        System.out.println(startTag);
        for(HtmlTag tag : childrenTag){
            tag.generateHtml();
        }
        System.out.println(endTag);

    }



}
