import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import utilities.ExtentReportSetUp;

public class testCase_5 extends ExtentReportSetUp
{

    @Test
    public void testCase5()
 {
     test=extent.createTest("TC_0005");
     test.info("5th TC started");
     test.pass("Test case passed");
     System.out.println("*****TC 5 Passed****");

 }
 @AfterClass
    public void tearDown()
 {

 }
}
