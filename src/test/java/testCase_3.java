import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import pages.PageOne;
import utilities.Base;
import utilities.ExtentReportSetUp;

public class testCase_3 extends ExtentReportSetUp
{

    @Test
    public void testCase1()
 {
     test=extent.createTest("TC_0003");
     test.info("Third TC started");
     Assert.fail("This failed by the user");
     test.fail("Test case failed");

 }
 @AfterClass
    public void tearDown()
 {

 }
}
