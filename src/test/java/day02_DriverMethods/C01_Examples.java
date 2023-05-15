package day02_DriverMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Examples {
    public static void main(String[] args) {
        /*
        Sirasiyla amazon,facebook ve youtube sayfalarina gidelim.
        Amazon sayfasina tekrar donelim.
        Amazon sayfasinin url ' inin https://www.amazon.com/ adresine esit oldugunu test edelim
        Sayfanin konumu ve pozisyonunu yazdiralim
        sayfanin konumunu ve size ini istedigimiz sekilde ayarlayalim
        ve istedigimiz sekilde oldugunu test edelim
        ve sayfayi kapatalim.
        */
        System.setProperty("webdriver.chrome.driver","/Users/kubrakaratash/IdeaProjects/Seleniumm/src/main/resources/drivers/chromedriver_mac64-2");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");
        driver.get("https://www.facebook.com/");
        driver.get("https://www.youtube.com/");
        driver.navigate().back();
        driver.navigate().back();
        String actualurl = driver.getCurrentUrl();
        String expectedurl ="https://www.amazon.com/";
        if (actualurl.equals(expectedurl)){
            System.out.println("url test passed");
        }else System.out.println("url test failed");
        System.out.println("sayfanin size:" +driver.manage().window().getSize());
        System.out.println("expectedurl = " +driver.manage().window().getPosition());
        driver.manage().window().setSize(new Dimension(600,600));
        driver.manage().window().setPosition(new Point(50,50));
        Dimension actualnewSIZE = driver.manage().window().getSize();
        if(actualnewSIZE.getWidth()==600 && actualnewSIZE.getHeight()==600) {
            System.out.println("size test PASSED");
        }else System.out.println("size test FAILED");

        Point actualnewlocation = driver.manage().window().getPosition();
        if(actualnewlocation.getX()==50 && actualnewlocation.getY()==50){
            System.out.println("location test PASSED");
        }else System.out.println("location test FAILED");
        driver.close();













    }
}
