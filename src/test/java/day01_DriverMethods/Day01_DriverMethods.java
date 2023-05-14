package day01_DriverMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver_mac64-2");
        WebDriverManager.chromedriver().setup();//setup
        WebDriver driver = new ChromeDriver();//bos bir browser actik
        driver.get("https://www.amazon.com");//ilk olarak gitmek istediginiz sayfayi belirtiniz
        System.out.println("Sayfa Basligi:"+driver.getTitle());
        System.out.println("Sayfa Url'i:"+driver.getCurrentUrl());
       // System.out.println(driver.getPageSource());
        System.out.println(driver.getWindowHandle());//bize o window a ait hash degerini verir.biz
                                                     // bu hash degerlerini bir stringe atayip pencereler arasi gecis yapabiliriz










    }
}
