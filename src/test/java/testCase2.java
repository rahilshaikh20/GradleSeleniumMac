import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import pages.PageOne;
import utilities.Base;
import utilities.ExtentReportSetUp;

public class testCase2 extends ExtentReportSetUp
{
    Base b= new Base();
    WebDriver driver;
    PageOne p = new PageOne();

    @Test
    public void testCase1()
 {
     test=extent.createTest("TC_0002");
     driver= b.loadDriver();
     b.loadURL();

     test.info("@nd TC started");
     test.pass("Test case passed");

     driver.findElement(PageOne.text_field).sendKeys("Ronaldo");
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
