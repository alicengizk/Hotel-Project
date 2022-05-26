package US_02;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class TC_0002 extends TestBase {

    /*
    Login sayfasında username textbox görünürlüğü kontrol edilmeli ve username girilmeli
    https://qa-environment.concorthotel.com/ sayfasına gidin
    "Log in" linki görünülüğünü kontrol edin
    "Log in" linkine tıklayın
    Username textbox görünürlüğünü kontrol edin
    Username textbox'a Admin username girilmeli
     */

    @Test
    public void test02() {
        anasayfaGiris();
        driver.findElement(By.xpath("//a[@href='/Account/Logon']")).isDisplayed();
        driver.findElement(By.xpath("//a[@href='/Account/Logon']")).click();
        driver.findElement(By.id("UserName")).isDisplayed();
        driver.findElement(By.id("UserName")).sendKeys("Manager");

    }
}
