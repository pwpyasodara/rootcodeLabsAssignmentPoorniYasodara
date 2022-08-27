package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.LoginPage;

public class TC_AppLogin extends mobileautomationtest.BaseTest {
    @Test
    public void AppLogin(){

        LoginPage loginPage = new LoginPage(driver);
        loginPage.setEmailField("qxkeb06yat@buy-blog.com");
        driver.findElement(By.id("test:id/email_input")).sendKeys("qxkeb06yat@buy-blog.com");
        driver.findElement(By.id("test:id/password_input")).sendKeys("test@123");
        driver.findElement(By.id("test:id/unchecked_icon")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@text='Login']")).click();
        driver.findElement(By.id("test:id/services_top_tab")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@text='Interior Design Ideas(Free)']")).click();
        String serviceTitle = driver.findElement(By.id("test:id/service_detail_title")).getText();
        Assert.assertEquals(serviceTitle, "Interior Design Ideas(Free)");
        driver.findElement(By.id("test:id/service_detail_price_value")).getText();
        driver.findElement(By.id("test:id/service_detail_details_value")).getText();
        driver.findElement(By.id("test:id/service_detail_expert_value")).getText();
        driver.findElement(By.id("test:id/service_detail_experience_value")).getText();
        driver.findElement(By.id("test:id/service_detail_status_value")).getText();
        driver.findElement(By.id("test:id/profile_tab_icon")).click();
        driver.findElement(By.id("test:id/logout_button_text")).click();
        driver.findElement(By.id("test:id/logout_confirm_modal_title"));
        driver.findElement(By.xpath("//android.widget.TextView[@text='Yes']")).click();
    }
}
