package US_01;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class TC_0010 extends TestBase {

    /*
    Sayfanin en altinda bulunan footer bolumundeki
    Concort Hotel, Useful Links, Privacy ve Have a
    Questions? kisimlari gorunur olmali.
    https://qa-environment.concorthotel.com URL'ine gidilir.
    Main Page'de sayfanin sonuna kadar scrolldown yapilir.
     */

    @Test
    public void test10() throws InterruptedException {
        Actions actions=new Actions(driver);
        anasayfaGiris();
        actions.sendKeys(Keys.CONTROL,Keys.END).perform();
        driver.findElement(By.xpath("//div[@class='col-md'][1]")).isDisplayed();
        driver.findElement(By.xpath("//div[@class='col-md'][2]")).isDisplayed();
        driver.findElement(By.xpath("//div[@class='col-md'][3]")).isDisplayed();
        driver.findElement(By.xpath("//div[@class='col-md'][4]")).isDisplayed();

    }
}
