package day01_DriverMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day01_ClassWork {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver_mac64-2");

        WebDriverManager.chromedriver().setup();//setup
        WebDriver driver = new ChromeDriver();//create crome driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//implicit wait
        driver.manage().window().maximize();//maximize windows

        //Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");
        //Sayfa basligini (title) yazdirin
        System.out.println("sayfa basligi:"+driver.getTitle());
        //Sayfa basliginin "Amazon" icerdigini test edin
        String actualTitle = driver.getTitle();
        if(actualTitle.contains("amazon")){
            System.out.println("Title testi PASSED");
        }else System.out.println("Title testi FAILED");

        //Sayfa adresini(url) yazdirin
        System.out.println("sayfa url:" +driver.getCurrentUrl());
        //Sayfa url'inin "amazon" icerdigini test edin.
        String actualUrl = driver.getCurrentUrl();
        if(actualUrl.contains("amazon")){
            System.out.println("url testi PASSED");
        }else System.out.println("url testi FAILED");
        //Sayfa handle degerini yazdirin
        System.out.println("handle degeri = " +driver.getWindowHandle());
        //Sayfa HTML kodlarinda "Gateway" kelimesi gectigini test edin
        String sayfakodlari = driver.getPageSource();
        if(sayfakodlari.contains("Gateway")){
            System.out.println("source code testi PASSED");
        }else System.out.println("source code testi FAILED");
        //Sayfayi kapatin.
        driver.close();
    }
}
