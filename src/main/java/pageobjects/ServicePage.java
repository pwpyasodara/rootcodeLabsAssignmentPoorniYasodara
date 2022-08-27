package pageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ServicePage {
    AndroidDriver driver;
    public ServicePage(AndroidDriver driver){

        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Interior Design Ideas(Free)']")
    private WebElement serviceCard;

    @AndroidFindBy(id = "test:id/service_detail_title")
    private WebElement serviceTitle;

    @AndroidFindBy(id = "test:id/service_detail_price_value")
    private WebElement servicePriceValueLabel;

    @AndroidFindBy(id = "test:id/service_detail_details_value")
    private WebElement serviceDetailLabel;

    @AndroidFindBy(id = "test:id/service_detail_expert_value")
    private WebElement serviceExpertLabel;

    @AndroidFindBy(id = "test:id/service_detail_experience_value")
    private WebElement serviceExperienceLabel;

    @AndroidFindBy(id = "test:id/service_detail_status_value")
    private WebElement serviceStatusLabel;


    public void verifyServiceDetailTitle(String serviceCardTitle){
        String serviceTitleText = serviceTitle.getText();
        Assert.assertEquals(serviceTitleText, serviceCardTitle);
    }

    public void verifyServicePriceValue(String serviceCardPrice){
        String servicePriceText = servicePriceValueLabel.getText();
        Assert.assertEquals(servicePriceText, serviceCardPrice);
    }

    public void verifyServiceDetailsValue(String serviceCardDetails){
        String serviceDetailsText = serviceDetailLabel.getText();
        Assert.assertEquals(serviceDetailsText, serviceCardDetails);
    }

    public void verifyServiceExpertValue(String serviceCardExpert){
        String serviceExpertText = serviceDetailLabel.getText();
        Assert.assertEquals(serviceExpertText, serviceCardExpert);
    }

    public void verifyServiceExperienceValue(String serviceCardExperience){
        String serviceExperienceText = serviceDetailLabel.getText();
        Assert.assertEquals(serviceExperienceText, serviceCardExperience);
    }

    public void verifyServiceStatusValue(String serviceCardStatus){
        String serviceStatusText = serviceDetailLabel.getText();
        Assert.assertEquals(serviceStatusText, serviceCardStatus);
    }


}
