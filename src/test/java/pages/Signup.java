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

public class Signup extends CommonMethods {
    ExtentTest test;
    public Signup(ExtentTest test){
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
        this.test = test ;
    }
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

    // FailCase
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
    @FindBys(
            {
                    @FindBy(xpath = "//a[normalize-space()='Signup / Login']")
            }
    )
    WebElement selectsignup;
    @FindBys(
            {
                    @FindBy(xpath = "//input[@placeholder='Name']")
            }
    )
    WebElement username;
    @FindBys(
            {
                    @FindBy(xpath = "//input[@data-qa='signup-email']")
            }
    )
    WebElement useremail;
    @FindBys(
            {
                    @FindBy(xpath = "//button[normalize-space()='Signup']")
            }
    )
    WebElement signupbutton;
    @FindBys(
            {
                    @FindBy(xpath = "//input[@id='id_gender1']")
            }
    )
    WebElement radiobutton;
    @FindBys(
            {
                    @FindBy(xpath = "//input[@id='password']")
            }
    )
    WebElement passwordfield;
    @FindBys(
            {
                    @FindBy(xpath = "//input[@id='password']")
            }
    )
    WebElement dobday;
    @FindBys(
            {
                    @FindBy(xpath = "//input[@id='password']")
            }
    )
    WebElement dobmonth;

    @FindBys(
            {
                    @FindBy(xpath = "//input[@id='password']")
            }
    )
    WebElement checkbox1;
    @FindBys(
            {
                    @FindBy(xpath = "//input[@id='password']")
            }
    )
    WebElement checkbox2;
    @FindBys(
            {
                    @FindBy(xpath = "//input[@id='password']")
            }
    )
    WebElement firstname;
    @FindBys(
            {
                    @FindBy(xpath = "//input[@id='password']")
            }
    )
    WebElement lastname;
    @FindBys(
            {
                    @FindBy(xpath = "//input[@id='password']")
            }
    )
    WebElement company;
    @FindBys(
            {
                    @FindBy(xpath = "//input[@id='password']")
            }
    )
    WebElement address1;
    @FindBys(
            {
                    @FindBy(xpath = "//input[@id='password']")
            }
    )
    WebElement address2;
    @FindBys(
            {
                    @FindBy(xpath = "//input[@id='password']")
            }
    )
    WebElement country;
    @FindBys(
            {
                    @FindBy(xpath = "//input[@id='password']")
            }
    )
    WebElement state;
    @FindBys(
            {
                    @FindBy(xpath = "//input[@id='password']")
            }
    )
    WebElement city;
    @FindBys(
            {
                    @FindBy(xpath = "//input[@id='password']")
            }
    )
    WebElement zipcode;
    @FindBys(
            {
                    @FindBy(xpath = "//input[@id='password']")
            }
    )
    WebElement mobilenumber;
    @FindBys(
            {
                    @FindBy(xpath = "//input[@id='password']")
            }
    )
    WebElement createacc;


    public void signupMethod() throws IOException {
        try{
            if(selectsignup.isDisplayed()){
                selectsignup.click();
                waittime();
                passCase("Signup window is opened");
                try{
                    if(username.isDisplayed()){
                     username.sendKeys("Noor E Arafin Rafi");
                     waittime();
                     passCase("Username entered succesfully");
                     try{
                         if(useremail.isDisplayed()){
                             useremail.sendKeys("noorearafin@gmail.com");
                             waittime();
                             passCase("Email entered successfully");
                             try{
                                 if(signupbutton.isDisplayed()){
                                     signupbutton.click();
                                     waittime();
                                     passCase("Successfully open personal account information section");
                                     try{
                                         if(radiobutton.isDisplayed()){
                                             radiobutton.click();
                                             waittime();
                                             passCase("Radiobutton worked successfully");
                                             try{
                                                 if(passwordfield.isDisplayed()){
                                                     passwordfield.sendKeys("123456");
                                                     waittime();
                                                     passCase("Password entered successfully");
                                                 }
                                             }catch (Exception e){
                                                 failCase("Password is not entered successfully","passwordfield_failed");
                                             }
                                         }
                                     }catch(Exception e){
                                         failCase("Radiobutton worked successfully","radiobutton_failed");
                                     }
                                 }
                             }catch (Exception e){
                                 failCase("Successfully not open personal account information section","signupbutton_failed");
                             }
                         }
                     }catch (Exception e){
                         failCase("Email is not entered successfully","emailfield_failed");
                     }
                    }
                }catch (Exception e){
                    failCase("Username is not entered successfully","usernamefield_failed");
                }
            }
        }catch(Exception e){
            failCase("Signup window is not open successfully","signup_failed");
        }
    }


}
