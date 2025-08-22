package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton {
    public static void main(String[] args){
        System.setProperty("webdrive.chrome.driver","C:\\Users\\Rajkumar\\IdeaProjects\\javacode\\chromedriver.exe");
        ChromeDriver driver= new ChromeDriver();
        driver.get("https://paytm.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//label[text()='Round Trip']")).click();
        driver.findElement(By.xpath("//label[text()='One Way']")).click();
        driver.quit();
    }
}
