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
    @FindBy(css = "#preferences-win > form > div > div > div.modal-body > div:nth-child(5) > div > button")
    private WebElement saveChanges;



    public void changePasswordWithInvalidCurrentPassword(String currentPass, String newPass, String repeatNewPass) {
        Utils.sleep(2000);

        currentPasswordField.sendKeys(currentPass);
        newPasswordField.sendKeys(newPass);
        repeatPasswordField.sendKeys(repeatNewPass);
        saveChanges.click();
    }

}
