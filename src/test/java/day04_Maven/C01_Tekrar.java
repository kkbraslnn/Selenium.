package day04_Maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Tekrar {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver_mac64-2");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //-Amazon sayfasana gidiniz
        driver.get("https://www.amazon.com");
        //-Arama kutusunu locate ediniz
        /*
        <input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off" placeholder=""
        class="nav-input nav-progressive-attribute" dir="auto" tabindex="0" aria-label="Search" spellcheck="false">
         */
        WebElement aramakutusu = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
        //-Arama kutusunun tagName'inin input oldugunu test ediniz
        String actualTagname = aramakutusu.getTagName();
        String expectedTagname = "input";
        if (actualTagname.equals(expectedTagname)){
            System.out.println("Tagname Test PASSED : "+actualTagname);
        }else System.out.println("Tagname Test FAILED"+actualTagname);
        //-Arama kutusunun name atributo'non degerinin field-keywords olduäunu test ediniz
        String actualAttributeName = aramakutusu.getAttribute("name");
        String expectedAttributeName = "field-keywords";
        if (actualAttributeName.equals(expectedAttributeName)){
            System.out.println("Attribute Test PASSED");
        }else System.out.println("Attribute Test FAILED");
        //-Sayfayi kapatiniz
        driver.close();

    }
}
