package US_01;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

public class TC_0004 extends TestBase {

    /*
    Check Availability butonu kullaniciyi sectigi
    kriterlere gore uygun sayfaya yonlendirmeli.
    https://qa-environment.concorthotel.com URL'ine gidilir.
    "Kullanici uygun kriterleri sectikten sonra Check Availability
    butonuna tiklar."
     */

    @Test
    public void test04() throws InterruptedException {
        Actions actions = new Actions(driver);
        anasayfaGiris();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        driver.findElement(By.id("checkin_date")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//tbody//td[@class='day'][2]")).click();
        driver.findElement(By.id("checkout_date")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//td[@class='new day'][1]")).click();
        driver.findElement(By.xpath("//select[@id='IDRoomType']/option[@value='6']")).click();
        //driver.findElement(By.xpath("//option[text()='Single']")).click();
        driver.findElement(By.xpath("//select[@id='AdultCount']/option[@value='1']")).click();
        Thread.sleep(2000);
        String checkInDate=driver.findElement(By.id("checkin_date")).getText();
        String checkOutDate=driver.findElement(By.id("checkout_date")).getText();
        String roomType=driver.findElement(By.xpath("//select[@id='IDRoomType']/option[@value='6']")).getText();
        String adultCount=driver.findElement(By.xpath("//select[@id='AdultCount']/option[@value='1']")).getText();
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        String actualCheckInDate=driver.findElement(By.id("checkin_date")).getText();
        String actualCheckOutDate=driver.findElement(By.id("checkout_date")).getText();
        String actualRoomType=driver.findElement(By.xpath("//select[@id='IDRoomType']/option[@selected='selected']")).getText();
        String actualAdultCount=driver.findElement(By.xpath("//select[@id='AdultCount']/option[@selected='selected']")).getText();
        Assert.assertEquals(checkInDate,actualCheckInDate);
        Assert.assertEquals(checkOutDate,actualCheckOutDate);
        actions.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN).perform();
        Thread.sleep(2000);
        Assert.assertEquals(roomType,actualRoomType);
        Assert.assertEquals(adultCount,actualAdultCount);
        Thread.sleep(2000);
    }
}
