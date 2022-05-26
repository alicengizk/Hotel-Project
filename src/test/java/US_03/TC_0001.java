package US_03;

import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class TC_0001 extends TestBase {

    /*
    log in sayfasina görüntülenmeli
    https://qa-environment.concorthotel.com/ sayfasında sağ üstte bulunan Login linki tıklanır
    https://qa-environment.concorthotel.com/Account/Logon sayfasındaki Create a new account butonuna tıklayın
     */

    @Test
    public void test01() {
        anasayfaGiris();
        driver.findElement(By.xpath("//a[@href='/Account/Logon']")).click();
        driver.findElement(By.xpath("//span[@class='btn btn-primary py-3 px-5']")).click();


    }
}
