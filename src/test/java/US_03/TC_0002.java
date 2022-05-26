package US_03;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class TC_0002 extends TestBase {

    /*
    Register sayfası görüntülenmeli
    https://qa-environment.concorthotel.com/ sayfasında sağ üstte bulunan Login linki tıklanır
    https://qa-environment.concorthotel.com/Account/Logon sayfasındaki
    Create a new account butonuna tıklayın
    https://qa-environment.concorthotel.com/Account/Register sayfasının açıldığını kontrol edin
     */

    @Test
    public void test02() {
        anasayfaGiris();
        driver.findElement(By.xpath("//a[@href='/Account/Logon']")).click();
        driver.findElement(By.xpath("//span[@class='btn btn-primary py-3 px-5']")).click();
        String expectedURL="https://qa-environment.concorthotel.com/Account/Register";
        String actualURL=driver.getCurrentUrl();
        Assert.assertEquals(expectedURL,actualURL);
    }
}
