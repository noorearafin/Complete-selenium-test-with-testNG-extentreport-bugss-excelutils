package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import drivers.PageDriver;
import org.apache.commons.lang3.RandomStringUtils;
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
                    @FindBy(xpath = "//select[@id='days']")
            }
    )
    WebElement dobday;
    @FindBys(
            {
                    @FindBy(xpath = "//option[normalize-space()='1']")
            }
    )
    WebElement dobdayitem;
    @FindBys(
            {
                    @FindBy(xpath = "//select[@id='months']")
            }
    )
    WebElement dobmonth;
    @FindBys(
            {
                    @FindBy(xpath = "//option[normalize-space()='January']")
            }
    )
    WebElement dobmonthitem;
    @FindBys(
            {
                    @FindBy(xpath = "//select[@id='years']")
            }
    )
    WebElement dobyear;
    @FindBys(
            {
                    @FindBy(xpath = "//option[normalize-space()='2000']")
            }
    )
    WebElement dobyearitem;
    @FindBys(
            {
                    @FindBy(xpath = "//input[@id='newsletter']")
            }
    )
    WebElement checkbox1;
    @FindBys(
            {
                    @FindBy(xpath = "//input[@id='optin']")
            }
    )
    WebElement checkbox2;
    @FindBys(
            {
                    @FindBy(xpath = "//input[@id='first_name']")
            }
    )
    WebElement firstname;
    @FindBys(
            {
                    @FindBy(xpath = "//input[@id='last_name']")
            }
    )
    WebElement lastname;
    @FindBys(
            {
                    @FindBy(xpath = "//input[@id='company']")
            }
    )
    WebElement company;
    @FindBys(
            {
                    @FindBy(xpath = "//input[@id='address1']")
            }
    )
    WebElement address1;
    @FindBys(
            {
                    @FindBy(xpath = "//input[@id='address2']")
            }
    )
    WebElement address2;
    @FindBys(
            {
                    @FindBy(xpath = "//select[@id='country']")
            }
    )
    WebElement country;
    @FindBys(
            {
                    @FindBy(xpath = "//option[@value='United States']")
            }
    )
    WebElement countryitem;
    @FindBys(
            {
                    @FindBy(xpath = "//input[@id='state']")
            }
    )
    WebElement state;
    @FindBys(
            {
                    @FindBy(xpath = "//input[@id='city']")
            }
    )
    WebElement city;
    @FindBys(
            {
                    @FindBy(xpath = "//input[@id='zipcode']")
            }
    )
    WebElement zipcode;
    @FindBys(
            {
                    @FindBy(xpath = "//input[@id='mobile_number']")
            }
    )
    WebElement mobilenumber;
    @FindBys(
            {
                    @FindBy(xpath = "//button[normalize-space()='Create Account']")
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
                             //use random email cause email is unique
                             useremail.sendKeys(RandomStringUtils.randomAlphanumeric(10)+"@gmail.com");
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
                                                     try {
                                                         if(dobday.isDisplayed()){
                                                             dobday.click();
                                                             waittime();
                                                             passCase("Day dropdown is opened successfully");
                                                             try {
                                                                 if(dobdayitem.isDisplayed()){
                                                                     dobdayitem.click();
                                                                     waittime();
                                                                     passCase("Day dropdown item selected successfully");
                                                                     try {
                                                                         if(dobmonth.isDisplayed()){
                                                                             dobmonth.click();
                                                                             waittime();
                                                                             passCase("Month dropdown is opened successfully");
                                                                             try{
                                                                                 if(dobmonthitem.isDisplayed()){
                                                                                     dobmonthitem.click();
                                                                                     waittime();
                                                                                     passCase("Month dropdown item is opened successfully");
                                                                                     try {
                                                                                         if(dobyear.isDisplayed()){
                                                                                             dobyear.click();
                                                                                             waittime();
                                                                                             passCase("Year dropdown is opened successfully");
                                                                                             try{
                                                                                                 if(dobyearitem.isDisplayed()){
                                                                                                     dobyearitem.click();
                                                                                                     waittime();
                                                                                                     passCase("Year dropdown item is opened successfully");
                                                                                                     try {
                                                                                                         if(checkbox1.isDisplayed()){
                                                                                                            checkbox1.click();
                                                                                                            waittime();
                                                                                                            passCase("First checkbox clicked successfully");
                                                                                                            try {
                                                                                                                if(checkbox2.isDisplayed()) {
                                                                                                                    checkbox2.click();
                                                                                                                    waittime();
                                                                                                                    passCase("Second checkbox clicked successfully");
                                                                                                                    try{
                                                                                                                        if(firstname.isDisplayed()) {
                                                                                                                            firstname.sendKeys("Noor e arafin");
                                                                                                                            waittime();
                                                                                                                            passCase("First name is inserted successfully");
                                                                                                                            try {
                                                                                                                                if(lastname.isDisplayed()){
                                                                                                                                    lastname.sendKeys("Rafi");
                                                                                                                                    waittime();
                                                                                                                                    passCase("Last name is inserted successfully");
                                                                                                                                    try {
                                                                                                                                        if(company.isDisplayed()){
                                                                                                                                            company.sendKeys("abcd Ltd");
                                                                                                                                            waittime();
                                                                                                                                            passCase("Company name inserted successfully");
                                                                                                                                            try {
                                                                                                                                                if(address1.isDisplayed()){
                                                                                                                                                    address1.sendKeys("Dhaka,Bangladesh");
                                                                                                                                                    waittime();
                                                                                                                                                    passCase("Address1 inserted successfully");
                                                                                                                                                    try {
                                                                                                                                                        if(address2.isDisplayed()) {
                                                                                                                                                            address2.sendKeys("Dhaka,Bangladesh");
                                                                                                                                                            waittime();
                                                                                                                                                            passCase("Address2 inserted successfully");
                                                                                                                                                            try {
                                                                                                                                                                if(country.isDisplayed()) {
                                                                                                                                                                    country.click();
                                                                                                                                                                    waittime();
                                                                                                                                                                    passCase("Country dropdown selected successfully");
                                                                                                                                                                    try {
                                                                                                                                                                        if(countryitem.isDisplayed()) {
                                                                                                                                                                            countryitem.click();
                                                                                                                                                                            waittime();
                                                                                                                                                                            passCase("Country dropdown item selected successfully");
                                                                                                                                                                            try {
                                                                                                                                                                                if(state.isDisplayed()) {
                                                                                                                                                                                    state.sendKeys("Dhaka");
                                                                                                                                                                                    waittime();
                                                                                                                                                                                    passCase("State name is inserted successfully");
                                                                                                                                                                                    try {
                                                                                                                                                                                        if(city.isDisplayed()){
                                                                                                                                                                                            city.sendKeys("Dhaka");
                                                                                                                                                                                            waittime();
                                                                                                                                                                                            passCase("City name is inserted successfully");
                                                                                                                                                                                            try {
                                                                                                                                                                                                if(zipcode.isDisplayed()) {
                                                                                                                                                                                                    zipcode.sendKeys("12314");
                                                                                                                                                                                                    waittime();
                                                                                                                                                                                                    passCase("Zip code is inserted successfully");
                                                                                                                                                                                                    try {
                                                                                                                                                                                                        if(mobilenumber.isDisplayed()) {
                                                                                                                                                                                                            mobilenumber.sendKeys("+88023424324345");
                                                                                                                                                                                                            waittime();
                                                                                                                                                                                                            passCase("Mobile number is inserted successfully");
                                                                                                                                                                                                            try {
                                                                                                                                                                                                                if(createacc.isDisplayed()){
                                                                                                                                                                                                                    createacc.click();
                                                                                                                                                                                                                    waittime();
                                                                                                                                                                                                                    passCase("Create account successfully");
                                                                                                                                                                                                                    passCaseWithSC("Signup successfully", "signup_pass");
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }catch (Exception e){
                                                                                                                                                                                                                failCase("Account is not created successfully","mobile_failed");
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }catch (Exception e){
                                                                                                                                                                                                        failCase("Mobile number is not inserted successfully","mobile_failed");
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                            }catch (Exception e){
                                                                                                                                                                                                failCase("Zip code is not inserted successfully","zip_failed");
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }catch (Exception e){
                                                                                                                                                                                        failCase("City name is not inserted successfully","city_failed");
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }catch (Exception e){
                                                                                                                                                                                failCase("State name is not inserted successfully","state_failed");
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }catch (Exception e){
                                                                                                                                                                            failCase("Country dropdown item is not selected successfully","countrydropitem_failed");
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }catch (Exception e){
                                                                                                                                                                failCase("Country dropdown is not selected successfully","countrydrop_failed");
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }catch (Exception e){
                                                                                                                                                        failCase("Address2 is not inserted successfully","address2_failed");
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }catch (Exception e){
                                                                                                                                                failCase("Address1 is not inserted successfully","address1_failed");
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }catch (Exception e){
                                                                                                                                        failCase("Company name is not inserted successfully","companyname_failed");
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }catch (Exception e){
                                                                                                                                failCase("Last name is not inserted successfully","lastname_failed");
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }catch(Exception e){
                                                                                                                        failCase("First name is not inserted successfully","firstname_failed");
                                                                                                                    }
                                                                                                                }
                                                                                                            }catch (Exception e){
                                                                                                                failCase("Second Checkbox id not clicked succesfully","checkbox2_failed");
                                                                                                            }
                                                                                                         }
                                                                                                     }catch (Exception e){
                                                                                                         failCase("First Checkbox id not clicked succesfully","checkbox1_failed");
                                                                                                     }
                                                                                                 }
                                                                                             }catch (Exception e){
                                                                                                 failCase("Year dropdown item is not opened successfully","yeardropdownitem_failed");
                                                                                             }
                                                                                         }
                                                                                     }catch(Exception e){
                                                                                         failCase("Year dropdown is not opened successfully","yeardropdown_failed");
                                                                                     }
                                                                                 }
                                                                             }catch(Exception e){
                                                                                 failCase("Month dropdown item is not opened successfully","monthdropdownitem_failed");
                                                                             }
                                                                         }
                                                                     }catch (Exception e){
                                                                         failCase("Month dropdown is not opened successfully","monthdropdown_failed");
                                                                     }
                                                                 }
                                                             }catch (Exception e){
                                                                 failCase("Day dropdown item is not opened successfully","daydropdownitem_failed");
                                                             }
                                                         }
                                                     }catch (Exception e){
                                                         failCase("Day dropdown is not opened successfully","daydropdown_failed");
                                                     }
                                                 }
                                             }catch (Exception e){
                                                 failCase("Password is not entered successfully","passwordfield_failed");
                                             }
                                         }
                                     }catch(Exception e){
                                         failCase("Email already Exist","alreadyexist_failed");
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
