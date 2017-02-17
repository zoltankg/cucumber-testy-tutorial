package org.fasttrackit.automation;

import com.sdl.selenium.web.utils.Utils;
import org.fasttrackit.util.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class LoginTest extends TestBase {

    private LoginPage loginPage;

    public LoginTest() {
        loginPage = PageFactory.initElements(driver, LoginPage.class);
    }

    @Test
    public void validLoginTest() {
        openBrowser();

        loginPage.login("eu@fast.com", "eu.pass");

    }

    @Test
    public void invalidPasswordTest() {
        openBrowser();

        loginPage.login("eu@fast.com", "eu.pass123");

        WebElement errorElement = driver.findElement(By.className("error-msg"));
        System.out.println(errorElement.getText());

        //Assert.assertEquals(errorElement.getText(), "Invalid user or password!");
        assertThat(errorElement.getText(), is("Invalid user or password!"));

    }

    @Test
    public void preferencesChange(){

        //validLoginTest();  //first solution for login


        //second solution for login
        openBrowser();
        loginPage.login("eu@fast.com", "eu.pass");

        WebElement preferencesButton = driver.findElement(By.cssSelector("body > nav > div > div > div > button"));
        preferencesButton.click();

                System.out.println("Pass the preferences button!");

        WebElement oldPasswordField = driver.findElement(By.name("password"));
        WebElement newPasswordField = driver.findElement(By.name("newPassword"));
        WebElement newPasswordRepeatField = driver.findElement(By.name("newPasswordRepeat"));
        WebElement saveChanges = driver.findElement(By.cssSelector("#preferences-win > form > div > div > div.modal-body > div:nth-child(5) > div > button"));

        Utils.sleep(2000);

        oldPasswordField.sendKeys("wrong-pass");
                System.out.println("Enter the old password!");
        newPasswordField.sendKeys("eu.pass123");
        newPasswordRepeatField.sendKeys("eu.pass123");
        saveChanges.click();

        WebElement errorMessageOnPreferences = driver.findElement(By.cssSelector("#preferences-win > form > div > div > div.modal-body > div.status-msg"));
            System.out.println(errorMessageOnPreferences.getText());

        assertThat(errorMessageOnPreferences.getText(), is("Your preview password is incorrect!"));

    }

        private void openBrowser() {
            System.out.println("READY TO USE!!!");
            driver.get("https://rawgit.com/sdl/Testy/master/src/test/functional/app-demo/login.html");
        }






}
