package US_01;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class TC_0005 extends TestBase {

    /*
    Welcome to our hotel bolumu gorunur olmali.
    https://qa-environment.concorthotel.com URL'ine gidilir.
    Main Page'de ilgili bolum gorulene kadar scrolldown yapilir.
     */

    @Test
    public void test05() {
        Actions actions=new Actions(driver);
        anasayfaGiris();
        actions.sendKeys(Keys.PAGE_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN).perform();
        driver.findElement(By.xpath("//*[text()='Welcome To Our Hotel']")).isDisplayed();
    }
}
