package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GetScreenShot {
    public static String capture(WebDriver driver, String screenShotName) throws IOException, IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH.mm.ss");
        String dest = System.getProperty("user.dir") + "\\screenshots\\" + screenShotName +" "+ dateFormat.format(new Date())+ ".png";
        File destination = new File(dest);
        FileUtils.copyFile(source, destination);
        return dest;
    }
}
