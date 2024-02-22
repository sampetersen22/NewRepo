package Utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJet {
	
public static WebDriver driver;
public static ExtentHtmlReporter htmlreporter;
public static ExtentReports reports;
public static ExtentTest test;

public  void startReport() {
	htmlreporter  = new ExtentHtmlReporter(System.getProperty("user.dir")+ "/AutomationTestReport.html");
	reports = new ExtentReports();
	reports.attachReporter(htmlreporter);
}
public void stopReport() {
	reports.flush();
}

	
	public void browsers() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		test.log(Status.PASS, "Chrome is launched");
	}
	
	//@Parameters({"URL"})
	//@Test
public void urlpage()
{
	driver.get("https://www.spicejet.com/");
}

public void implicitWaitMethod(int timer) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timer));
}
public void alerts()
{
	try {
		driver.switchTo().alert().dismiss();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public void closepage()
{
	driver.close();
	test.log(Status.PASS, "Test run successfully");
}
}



