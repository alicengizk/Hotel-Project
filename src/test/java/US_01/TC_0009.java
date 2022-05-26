package US_01;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class TC_0009 extends TestBase {

    /*
    Instagram kismi gorunur ve icerisindeki
    elementler tiklanabilir olmali.
    https://qa-environment.concorthotel.com URL'ine gidilir.
    Main Page'de ilgili bolum gorulene kadar scrolldown yapilir.
    Instagram bolumundeki fotograflara sirasiyla tiklanir.
    "Herhangi bir fotografa tiklandiktan sonra sagda bulunan
    ""Next"" elementine tiklanir."
    "Herhangi bir fotografa tiklandiktan sonra solda bulunan
    ""Previous"" elementine tiklanir."
     */

    @Test
    public void test09() throws InterruptedException {
        Actions actions=new Actions(driver);
        anasayfaGiris();
        actions.sendKeys(Keys.CONTROL,Keys.END,Keys.PAGE_UP).perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//section[@class='instagram']")).isDisplayed();
        driver.findElement(By.xpath("//section[@class='instagram']//div[@class='col-sm-12 col-md ftco-animate fadeInUp ftco-animated'][1]")).click();
        driver.findElement(By.xpath("//button[@title='Close (Esc)']")).click();
        driver.findElement(By.xpath("//section[@class='instagram']//div[@class='col-sm-12 col-md ftco-animate fadeInUp ftco-animated'][2]")).click();
        driver.findElement(By.xpath("//button[@title='Close (Esc)']")).click();
        driver.findElement(By.xpath("//section[@class='instagram']//div[@class='col-sm-12 col-md ftco-animate fadeInUp ftco-animated'][3]")).click();
        driver.findElement(By.xpath("//button[@title='Close (Esc)']")).click();
        driver.findElement(By.xpath("//section[@class='instagram']//div[@class='col-sm-12 col-md ftco-animate fadeInUp ftco-animated'][4]")).click();
        driver.findElement(By.xpath("//button[@title='Close (Esc)']")).click();
        driver.findElement(By.xpath("//section[@class='instagram']//div[@class='col-sm-12 col-md ftco-animate fadeInUp ftco-animated'][1]")).click();
        driver.findElement(By.xpath("//button[@title='Next (Right arrow key)']")).click();
        driver.findElement(By.xpath("//button[@title='Previous (Left arrow key)']")).click();


    }
}
