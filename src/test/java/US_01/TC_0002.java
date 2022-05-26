package US_01;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class TC_0002 extends TestBase {

    /*
    Navbar'da bulunan butonlar kullaniciyi ilgili
    https://qa-environment.concorthotel.com URL'ine gidilir.
    Navbar'da bulunan Home butonuna tiklanir.
    Navbar'da bulunan Rooms butonuna tiklanir.
    Navbar'da bulunan Restaurant butonuna tiklanir.
    Navbar'da bulunan About butonuna tiklanir.
    Navbar'da bulunan Blog butonuna tiklanir.
    Navbar'da bulunan Contact butonuna tiklanir.
    Navbar'da bulunan Login butonuna tiklanir.
     */

    @Test
    public void test02() {
        anasayfaGiris();
        driver.findElement(By.xpath("//*[text()='Home']")).click();
        driver.findElement(By.xpath("//*[text()='Rooms']")).click();
        driver.navigate().back();
        driver.findElement(By.xpath("//*[text()='Restaurant']")).click();
        driver.navigate().back();
        driver.findElement(By.xpath("//*[text()='About']")).click();
        driver.navigate().back();
        driver.findElement(By.xpath("//*[text()='Blog']")).click();
        driver.navigate().back();
        driver.findElement(By.xpath("//*[text()='Contact']")).click();
        driver.navigate().back();
        driver.findElement(By.xpath("//*[text()='Log in']")).click();
        driver.navigate().back();


    }
}
