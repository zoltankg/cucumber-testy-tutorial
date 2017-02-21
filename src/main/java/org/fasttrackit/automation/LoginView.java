package org.fasttrackit.automation;


import com.sdl.selenium.web.WebLocator;
import com.sdl.selenium.web.button.Button;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginView {

    private WebLocator emailField = new WebLocator().setId("email");
    private WebLocator passField = new WebLocator().setName("password");
    private WebLocator loginBtn = new WebLocator().setClasses("login-btn");

    public void login(String user, String pass) {
        emailField.sendKeys(user);
        passField.sendKeys(pass);
        loginBtn.click();

    }

}
