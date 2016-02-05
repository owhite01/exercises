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


    }



}
