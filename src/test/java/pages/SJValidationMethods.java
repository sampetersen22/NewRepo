package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;

public class SJValidationMethods extends SJBookingpage {
ExtentReports extent;
	
@FindBy(xpath="//div[contains(text(),'Forgot Password ?')]")
WebElement frpw;
	
	@Test
	public void incrtlogin() throws InterruptedException {
	
	PageFactory.initElements(driver, this);
	//WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
	//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(loginBtn));
    loginBtn.click();
   Thread.sleep(5000);
   number.sendKeys("12334567");
   pswd.sendKeys("Maxval123#");
   clicklogin.click();
   test.log(Status.PASS, "Invalid number given");
	}
	
	@Test
	public void forgotpswd() throws InterruptedException {
	
	PageFactory.initElements(driver, this);
	//WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
	//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(loginBtn));
    loginBtn.click();
   Thread.sleep(5000);
   number.sendKeys("8667500480");
   frpw.click();
   test.log(Status.PASS, "Forgot password procedure initiated");
	}
}
