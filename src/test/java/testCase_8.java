import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import utilities.ExtentReportSetUp;

public class testCase_8 extends ExtentReportSetUp
{

    @Test
    public void testCase5()
 {
     test=extent.createTest("TC_0008");
     test.info("8th TC started");
     test.pass("Test case passed");
     System.out.println("*****TC 8 Passed****");

 }
 @AfterClass
    public void tearDown()
 {

 }
}
