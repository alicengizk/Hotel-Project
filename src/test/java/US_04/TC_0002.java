package US_04;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class TC_0002 extends TestBase {

    /*
    Yeni otel cod,name,adress,phone ve email bilgileri ilgili alana girilebilmeli
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
     */

    @Test
    public void test02() {
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




    }
}
