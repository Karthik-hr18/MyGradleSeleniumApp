import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {

    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {

        // Print message
        System.out.println(new App().getGreeting());

        // Setup WebDriver (Linux path)
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");

        // Launch browser
        WebDriver driver = new ChromeDriver();

        // Open website
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        // Perform login
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }
}
