package US_01;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class TC_0008 extends TestBase {

    /*
    Recent Blog bolumu gorunur ve icerisindeki
    elementler tiklanabilir olmali.
    https://qa-environment.concorthotel.com URL'ine gidilir.
    Main Page'de ilgili bolum gorulene kadar scrolldown yapilir.
    Recent Blog bolumundeki ilk blog yazisina tiklanir.
    Recent Blog bolumundeki ikinci blog yazisina tiklanir.
    Recent Blog bolumundeki ucuncu blog yazisina tiklanir.
    Recent Blog bolumundeki dorduncu blog yazisina tiklanir.
     */

    @Test
    public void test08() throws InterruptedException {
        Actions actions=new Actions(driver);
        anasayfaGiris();
        actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//body/section[8]/div[1]")).isDisplayed();
        driver.findElement(By.xpath("//a[@href='/Content/ContentDetails/12']")).click();
        driver.navigate().back();
        driver.findElement(By.xpath("//a[@href='/Content/ContentDetails/11']")).click();
        driver.navigate().back();
        driver.findElement(By.xpath("//a[@href='/Content/ContentDetails/10']")).click();
        driver.navigate().back();
        driver.findElement(By.xpath("//a[@href='/Content/ContentDetails/9']")).click();
        driver.navigate().back();
    }
}
