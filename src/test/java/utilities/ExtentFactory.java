package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentFactory {
    public static final ExtentReports extentReports = new ExtentReports();
    public synchronized static ExtentReports getInstance() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH.mm.ss");
        ExtentSparkReporter reporter = new ExtentSparkReporter("./reports/Report"+" "+ dateFormat.format(new Date())+".html");
        reporter.config().setReportName("Sample Extent Report");
        extentReports.attachReporter(reporter);
        return extentReports;
    }
}
