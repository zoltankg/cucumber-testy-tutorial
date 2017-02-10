package org.fasttrackit.automation;

import org.fasttrackit.util.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class LoginTestEmailRo extends TestBase {

    @Test
    public void validLoginTest() {
        System.out.println("READY!");
        driver.get("http://email.ro/");

        WebElement emailField = driver.findElement(By.name("name"));
        emailField.sendKeys("********");

        WebElement passwordField = driver.findElement(By.name("pass"));
        passwordField.sendKeys("*********");

        WebElement loginButton = driver.findElement(By.className("button"));
        loginButton.click();

    }
}
