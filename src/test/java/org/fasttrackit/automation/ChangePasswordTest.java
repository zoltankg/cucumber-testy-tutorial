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

    public ChangePasswordTest() {

        loginPage = PageFactory.initElements(driver, LoginPage.class);
    }

    @Test
    public void preferencesChange(){

        openBrowser();
        loginPage.login("eu@fast.com", "eu.pass");

        WebElement preferencesBtn = driver.findElement(By.cssSelector("body > nav > div > div > div > button"));
        preferencesBtn.click();

        WebElement currentPasswordField = driver.findElement(By.name("password"));
        WebElement newPasswordField = driver.findElement(By.name("newPassword"));
        WebElement repeatPasswordField = driver.findElement(By.name("newPasswordRepeat"));

        WebElement saveChanges = driver.findElement(By.cssSelector("#preferences-win > form > div > div > div.modal-body > div:nth-child(5) > div > button"));

        Utils.sleep(2000);

        currentPasswordField.sendKeys("wrong-pass");
        newPasswordField.sendKeys("new.pass");
        repeatPasswordField.sendKeys("new.pass");

        saveChanges.click();

        WebElement errorMessageOnPreferences = driver.findElement(By.cssSelector("#preferences-win > form > div > div > div.modal-body > div.status-msg"));
        System.out.println(errorMessageOnPreferences.getText());

        assertThat(errorMessageOnPreferences.getText(), is("Your preview password is incorrect!"));

    }

}
