package org.fasttrackit.automation;

import org.fasttrackit.util.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class LogoutTestEmailRo extends TestBase {

    @Test
    public void validLogoutTest() {
        System.out.println("READY!");
        driver.get("http://email.ro/");

        WebElement emailField = driver.findElement(By.name("name"));
        emailField.sendKeys("*********");

        WebElement passwordField = driver.findElement(By.name("pass"));
        passwordField.sendKeys("*********");

        WebElement loginButton = driver.findElement(By.className("button"));
        loginButton.click();

        WebElement logoutButton = driver.findElement(By.cssSelector("body > table > tbody > tr:nth-child(1) > td > table > tbody > tr:nth-child(9) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr > td:nth-child(1) > table:nth-child(1) > tbody > tr:nth-child(28) > td:nth-child(4) > a"));
        logoutButton.click();

    }
}
