package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
    public static void main(String[] args){
        System.setProperty("webdrive.chrome.driver","C:\\Users\\Rajkumar\\IdeaProjects\\javacode\\chromedriver.exe");
        ChromeDriver driver= new ChromeDriver();
        driver.get("https://paytm.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[text()='Bus']")).click();
        driver.findElement(By.xpath("//label[text()='Round trip']")).click();
        WebElement firstloc =driver.findElement(By.xpath("//input[@id='dwebSourceInput']"));
        firstloc.sendKeys("Hyderabad");
        //driver.findElement(By.xpath("//div[text()='Hyderabad']")).click();
        WebElement sencondloc =driver.findElement(By.xpath("//input[@id='dwebDestinationInput']"));
        sencondloc.sendKeys(" Bengaluru");
        //driver.findElement(By.xpath("//div[text()='Bengaluru']")).click();
        driver.findElement(By.xpath("//div[text()='Sleeper']")).click();
        driver.findElement(By.xpath("//label[@id='busFilterCheckBox']")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
        //driver.quit();
        //working but location got switching and screen moves down
    }
}
