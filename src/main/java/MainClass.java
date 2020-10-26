import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainClass {
    static WebDriver driver;
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Deri\\IdeaProjects\\UdemyMaven\\Drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.delivery-club.ru/moscow");
    }
}
