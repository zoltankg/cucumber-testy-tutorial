package org.fasttrackit.automation;


import com.sdl.selenium.web.SearchType;
import com.sdl.selenium.web.WebLocator;
import com.sdl.selenium.web.form.CheckBox;
import com.sdl.selenium.web.form.TextField;
import com.sdl.selenium.web.link.WebLink;
import com.sdl.selenium.web.utils.Utils;

public class ElementsView {

    public WebLocator stopProcessLabel = new WebLocator().setText("Stop the process?", SearchType.TRIM);
    public WebLocator withEnterLabel = new WebLocator().setText("Label with Enter.", SearchType.CHILD_NODE);
    public CheckBox stopProcessCheckbox = new CheckBox(stopProcessLabel);
    public CheckBox labelWithEnterCheckbox = new CheckBox(withEnterLabel);

    public static void main(String[] args) {
        ElementsView test = new ElementsView();
        System.out.println(test.stopProcessLabel.getSelector());
        System.out.println(test.withEnterLabel.getSelector());
        System.out.println(test.stopProcessCheckbox.getSelector());
        System.out.println(test.labelWithEnterCheckbox.getSelector());
    }
}
