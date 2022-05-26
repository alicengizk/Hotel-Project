package US_02;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class TC_0001 extends TestBase {

    /*
    1)Giriş yapmak için "Log in" butonu görünür olmalı ve kullanılabilmeli
    https://qa-environment.concorthotel.com/ sayfasına gidin
    "Log in" linki görünülüğünü kontrol edin
    "Log in" linkine tıklayın
     */

    @Test
    public void test01() {
        anasayfaGiris();
        driver.findElement(By.xpath("//a[@href='/Account/Logon']")).isDisplayed();
        driver.findElement(By.xpath("//a[@href='/Account/Logon']")).click();

    }
}
