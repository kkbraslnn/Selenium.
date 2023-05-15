package day02_DriverMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_WebElementsveLocators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/kubrakaratash/IdeaProjects/Seleniumm/src/main/resources/drivers/chromedriver_mac64-2");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Amazon sayfasin a gidelim
        //
        //Search bolumunu locate edelim
        //Search bolumunde iphone aratalim
        driver.get("https://amazon.com");
        WebElement aramakutusu = driver.findElement(By.id("twotab"));
        aramakutusu.sendKeys("iphone", Keys.ENTER);
        /*
        Eger bir webelementi (web sayfasindaki herbir buton ya da text/yazi) locate (konumunu belirleme)
        etmek istersek once manuel olarak web sayfasini acip sayfa uzerinde sag click yapip inceleye tiklariz.
        karsimiza cikan HTML kodlarindan locater lardan (konum belirleyiciler) essiz olani seceriz.
        Genellikle id Attribute kullanilir.Sectigimiz attribute degerini findelement() metodu icine
        findelement(By.id("attribute degeri")) seklinde yazariz
         */
        //Amazon sayfasindaki <input> ve <a> tag larinin saysini yazdiriniz.

        List<WebElement> inputTags = driver.findElements(By.tagName("input"));
        System.out.println("input tag sayisi =" + inputTags.size());
        List<WebElement> linklerList = driver.findElements(By.tagName("a"));
        System.out.println("Link Sayisi =" +linklerList.size());















    }
}
