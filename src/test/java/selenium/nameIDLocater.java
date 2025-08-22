package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class nameIDLocater {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajkumar\\IdeaProjects\\javacode\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");
        WebElement usernameElement = driver.findElement(By.name("user-name"));
        usernameElement.sendKeys("standard_user");
        WebElement passwordElement=driver.findElement(By.id("password"));
        passwordElement.sendKeys("secret_sauce");
        WebElement loginbutton = driver.findElement(By.id("login-button"));
        loginbutton.click();
        String title= driver.getTitle();
        System.out.println(title);
        String Url=driver.getCurrentUrl();
        System.out.println(Url);
        driver.quit();
    }
}
