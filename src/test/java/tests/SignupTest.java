package tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import drivers.PageDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Login;
import pages.Signup;
import utilities.CommonMethods;
import utilities.ExtentFactory;

import java.io.IOException;

public class SignupTest extends CommonMethods {
    ExtentReports report;
    ExtentTest parentTest;
    ExtentTest childTest;
    @BeforeClass
    public void openUrl() throws InterruptedException {
        PageDriver.getCurrentDriver().get(url);
        waittime();
        report = ExtentFactory.getInstance();
        parentTest = report.createTest("<p style=\"color:#FF6000; font-size:20px\"><b>Signup Validation</b></p>").assignAuthor("Noor E Arafin Rafi").assignDevice("Windows");
    }
    @Test(priority = 1)
    public void test() throws InterruptedException, IOException {
        childTest = parentTest.createNode("<p style=\"color:#3E96E7; font-size:20px\"><b>Signup</b></p>");
        Signup signupobj = new Signup(childTest);
        signupobj.signupMethod();
    }
    @AfterClass
    public void report() {
        report.flush();
    }
}
