package Home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SignIn extends CommonAPI {
    @Test
    public void InputUserAndPass() {
        driver.findElement(By.id("a-autoid-0-announce")).click();
        driver.findElement(By.id("ap_email")).sendKeys("samianrahman@aol.com");
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        driver.findElement(By.id("ap_password")).sendKeys("*****");
        driver.findElement(By.cssSelector("input[id = 'signInSubmit']")).click();
    }


}
