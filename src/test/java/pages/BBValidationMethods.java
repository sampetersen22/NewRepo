package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;

public class BBValidationMethods extends BBloginpage {
	ExtentReports extent;

	@FindBy(xpath="//span[normalize-space()='Account']")
	WebElement accnt;

	@FindBy(xpath="(//a[normalize-space()='Sign In'])[1]")
	WebElement signin;

	@FindBy(xpath="(//input[@id='fld-e'])[1]")
	WebElement emailid;

	@FindBy(xpath="(//input[@id='fld-p1'])[1]")
	WebElement psswrd;
	
	@FindBy(xpath="//button[normalize-space()='Sign In']")
	WebElement signinbtn;
	
	@FindBy(xpath="//span[@data-cy='location-tooltip-lv-display-name']")
	WebElement area;
	
	@FindBy(xpath="//a[normalize-space()='Find Another Store']")
	WebElement newstore;
	
	@FindBy(xpath="(//input[@id='input-<csi:text><csi:vars>$(csi.instances.shop.location-zip-code-form.v1.id)</csi:vars></csi:text>'])[1]")
	WebElement zipcode;
	
	@FindBy(xpath="(//button[normalize-space()='Update'])[1]")
	WebElement zipcodeupdate;


	@Test
	public void incrtlogin(){
		PageFactory.initElements(driver, this);
		accnt.click();
		signin.click();
		emailid.sendKeys("!@#@gmail.com");
		psswrd.sendKeys("1234567");
		signinbtn.click();
		test.log(Status.PASS, "Invalid emailID given");
	}

	@Test
	public void zipcode() {
		PageFactory.initElements(driver, this);
		area.click();
		newstore.click();
		zipcode.sendKeys("629003");
		zipcodeupdate.click();
		test.log(Status.PASS, "Invalid zipcode given");
	}

}
