package org.fasttrackit.automation;


import com.sdl.selenium.web.WebLocator;
import com.sdl.selenium.web.form.TextField;
import com.sdl.selenium.web.link.WebLink;
import com.sdl.selenium.web.utils.Utils;

public class ElementsView {

    private WebLocator checkboxStop = new WebLocator().setClasses("checkbox");
    private WebLocator checkLabel = new WebLocator().setClasses("checkbox checkbox-enter");
    private WebLocator dropdownButton = new WebLocator().setClasses("btn dropdown-toggle clearfix");
    private WebLocator selectManualOption = new WebLocator().setTag("li rel='1'");


    public void check() {



        checkboxStop.click();
        checkLabel.click();
        dropdownButton.click();

        Utils.sleep(1000);

        selectManualOption.doClick();
    }

}
