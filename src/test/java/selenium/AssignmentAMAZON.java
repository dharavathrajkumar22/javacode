package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AssignmentAMAZON {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajkumar\\IdeaProjects\\javacode\\chromedriver.exe");
        ChromeDriver driver =new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        WebElement search =driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
        search.sendKeys("ear burds wireless");
        driver.findElement(By.xpath("//input[contains(@id,'nav-search-submit-button')]")).click(); //input[@type='submit'] //input[@id='nav-search-submit-button']
        List<WebElement> listsize1= driver.findElements(By.xpath("//span[contains(@class,'a-size-base s-underline-text')]"));
        System.out.println("Size is =>"  + listsize1.size());
    }
}
