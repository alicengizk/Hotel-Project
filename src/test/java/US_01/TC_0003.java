package US_01;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class TC_0003 extends TestBase {

    /*
    CHECK-IN DATE, CHECK-OUT DATE, ROOM,
    https://qa-environment.concorthotel.com URL'ine gidilir.
    "CHECK-IN DATE elementine tiklanir ve giris tarihi icin
    secim yapilir."
    "CHECK-OUT DATE elementine tiklanir ve cikis tarihi icin
    secim yapilir."
    "ROOM elementine tiklanir ve dropdown menuden uygun
    room type secilir."
    "CUSTOMER elemtine tiklanir ve dropdown menuden
    yetiskin kisi sayisi sacilir."
     */

    @Test
    public void test03() throws InterruptedException {
        Actions actions = new Actions(driver);
        anasayfaGiris();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        driver.findElement(By.id("checkin_date")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//tbody//td[@class='day'][2]")).click();
        driver.findElement(By.xpath("//input[@class='form-control checkout_date']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//td[@class='new day'][1]")).click();
        driver.findElement(By.xpath("//select[@name='IDRoomType']")).click();
        driver.findElement(By.xpath("//option[text()='Single']")).click();
        driver.findElement(By.xpath("//select[@id='AdultCount']/option[@value='1']")).click();

    }
}
