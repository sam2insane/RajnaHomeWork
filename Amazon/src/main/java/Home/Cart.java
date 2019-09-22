package Home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Cart extends CommonAPI {
    @Test

    public void testCart() {

        driver.findElement(By.xpath("//*[@id=\"nav-cart\"]/span[3]")).click();
    }
}