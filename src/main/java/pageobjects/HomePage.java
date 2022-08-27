package pageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    AndroidDriver driver;
    public HomePage(AndroidDriver driver){

        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "test:id/services_top_tab")
    private WebElement serviceTab;

    @AndroidFindBy(id = "test:id/profile_tab_icon")
    private WebElement profileIcon;

    public ServicePage clickServicePage(){
        serviceTab.click();
        return new ServicePage(driver);
    }

    public LogoutPage clickProfileIcon(){
        profileIcon.click();
        return new LogoutPage(driver);
    }

}
