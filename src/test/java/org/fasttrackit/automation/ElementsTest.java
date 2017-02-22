package org.fasttrackit.automation;


import com.sdl.selenium.web.SearchType;
import com.sdl.selenium.web.WebLocator;
import com.sdl.selenium.web.form.CheckBox;
import com.sdl.selenium.web.utils.Utils;
import org.fasttrackit.util.TestBase;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ElementsTest extends TestBase {

    private LoginView loginPgage = new LoginView();
    private ElementsView page = new ElementsView();



    @Test
    public void checkboxesTest() {
        openLoginPage();
        loginPgage.login("eu@fast.com", "eu.pass");
        //checkOnCheckbox.check();

        page.stopProcessCheckbox.click();
        page.labelWithEnterCheckbox.click();

        Utils.sleep(2000);

        page.stopProcessLabel.click();
        page.withEnterLabel.click();

        Utils.sleep(2000);

        page.stopProcessLabel.click();
        page.withEnterLabel.click();

        assertThat("Stop the process is selected", page.stopProcessCheckbox.isSelected(), is(true));
        assertThat("Label with Enter.", page.labelWithEnterCheckbox.isSelected(), is(true));



/*
        WebLocator dropdownButton = new WebLocator().setElPath("/html/body/form[1]/div[2]/div/div/button");
        dropdownButton.click();

        WebLocator selectManualOption = new WebLocator().setElPath("/html/body/form[1]/div[2]/div/div/ul/li[2]/a/span");
        selectManualOption.click();

        WebLocator calendarChange = new WebLocator().setElCssSelector("#dp3 > span > i");
        calendarChange.click();

        WebLocator clickOn25Day = new WebLocator().setElPath("/html/body/div[2]/div[1]/table/tbody/tr[4]/td[7]");
        clickOn25Day.click();
*/
    }
}
