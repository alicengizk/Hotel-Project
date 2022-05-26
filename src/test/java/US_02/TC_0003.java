package US_02;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class TC_0003 extends TestBase {

    /*
    Password textbox görünürlüğü kontrol edilmeli ve password girilmeli
    https://qa-environment.concorthotel.com/ sayfasına gidin
    "Log in" linki görünülüğünü kontrol edin
    "Log in" linkine tıklayın
    Username textbox görünürlüğünü kontrol edin
    Username textbox'a Admin username girilmeli
    Password textbox görünürlüğünü kontrol edin
    Password textbox'a Admin password girilmeli
     */

    @Test
    public void test03() {
        anasayfaGiris();
        driver.findElement(By.xpath("//a[@href='/Account/Logon']")).isDisplayed();
        driver.findElement(By.xpath("//a[@href='/Account/Logon']")).click();
        driver.findElement(By.id("UserName")).isDisplayed();
        driver.findElement(By.id("UserName")).sendKeys("Manager");
        driver.findElement(By.id("Password")).isDisplayed();
        driver.findElement(By.id("Password")).sendKeys("Manager1!");


    }
}
