package org.fasttrackit.automation;

import org.fasttrackit.util.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class LoginTest extends TestBase {

    //private LoginPage loginPage;

    //public LoginTest() {
    //    loginPage = PageFactory.initElements(driver, LoginPage.class);
    //}


    @Test
    public void validLoginTest() {
        openLoginPage();

        loginView.login("eu@fast.com", "eu.pass");

    }

    @Test
    public void invalidPasswordTest() {
        openLoginPage();

        loginView.login("eu@fast.com", "eu.pass123");

        WebElement errorElement = driver.findElement(By.className("error-msg"));
        System.out.println(errorElement.getText());

        //Assert.assertEquals(errorElement.getText(), "Invalid user or password!");
        assertThat(errorElement.getText(), is("Invalid user or password!"));

    }










}
