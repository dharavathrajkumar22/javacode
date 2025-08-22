package selenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class openingchromeANDmethods {
    public static void main(String[] args){

        //chrome ===============================
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajkumar\\IdeaProjects\\javacode\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();
        driver.navigate().to("https://www.instagram.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        String pagetitile=driver.getTitle();
        System.out.println(pagetitile);
        String URL=driver.getCurrentUrl();
        System.out.println(URL);
        //driver.getTitle(); // chck when net comes
        //driver.getCurrentUrl();
        driver.quit();

        //edge======================================
        System.setProperty("webdriver.edge.driver","C:\\Users\\Rajkumar\\IdeaProjects\\javacode\\msedgedriver.exe");
        EdgeDriver driver1=new EdgeDriver();
        driver1.get("https://www.facebook.com/");
        driver1.manage().window().maximize();
        driver1.navigate().to("https://www.instagram.com/");
        driver1.navigate().back();
        driver1.navigate().forward();
        driver1.navigate().refresh();
        String pagetitile1=driver1.getTitle();
        System.out.println(pagetitile1);
        String URL1=driver1.getCurrentUrl();
        System.out.println(URL1);
        driver1.quit();
        //FirefoxDriver driver2=new FirefoxDriver();
        //OperaDriver driver3=new OperaDriver();
    }
}
