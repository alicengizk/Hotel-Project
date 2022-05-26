package US_01;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class TC_0007 extends TestBase {

    /*
    Misafirlerin yorumlarinin bulundugu slider
    bolumu gorunur ve altindaki yonlendirme
    butonlari tiklanabilir olmali.
    https://qa-environment.concorthotel.com URL'ine gidilir.
    Main Page'de ilgili bolum gorulene kadar scrolldown yapilir.
    "Musteri yorumlari bolumunde bulunan 5 slider butonuna
    sirasiyla tiklanir."
     */

    @Test
    public void test07() {
        Actions actions=new Actions(driver);
        anasayfaGiris();
        actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();
        driver.findElement(By.xpath("//div[@class='owl-item'][4]")).isDisplayed();
        driver.findElement(By.xpath("//button[@role='button'][1]")).click();
        driver.findElement(By.xpath("//button[@role='button'][2]")).click();
        driver.findElement(By.xpath("//button[@role='button'][3]")).click();
        driver.findElement(By.xpath("//button[@role='button'][4]")).click();
        driver.findElement(By.xpath("//button[@role='button'][5]")).click();


    }
}
