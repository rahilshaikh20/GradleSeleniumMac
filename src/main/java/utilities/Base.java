package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import java.time.Duration;

public class Base {
    public WebDriver driver;
    String URL = "http://www.google.com"; // Website name to be launched
    String Browsername = "Chrome"; // Enter the Browser name

    public void loadURL() // getting URL from string(Browser factory)
    {
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
    }

    public WebDriver loadDriver() {
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        if (Browsername.equals("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();

        } else if (Browsername.equalsIgnoreCase("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        } else if (Browsername.equalsIgnoreCase("IE")) {
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
        }
        return driver;
    }
}
