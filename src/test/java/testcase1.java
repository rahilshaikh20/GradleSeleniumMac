import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import pages.PageOne;
import utilities.Base;
import utilities.ExtentReportSetUp;

public class testcase1 extends ExtentReportSetUp
{
    Base b= new Base();
    public WebDriver driver;
    PageOne p = new PageOne();

    @Test
    public void testCase1()
 {
     test=extent.createTest("TC_0001");
     //driver= b.loadDriver();
   //  b.loadURL();
     String Path ="usr/local/bin/chromedriver";

    System.setProperty("webdriver.chrome.driver", Path);
    // WebDriverManager.chromedriver().mac().setup();
     driver= new ChromeDriver();
     driver.get("https://www.google.com/");
     test.info("First TC started");
     test.pass("Test case passed");

     driver.findElement(PageOne.text_field).sendKeys("Messi");
     driver.findElement(p.Search_button).click();

     String title = driver.getTitle();
     test.pass("Page Title is: "+title);

     System.out.println("TC1 executed");
 }
 @AfterClass
    public void tearDown()
 {
     driver.quit();
 }
}
