package org.fasttrackit.automation;


import com.sdl.selenium.web.SearchType;
import com.sdl.selenium.web.WebLocator;
import com.sdl.selenium.web.button.Button;
import com.sdl.selenium.web.form.CheckBox;
import com.sdl.selenium.web.form.TextField;
import com.sdl.selenium.web.link.WebLink;
import com.sdl.selenium.web.utils.Utils;

public class ElementsView {

    public WebLocator stopProcessLabel = new WebLocator().setText("Stop the process?", SearchType.TRIM);
    public WebLocator withEnterLabel = new WebLocator().setText("Label with Enter.", SearchType.CHILD_NODE);
    public CheckBox stopProcessCheckbox = new CheckBox(stopProcessLabel);
    public CheckBox labelWithEnterCheckbox = new CheckBox(withEnterLabel);

    /* This is my version
    public Button dropdownButton = new Button().setElPath("/html/body/form[1]/div[2]/div/div/button/span[1]");
    public WebLocator selectManualOption = new WebLocator().setElPath("/html/body/form[1]/div[2]/div/div/ul/li[2]/a/span");
    */

    public WebLocator autoOption = new WebLocator().setText("Auto").setClasses("filter-option");
    public WebLocator menuDropDown = new WebLocator().setClasses("dropdown-menu");
    public WebLocator manualOption = new WebLocator(menuDropDown).setText("Manual");

    public WebLocator pressOnCalendar = new WebLocator().setElCssSelector("#dp3 > span > i");
    public WebLocator pressOn25Day = new WebLocator().setText("25");

    public WebLocator tableParentForCheckbox = new WebLocator().setClasses("table table-striped table-bordered");
    public CheckBox firstCheckboxInTable = new CheckBox(tableParentForCheckbox).setElPath("/tbody/tr[1]/td[1]/input");
    public CheckBox secondCheckboxInTable = new CheckBox(tableParentForCheckbox).setElPath("/tbody/tr[2]/td[1]/input");
    public CheckBox checkbox2 = new CheckBox(tableParentForCheckbox).setElPath("//input[2]");



    // the main is for verify xpath of checkbox!!

    public static void main(String[] args) {
        ElementsView test = new ElementsView();
        System.out.println(test.stopProcessLabel.getSelector());
        System.out.println(test.withEnterLabel.getSelector());
        System.out.println(test.stopProcessCheckbox.getSelector());
        System.out.println(test.labelWithEnterCheckbox.getSelector());

        /*This is my version
        System.out.println(test.dropdownButton.getSelector());
        System.out.println(test.selectManualOption.getSelector());
        */

        System.out.println(test.autoOption.getSelector());
        System.out.println(test.menuDropDown.getSelector());
        System.out.println(test.manualOption.getSelector());

        System.out.println(test.pressOnCalendar.getSelector());
        System.out.println(test.pressOn25Day.getSelector());

        System.out.println(test.tableParentForCheckbox.getSelector());
        System.out.println(test.firstCheckboxInTable.getSelector());
        System.out.println(test.secondCheckboxInTable.getSelector());
        System.out.println(test.checkbox2.getSelector());

    }
}
