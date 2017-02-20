package org.fasttrackit.automation;


import com.sdl.selenium.web.utils.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChangePasswordPage {

    @FindBy(name = "password")
    private WebElement currentPasswordField;
    @FindBy(name = "newPassword")
    private WebElement newPasswordField;
    @FindBy(name = "newPasswordRepeat")
    private WebElement repeatPasswordField;
    //@FindBy(css = "#preferences-win > form > div > div > div.modal-body > div:nth-child(5) > div > button")
    @FindBy(xpath = "//*[@id='preferences-win']//button[normalize-space(text())='Save']")
    private WebElement saveChanges;

    @FindBy(className = "status-msg")
    private WebElement statusMsg;



    public void changePassword(String currentPass, String newPass, String repeatNewPass) {
        Utils.sleep(1000);

        currentPasswordField.sendKeys(currentPass);
        newPasswordField.sendKeys(newPass);
        repeatPasswordField.sendKeys(repeatNewPass);
        saveChanges.click();
    }

    public String getStatusMessage() {
        String msg = statusMsg.getText();
        System.out.println(msg);
        return msg;
    }
}
