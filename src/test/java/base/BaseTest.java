package mobileautomationtest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pageobjects.LoginPage;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseTest {
    public AndroidDriver driver;
    public AppiumDriverLocalService service;
    protected LoginPage loginPage;

    @BeforeClass
    public void ConfigureAppium() throws MalformedURLException {
        //Starting the Appium server
        service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\PickMe1089\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
                .withIPAddress("127.0.0.1").usingPort(4723).build();
        service.start();

        //Initializing the Android driver and setting the server path and capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Pixel4API28");
        options.setApp("C:\\Users\\PickMe1089\\IdeaProjects\\rootCodeLabsTestPoorni\\src\\test\\java\\resources\\practicalTest.apk");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        loginPage = new LoginPage(driver);
    }

    @AfterClass
    public void TearDown(){
        //Stop the Android driver
        driver.quit();
        //End the Appium service
        service.stop();
    }
}
