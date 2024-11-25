package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumTest {
    private static WebDriver driver;

    @BeforeAll
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void chromeIntialize() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void seleniumTest(){
        driver.get("https://google.com");
    }
    @AfterEach
    public void tearDown(){
        driver.quit();
    }
}
