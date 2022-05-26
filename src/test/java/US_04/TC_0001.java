package US_04;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class TC_0001 extends TestBase {

    /*
    Add hotel butonu tıklanabilir olmalı ve tıklandıgında yeni otel ekleme sayfasına yönlendirmeli
    https://qa-environment.concorthotel.com/ sayfasına gidiniz
    Sağ üstteki "Login"butonuna tıklayın
    "Username" butonuna geçerli bir username girin
    "Password" butonuna geçerli bir password girin
    "Login" Butonuna tıklayın
    "Hotel Management" menüsüne tıklayın
    "Hotel List" menüsüne tıklayın
    "Add Hotel" Buttonuna tıklayın
     */

    @Test
    public void test04() {
        anasayfaGiris();
        driver.findElement(By.xpath("//a[@href='/Account/Logon']")).click();
        adminGirisi();
        driver.findElement(By.xpath("//*[text()='Hotel Management']")).click();
        driver.findElement(By.xpath("//a[@href='/admin/HotelAdmin']")).click();
        driver.findElement(By.xpath("//span[@class='hidden-480']")).click();
    }
}
