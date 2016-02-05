package Composite;

import java.util.List;


public class HtmlParentElement extends HtmlTag{
    public String name;

    public HtmlParentElement(String name) {
        this.name = name;
    }

    @Override
    public String getTagName() {
        return null;
    }

    @Override
    public void setStartTag(String tag) {

    }

    @Override
    public void setEndTag(String tag) {

    }

    @Override
    public void setTagBody(String tagBody) {
        super.setTagBody(tagBody);
    }

    @Override
    public void addChildTag(HtmlTag htmlTag) {
        super.addChildTag(htmlTag);
    }

    @Override
    public void removeChildTag(HtmlTag htmlTag) {
        super.removeChildTag(htmlTag);
    }

    @Override
    public List<HtmlTag> getChildren() {
        return super.getChildren();
    }

    @Override
    public void generateHtml() {

    }
}
