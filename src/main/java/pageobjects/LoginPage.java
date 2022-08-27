package pageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    AndroidDriver driver;
    public LoginPage(AndroidDriver driver){

        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "test:id/email_input")
    private WebElement emailField;

    @AndroidFindBy(id = "test:id/password_input")
    private WebElement passwordField;

    @AndroidFindBy(id = "test:id/unchecked_icon")
    private WebElement checkBoxTerms;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Login']")
    private WebElement loginButton;

    public void setEmailField(String emailAddress){
        emailField.sendKeys(emailAddress);
    }

    private void setPasswordField(String password){
        passwordField.sendKeys(password);
    }

    public void clickTermsCheckbox(){
        checkBoxTerms.click();
    }

    public void clickLoginButton(){
        loginButton.click();
    }


}
