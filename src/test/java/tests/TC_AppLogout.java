package tests;

import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import pageobjects.LogoutPage;

public class TC_AppLogout extends mobileautomationtest.BaseTest {
    @Test
    public void AppLogout(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setEmailField("qxkeb06yat@buy-blog.com");
        loginPage.setPasswordField("test@123");
        loginPage.clickTermsCheckbox();
        HomePage homePage = loginPage.clickLoginButton();
        LogoutPage logoutPage = homePage.clickProfileIcon();
        logoutPage.clickLogoutButton();
        logoutPage.clickYesButton();
    }
}
