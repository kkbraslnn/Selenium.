package day01_DriverMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_ManageMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/kubrakaratash/IdeaProjects/Seleniumm/src/main/resources/drivers/chromedriver_mac64-2");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //Amazon soyfasina gidelim. https://www.amazon.com/ driver.get("https://www.amazon.com/");
//Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfanin Konumu = "+driver.manage ().window() .getPosition ());
        System.out.println("Sayfanin Boyutlara = "+driver.manage() .window() .getSize());
//Sayfayi singe durumuna getirin driver.manage ().window().minimize();
//simge durumunda 3 saniye bekleyip sayfayi maximize pin
        Thread.sleep (  3000);
        driver.manage().window().maximize();
//Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println("Sayfanin Konumu = "+driver.manage () .window() .getPosition ());
        System.out.println("Sayfanin Boyutlara = "+driver.manage ().window().getSize ());
//Sayfayi fullscreen yapin
        Thread.sleep(  3000);
        driver.manage ().window().fullscreen();
//Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println("Sayfanin Konumv = "+driver.manage () .window() .getPosition());
        System.out.println("Sayfanan Boyutlara = "+driver.manage () .window () .getSize ());
//Sayfayi kapatin
        Thread.sleep(  2000);
        driver.close();
    }
}
