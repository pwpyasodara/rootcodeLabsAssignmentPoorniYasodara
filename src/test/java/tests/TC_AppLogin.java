package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.LoginPage;

public class TC_AppLogin extends mobileautomationtest.BaseTest {
    @Test(dataProvider = "getData")
    public void AppLogin(String email, String password){
        loginPage.setEmailField(email);
        loginPage.setPasswordField(password);
        loginPage.clickTermsCheckbox();
        HomePage homePage = loginPage.clickLoginButton();

    }

    @DataProvider

    public Object[][] getData(){
        return new Object[][] {{"qxkeb06yat@buy-blog.com","test@123"}};
    }
}
