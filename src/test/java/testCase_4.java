import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import utilities.ExtentReportSetUp;

public class testCase_4 extends ExtentReportSetUp
{

    @Test
    public void testCase1()
 {
     test=extent.createTest("TC_0004");
     test.info("4th TC started");
     test.fail("Test case passed");
     System.out.println("*****TC Passed****");

 }
 @AfterClass
    public void tearDown()
 {

 }
}
