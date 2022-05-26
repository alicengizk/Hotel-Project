package US_03;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class TC_0004 extends TestBase {

    /*
    Save buttonunun görünürlüğü kontrol edilmeli ve save buttonuna tıklanmalı
    https://qa-environment.concorthotel.com/ sayfasında sağ üstte bulunan Login linki tıklanır
    https://qa-environment.concorthotel.com/Account/Logon sayfasındaki
    Create a new account butonuna tıklayın
    https://qa-environment.concorthotel.com/Account/Register sayfasının açıldığını kontrol edin
    Username textbox görünürlüğü kontrol edilmeli ve username girilmeli
    Password textbox görünürlüğü kontrol edilmeli ve password girilmeli
    Email textbox görünürlüğü kontrol edilmeli ve email adresi girilmeli
    Full Name textbox görünürlüğü kontrol edilmeli ve isim-soyisim girilmeli
    Phone No textbox görünürlüğü kontrol edilmeli ve telefon numarası girilmeli
    Social Security Number No textbox görünürlüğü kontrol edilmeli ve SSN girilmeli
    Driving License textbox görünürlüğü kontrol edilmeli ve ehliyet kodu girilmeli
    Country selectbox görünürlüğü kontrol edilmeli ve ülke seçilmeli,
    State selectbox görünürlüğü kontrol edilmeli ve ilgili ülkede eyalet sistemi varsa seçilmeli,
    Address textbox görünürlüğü kontrol edilmeli ve adres girilmeli
    Working Sector görünürlüğü kontrol edilmeli ve meslek sektörü girilmeli
    Birth Date kısmındaki date inputun görünürlüğü kontrol edilmeli ve doğum tarihi seçilmeli
    Save buttonunun olup olmadığı kontrol edilmeli ve tıklanmalı
     */

    @Test
    public void test04() {
        Faker faker = new Faker();
        anasayfaGiris();
        driver.findElement(By.xpath("//a[@href='/Account/Logon']")).click();
        driver.findElement(By.xpath("//span[@class='btn btn-primary py-3 px-5']")).click();
        String expectedURL = "https://qa-environment.concorthotel.com/Account/Register";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(expectedURL, actualURL);
        driver.findElement(By.id("UserName")).isDisplayed();
        driver.findElement(By.id("UserName")).sendKeys(faker.name().username());
        driver.findElement(By.id("Password")).isDisplayed();
        driver.findElement(By.id("Password")).sendKeys(faker.internet().password());
        driver.findElement(By.id("Email")).isDisplayed();
        driver.findElement(By.id("Email")).sendKeys(faker.internet().emailAddress());
        driver.findElement(By.id("NameSurname")).sendKeys(faker.name().name(), " ", faker.name().lastName());
        driver.findElement(By.id("PhoneNo")).isDisplayed();
        driver.findElement(By.id("PhoneNo")).sendKeys(faker.phoneNumber().phoneNumber());
        driver.findElement(By.id("SSN")).isDisplayed();
        driver.findElement(By.id("SSN")).sendKeys("111111111");
        driver.findElement(By.id("DrivingLicense")).isDisplayed();
        driver.findElement(By.id("DrivingLicense")).sendKeys("1111111111");
        driver.findElement(By.id("IDCountry")).isDisplayed();
        driver.findElement(By.xpath("//select[@id='IDCountry']//option[@value='251']")).click();
        driver.findElement(By.id("IDState")).isDisplayed();
        driver.findElement(By.xpath("//select[@id='IDState']//option[@value='269']")).click();
        driver.findElement(By.id("Address")).isDisplayed();
        driver.findElement(By.id("Address")).sendKeys(faker.address().fullAddress());
        driver.findElement(By.id("WorkingSector")).isDisplayed();
        driver.findElement(By.id("WorkingSector")).sendKeys(faker.job().field());
        driver.findElement(By.id("BirthDate")).isDisplayed();
        driver.findElement(By.id("BirthDate")).sendKeys("6/3/1982");
        driver.findElement(By.id("btnSubmit")).isDisplayed();
        driver.findElement(By.id("btnSubmit")).click();

    }

}
