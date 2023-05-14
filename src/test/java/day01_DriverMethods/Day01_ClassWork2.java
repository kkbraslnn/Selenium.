package day01_DriverMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day01_ClassWork2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kubrakaratash/IdeaProjects/Seleniumm/src/main/resources/drivers/chromedriver_mac64-2");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //ChromeDriver kullanarak, facebook sayfasino gidin ve sayfa basliginin (title) "facebook" //oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.get("https://facebook.com");
        String actualTitle = driver.getTitle();
        if (actualTitle.contains("facebook")) {
            System.out.println("Title Testi PASSED");
        } else System.out.println("Title Testi FAILED");
        System.out.println("Dogru Baslik : " + actualTitle);
//Sayfo URL'inin "facebook" kelimesi icerdigini dogrulayin, icermiyorsa "actual" URL'1 //yazdirin.
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains("facebook")) {
            System.out.println("Url Testi PASSED");
        } else System.out.println("Url Testi FAILED" + actualUrl);
//https://www.walmart.com/ sayfasing gidin. driver.get("https://www.walmart.com/");
//Sayfa bastiginin "Walmart.com" icerdigini dogrulayin.
        String actualWalmartTitle = driver.getTitle();
        String expectedWalmartTitle = "Walmart.com";
        if (actualWalmartTitle.contains(expectedWalmartTitle)) {
            System.out.println("Title Testi PASSED");
        }else System.out.println("Title Testi FAILED "+actualTitle);
    }
}