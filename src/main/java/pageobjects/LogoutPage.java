package pageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
    AndroidDriver driver;
    public LogoutPage(AndroidDriver driver){

        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "test:id/logout_button_text")
    private WebElement logoutButton;

    @AndroidFindBy(id = "test:id/logout_confirm_modal_title")
    private WebElement logoutPopupMessage;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Yes']")
    private WebElement yesButton;

    public void clickLogoutButton(){
        logoutButton.click();
    }

    public LoginPage clickYesButton(){
        yesButton.click();
        return new LoginPage(driver);
    }
}
