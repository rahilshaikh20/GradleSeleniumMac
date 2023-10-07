import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import utilities.ExtentReportSetUp;

public class testCase_7 extends ExtentReportSetUp
{

    @Test
    public void testCase5()
 {
     test=extent.createTest("TC_0007");
     test.info("7th TC started");
     test.pass("Test case passed");
     System.out.println("*****TC 7 Passed****");

 }
 @AfterClass
    public void tearDown()
 {
     System.out.println("***After Class***");
 }

    @AfterSuite
    public void tearDown1()
    {
        System.out.println("***After Suite***");
    } @BeforeSuite
public void tearDown2()
{
    System.out.println("***Before Suite***");
}
}
