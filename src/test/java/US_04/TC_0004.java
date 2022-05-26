package US_04;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class TC_0004 extends TestBase {

    /*
    "hotel was inserted successfully" yazısını görebilmeli ve
    "ok" butonu tıklanabilir olmalı
    https://qa-environment.concorthotel.com/ sayfasına gidiniz
    Sağ üstteki "Login"butonuna tıklayın
    "Username" butonuna geçerli bir username girin
    "Password" butonuna geçerli bir password girin
    "Login" Butonuna tıklayın
    "Hotel Management" menüsüne tıklayın
    "Hotel List" menüsüne tıklayın
    "Add Hotel" Buttonuna tıklayın
    "Code" kutucuğuna tıklayıp bir Kod giriniz
    "Name" kutucuğuna tıklayıp bir İsim giriniz
    "Adress" kutucuğuna tıklayıp Adres giriniz
    "Phone" kutucuğuna tıklayıp Telefon Numarası giriniz
    "Mail" kutucuğuna tıklayıp Email Adresi giriniz
    "idGroup" dropdown butonuna tıklayıp Grup seçiniz
    "Save" butonuna tıklayın
    "HotelRoom was inserted successfully" yazısının görünürlüğü test edilmeli
    "OK" butonuna tıklayın ve otel listesini tıklayın
     */

    @Test
    public void test04() {
        anasayfaGiris();
        driver.findElement(By.xpath("//a[@href='/Account/Logon']")).click();
        adminGirisi();
        driver.findElement(By.xpath("//*[text()='Hotel Management']")).click();
        driver.findElement(By.xpath("//a[@href='/admin/HotelAdmin']")).click();
        driver.findElement(By.xpath("//span[@class='hidden-480']")).click();
        driver.findElement(By.id("Code")).sendKeys("Otl123");
        driver.findElement(By.id("Name")).sendKeys("Alice");
        driver.findElement(By.id("Address")).sendKeys("Savaron'un Arkasi");
        driver.findElement(By.id("Phone")).sendKeys("666 6 666");
        driver.findElement(By.id("Email")).sendKeys("mailimsi@mailimsiz.com");
        driver.findElement(By.xpath("//select[@id='IDGroup']/option[@value='1']")).click();
        driver.findElement(By.id("btnSubmit")).click();
        driver.findElement(By.xpath("//*[text()='Hotel was inserted successfully']")).isDisplayed();
        driver.findElement(By.xpath("//button[@data-bb-handler='ok']")).click();
        driver.findElement(By.xpath("//a[@href='/admin/HotelAdmin'][1]")).click();
    }
}
