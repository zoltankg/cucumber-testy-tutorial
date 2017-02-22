package org.fasttrackit.automation;


import com.sdl.selenium.web.WebLocator;
import com.sdl.selenium.web.button.Button;
import com.sdl.selenium.web.utils.Utils;
import org.fasttrackit.util.TestBase;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ElementsTest extends TestBase {

    private LoginView loginView = new LoginView();
    private ElementsView page = new ElementsView();



    @Test
    public void checkboxesTest() {
        openLoginPage();
        loginView.login("eu@fast.com", "eu.pass");
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
    }

    @Test
    public void dropDownTest() {
        openLoginPage();
        loginView.login("eu@fast.com", "eu.pass");

        page.autoOption.click();
        page.manualOption.click();
    }

    @Test
    public void changeCalendarDay(){
        openLoginPage();
        loginView.login("eu@fast.com", "eu.pass");

        page.pressOnCalendar.click();
        page.pressOn25Day.click();


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
