package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktextandpartiallinktext {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajkumar\\IdeaProjects\\javacode\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.heroku.com");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(" Name of the site ==> "+ title);
        WebElement login = driver.findElement(By.id("logged-out-login"));
        login.click();
        String title1=driver.getTitle();
        System.out.println("Name of the login page verification ==> " + title);
        WebElement username= driver.findElement(By.name("email"));
        username.sendKeys("rajkumar@gmail.com");
        WebElement password= driver.findElement(By.id("password"));
    password.sendKeys("123456789");
//    WebElement clicklogin =driver.findElement(By.name("commit"));
//    clicklogin.click();
        driver.findElement(By.name("commit")).click();  // direct code upper one use to store in variable
        driver.findElement(By.linkText("Forgot your password?")).click();
        driver.navigate().back();
        driver.findElement(By.partialLinkText("Log")).click();
    }
}
