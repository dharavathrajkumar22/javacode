package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class tagname {
    public static void main(String[] args){
System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajkumar\\IdeaProjects\\javacode\\chromedriver.exe");
ChromeDriver driver= new ChromeDriver();
driver.get("https://id.heroku.com/");
driver.manage().window().maximize();
 List<WebElement> nametag= driver.findElements(By.tagName("label"));
        System.out.println(nametag.size());
        driver.quit();

    }
}
