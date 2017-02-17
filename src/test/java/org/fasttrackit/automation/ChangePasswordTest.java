package org.fasttrackit.automation;

import com.sdl.selenium.web.utils.Utils;
import org.fasttrackit.util.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ChangePasswordTest extends TestBase {

    private LoginPage loginPage;
    private ChangePasswordPage changePasswordPage;

    public ChangePasswordTest() {

        loginPage = PageFactory.initElements(driver, LoginPage.class);
        changePasswordPage = PageFactory.initElements(driver, ChangePasswordPage.class);
    }




    @Test
    public void changePasswordWithInvalidCurrentPassword(){

        openBrowser();
        loginPage.login("eu@fast.com", "eu.pass");

        WebElement preferencesBtn = driver.findElement(By.cssSelector("body > nav > div > div > div > button"));
        preferencesBtn.click();

        changePasswordPage.changePasswordWithInvalidCurrentPassword("wrong-pass", "new.pass", "new.pass");

        WebElement errorMessageOnPreferences = driver.findElement(By.cssSelector("#preferences-win > form > div > div > div.modal-body > div.status-msg"));
        System.out.println(errorMessageOnPreferences.getText());

        assertThat(errorMessageOnPreferences.getText(), is("Your preview password is incorrect!"));

    }

}
