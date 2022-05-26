package US_02;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class TC_0005 extends TestBase {
    /*
    Giriş yapıldığı " ListOfUsers " yazısının görünürlüğü ile kontrol edilmeli
    https://qa-environment.concorthotel.com/ sayfasına gidin
    "Log in" linki görünülüğünü kontrol edin
    "Log in" linkine tıklayın
    Username textbox görünürlüğünü kontrol edin
    Username textbox'a Admin username girilmeli
    Password textbox görünürlüğünü kontrol edin
    Password textbox'a Admin password girilmeli
    Login butonunun görünürlüğünü kontrol edin
    Login butonuna tıklayın
    " ListOfUsers " yazısının görünürlüğünü kontrol edin
     */

    @Test
    public void test05() {
        anasayfaGiris();
        driver.findElement(By.xpath("//a[@href='/Account/Logon']")).isDisplayed();
        driver.findElement(By.xpath("//a[@href='/Account/Logon']")).click();
        driver.findElement(By.id("UserName")).isDisplayed();
        driver.findElement(By.id("UserName")).sendKeys("Manager");
        driver.findElement(By.id("Password")).isDisplayed();
        driver.findElement(By.id("Password")).sendKeys("Manager1!");
        driver.findElement(By.id("btnSubmit")).isDisplayed();
        driver.findElement(By.id("btnSubmit")).click();
        driver.findElement(By.xpath("//div[@class='caption']")).isDisplayed();
    }
}
