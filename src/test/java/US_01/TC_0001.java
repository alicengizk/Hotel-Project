package US_01;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class TC_0001 extends TestBase {

    /*
    https://qa-environment.concorthotel.com URL'ine gidilir.
    Home, Rooms, Restaurant, About, Blog, Contact,
    ve Log in butonlari gorunur olmali.
     */

    @Test
    public void test01() {
        driver.get("https://qa-environment.concorthotel.com");
        driver.findElement(By.id("details-button")).click();
        driver.findElement(By.id("proceed-link")).click();
        driver.findElement(By.xpath("//*[text()='Home']")).isDisplayed();
        driver.findElement(By.xpath("//*[text()='Rooms']")).isDisplayed();
        driver.findElement(By.xpath("//*[text()='Restaurant']")).isDisplayed();
        driver.findElement(By.xpath("//*[text()='About']")).isDisplayed();
        driver.findElement(By.xpath("//*[text()='Blog']")).isDisplayed();
        driver.findElement(By.xpath("//*[text()='Contact']")).isDisplayed();
        driver.findElement(By.xpath("//*[text()='Log in']")).isDisplayed();
    }
}
