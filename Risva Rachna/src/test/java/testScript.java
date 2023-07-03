import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class testScript {

    public static WebDriver driver;

    @BeforeMethod
    public void init() {
        System.setProperty("webdriver.chrome.driver", "C:\\Ani\\SeleniumTesting\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://amazon.in");
    }

    /*
    Search: "Wrist Watches"
Display: "Analogue"
Brands Material: "Leather"
Brand: "Titan"
Discount: "25% Off or more"
     */

    @Test(priority = 1)
    public void tc_01() throws InterruptedException, IOException {

        WebElement searchBar = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));

        searchBar.sendKeys("Wrist Watches");
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

        WebElement enter= driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
        enter.click();


        WebElement Brandtitan = driver.findElement(By.xpath("//*[@id=\"p_89/Titan\"]/span/a/div/label/i"));
        Brandtitan.click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);


        WebElement discount = driver.findElement(By.xpath("//*[@id=\"p_n_pct-off-with-tax/2665400031\"]/span/a/span"));
        discount.click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        WebElement analogue = driver.findElement(By.xpath("//*[@id=\"p_n_feature_seven_browse-bin/1480900031\"]/span/a/div/label/i"));
        analogue.click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);


        WebElement BrandMaterial = driver.findElement(By.xpath("//*[@id=\"p_n_material_browse/1480907031\"]/span/a/div/label/i"));
        BrandMaterial.click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);


        WebElement fifthElement = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[6]/div/div/div/div/div[2]/div[1]/h2/a/span"));
        fifthElement.click();

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        System.out.println("Test Case 1 passes");


        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

   /* @AfterMethod
    public void quit()
    {
        driver.quit();
    }*/
}