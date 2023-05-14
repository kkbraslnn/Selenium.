package day01_DriverMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_NavigateMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/kubrakaratash/IdeaProjects/Seleniumm/src/main/resources/drivers/chromedriver_mac64-2");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //Amazon sayfasina gidelim
        driver.navigate().to("https://amazon.com");
        //techproeducation sayfasina gidelim
        Thread.sleep(3000);
        driver.navigate().to("https://techproeducation.com");
        //Tekrar amazon sayfasina donelim
        driver.navigate().back();
        //Tekrar techproeducation sayfasina gidelim
        driver.navigate().forward();
        //son sayfada sayfayi yenileyelim
        driver.navigate().refresh();
        //ve sayfayi kapatalim


    }
}
