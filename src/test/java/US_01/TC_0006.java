package US_01;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class TC_0006 extends TestBase {

    /*
    Our Rooms bolumu ve icerisindeki elementler
    gorunur ve tiklanabilir olmali.
    https://qa-environment.concorthotel.com URL'ine gidilir.
    Main Page'de ilgili bolum gorulene kadar scrolldown yapilir.
    Our Rooms bolumundeki ilk oda secenegine tiklanir.
    Our Rooms bolumundeki ikinci oda secenegine tiklanir.
    Our Rooms bolumundeki ucuncu oda secenegine tiklanir.
    Our Rooms bolumundeki dorduncu oda secenegine tiklanir.
    Our Rooms bolumundeki besinci oda secenegine tiklanir.
    Our Rooms bolumundeki altinci oda secenegine tiklanir.
     */

    @Test
    public void test06() throws InterruptedException {
        Actions actions=new Actions(driver);
        anasayfaGiris();
        Thread.sleep(2000);
        actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@href='/RoomDetail/665']")).click();
        driver.navigate().back();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@href='/RoomDetail/664']")).click();
        driver.navigate().back();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@href='/RoomDetail/663']")).click();
        driver.navigate().back();
        Thread.sleep(2000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        driver.findElement(By.xpath("//a[@href='/RoomDetail/662']")).click();
        driver.navigate().back();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@href='/RoomDetail/661']")).click();
        driver.navigate().back();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@href='/RoomDetail/660']")).click();
        driver.navigate().back();
        Thread.sleep(2000);


    }
}
