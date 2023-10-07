import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import utilities.ExtentReportSetUp;

public class testCase_6 extends ExtentReportSetUp
{

    @Test
    public void testCase5()
 {
     test=extent.createTest("TC_0006");
     test.info("6th TC started");
     test.pass("Test case passed");
     System.out.println("*****TC 6 Passed****");

 }
 @AfterClass
    public void tearDown()
 {

 }
}
