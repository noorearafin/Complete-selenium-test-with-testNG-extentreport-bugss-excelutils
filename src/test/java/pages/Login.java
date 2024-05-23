package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import drivers.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import utilities.CommonMethods;
import utilities.GetScreenShot;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Login extends CommonMethods {
    ExtentTest test;
    public Login(ExtentTest test){
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
        this.test = test ;
    }
    @FindBys(
            {
                    @FindBy(xpath = "//a[normalize-space()='Signup / Login']")
            }
    )
    WebElement selectlogin;
    @FindBys(
            {
                    @FindBy(xpath = "//input[@data-qa='login-email']")
            }
    )
    WebElement emailfield;
    @FindBys(
            {
                    @FindBy(xpath = "//input[@placeholder='Password']")
            }
    )
    WebElement passwordfield;
    @FindBys(
            {
                    @FindBy(xpath = "//button[normalize-space()='Login']")
            }
    )
    WebElement loginbutton;
    @FindBys(
            {
                    @FindBy(xpath = "//p[normalize-space()='Your email or password is incorrect!']")
            }
    )
    WebElement userpassvalidation;

    // Pass Case
    public void passCase(String message) {
        test.pass("<p style=\"color:#85BC63; font-size:13px\"><b>" + message + "</b></p>");
    }

    @SuppressWarnings("unused")
    public void passCaseWithSC(String message, String scName) throws IOException {
        test.pass("<p style=\"color:#85BC63; font-size:13px\"><b>" + message + "</b></p>");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH.mm.ss");
        String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "" + scName + "");
        String dest = System.getProperty("user.dir") + "\\screenshots\\" + "" + scName +" "+ dateFormat.format(new Date()) + ".png";
        test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
    }

    // Fail
    @SuppressWarnings("unused")
    public void failCase(String message, String scName) throws IOException {
        test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>" + message + "</b></p>");
        Throwable t = new InterruptedException("Exception");
        test.fail(t);
        String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "" + scName + "");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH.mm.ss");
        String dest = System.getProperty("user.dir") + "\\screenshots\\" + "" + scName +" "+ dateFormat.format(new Date()) + ".png";
        test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
        PageDriver.getCurrentDriver().quit();
    }

    public void loginMethod(){
        try {
            if(selectlogin.isDisplayed()){
                selectlogin.click();
                waittime();
                try{
                    if (emailfield.isDisplayed()) {
                        emailfield.sendKeys("noorearafin@gmail.com");
                        passCase("You have entered the username");
                        waittime();
                        try{
                            if(passwordfield.isDisplayed())
                                passwordfield.sendKeys("123456");
                            passCase("You have entered the password");
                            waittime();
                            try{
                                if(loginbutton.isDisplayed()){
                                    loginbutton.click();
                                    waittime();
                                    if(userpassvalidation.isDisplayed()) {

                                        passCaseWithSC("Use correct username password", "login_pass");
                                    }
                                    else
                                    {
                                        //passCase("Logged in successfully");
                                        System.out.println("Successful");
                                        passCaseWithSC("login successfully", "login_pass");
                                    }
                                }
                            }catch (Exception e){
                                System.out.println("login field not work");
                            }
                        }catch (Exception e){
                            System.out.println("password input field not work");
                        }
                    }
                }catch (Exception e){
                    System.out.println("email input field not work");
                }
            }
        }catch (Exception e){
            System.out.println("login header button not worked is not displayed");
        }
    }
}
