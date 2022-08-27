package tests;

import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import pageobjects.ServicePage;

public class TC_ViewServiceDetails extends mobileautomationtest.BaseTest {
    @Test
    public void ViewServiceCardDetails(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setEmailField("qxkeb06yat@buy-blog.com");
        loginPage.setPasswordField("test@123");
        loginPage.clickTermsCheckbox();
        HomePage homePage = loginPage.clickLoginButton();
        ServicePage servicePage = homePage.clickServicePage();
        servicePage.verifyServiceDetailTitle("Interior Design Ideas(Free)");
        servicePage.verifyServicePriceValue("");
        servicePage.verifyServiceDetailsValue("");
        servicePage.verifyServiceExpertValue("");
        servicePage.verifyServiceExperienceValue("");
        servicePage.verifyServiceStatusValue("");
    }
}
