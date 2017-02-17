package org.fasttrackit.automation;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(id = "email")
    private WebElement emailField;
    @FindBy(name = "password")
    private WebElement passField;
    @FindBy(className = "login-btn")
    private WebElement loginBtn;

    public void login(String user, String pass) {
        emailField.sendKeys(user);
        passField.sendKeys(pass);
        loginBtn.click();

    }

}
