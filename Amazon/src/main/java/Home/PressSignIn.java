package Home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class PressSignIn extends CommonAPI {
    @Test
    public void SignIn() {
        driver.findElement(By.id("a-autoid-0-announce")).click();
    }
}
