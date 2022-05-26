package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public abstract class TestBase {
    // abstract yapmamizin sebebi bu class'dan obje uretilmesinin onune gecmektir.
    protected WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @After
    public void tearDown(){

        driver.close();
    }

    public void anasayfaGiris(){
        driver.get("https://qa-environment.concorthotel.com");
        driver.findElement(By.id("details-button")).click();
        driver.findElement(By.id("proceed-link")).click();
    }
}
