package common;

import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class CommonAPI {
    public static WebDriver driver = null;

    @Parameters({"url"})

    @BeforeMethod
    public void setUp(String url) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\samia\\HwSelenium\\RajnaHomeWork\\Generic\\driver\\chromedriver.exe");

        driver = new ChromeDriver();
        //driver=new FirefoxDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.navigate().to(url);
    }


    @AfterMethod
    public void cleanUp() {
        driver.close();
    }


}


