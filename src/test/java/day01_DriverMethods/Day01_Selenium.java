package day01_DriverMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_Selenium {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/kubrakaratash/IdeaProjects/Seleniumm/src/main/resources/drivers/chromedriver_mac64-2");
      /*
      En temel haliyle otomasyon yapmak icin class imiza otomasyon icin gerekli olan
      web driver'in yerini gostermeniz gerekir.Bunun icin Java kutuphanesinden
      System.setProperty() methodunun icine ilk olarak driveri yazariz .Ikinci olarak driver in fiziki yolunu kopyalariz.
       */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");



    }
}
