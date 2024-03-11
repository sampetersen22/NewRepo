package pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;

import engine.SJpageMethods;

public class SJBookingpage extends SJpageMethods {
	ExtentReports extent;

	@FindBy(xpath="//div[contains(text(),'Login')]")
	WebElement loginBtn;
	@FindBy(xpath="//input[@data-testid='user-mobileno-input-box']")
	WebElement number;
	@FindBy(xpath="//input[@type='password']")
	WebElement pswd;
	@FindBy(xpath="//body//div[@id='react-root']//div[@data-testid='application-id']//div//div//div[5]//div[3]")
	WebElement clicklogin;
	@FindBy(xpath="//body//div[@id='react-root']//div[@data-testid='application-id']//div//div//div[5]//div[2]//div[1]//div[2]//div[2]")
	WebElement date;
	@FindBy(xpath="//div[contains(text(),'USD')]")
	WebElement currency;
	@FindBy(xpath="(//div)[291]")
	WebElement numberpass;
	@FindBy(xpath="(//div[@data-focusable='true'])[20]")
	WebElement cred4;
	@FindBy(xpath="//div[contains(text(),'From')]")
	WebElement oneway;
	@FindBy(xpath="//div[normalize-space()='Kempegowda International Airport']")
	WebElement from_place;
	@FindBy(xpath="//div[normalize-space()='Indira Gandhi International Airport']")
	WebElement to_place;
	@FindBy(xpath="(//div)[483]")
	WebElement cred8;
	@FindBy(xpath="(//div[@data-focusable='true'])[27]")
	WebElement cred9;
	@FindBy(xpath="//body[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[3]/div[2]")
	WebElement cred10;
	@FindBy(xpath="//input[@data-testid='traveller-0-first-traveller-info-input-box']")
	WebElement cred11;
	@FindBy(xpath="//input[@data-testid='traveller-0-last-traveller-info-input-box']")
	WebElement cred12;
	@FindBy(xpath="(//div[contains(text(),'Next')])[1]")
	WebElement cred13;
	@FindBy(xpath="//input[@data-testid='traveller-1-first-traveller-info-input-box']")
	WebElement cred14;
	@FindBy(xpath="//input[@data-testid='traveller-1-last-traveller-info-input-box']")
	WebElement cred15;
	@FindBy(xpath="(//div[@data-focusable='true'])[17]")
	WebElement cred16;
	@FindBy(xpath="//body/div[@id='react-root']/div[@id='main-container']/div[@data-testid='application-id']/div/div/div/div/div[4]/div[1]/div[1]")
	WebElement cred17;
	//@FindBy(xpath="(//div[@dir='auto'][normalize-space()='BLR - DEL'])[1]")
	//WebElement cred18;
	//@FindBy(xpath="(//div[contains(text(),'Done')])[1]")
	//WebElement cred19;
	//@FindBy(xpath="//*[@id=\'main-container\']/div/div[5]/div/div/div[2]/div/div/div[4]")
	//WebElement cred20;

	
	@Test(dataProvider = "exceldata")
	public void logindetails(String Username, String Password) throws InterruptedException {
		
		PageFactory.initElements(driver, this);
		//WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(loginBtn));
		loginBtn.click();
		Thread.sleep(5000);
		number.sendKeys(Username);
		pswd.sendKeys(Password);
		try {
			clicklogin.click();
			test.log(Status.PASS, "Login successfully");
		} catch (Exception e) {
			test.log(Status.FAIL, "Login failed");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  Thread.sleep(5000);

		date.click();
		currency.click();
		test.log(Status.PASS, "Currency selected");
		numberpass.click();
		test.log(Status.PASS, "Passengers Selected");
		cred4.click();
		oneway.click();
		from_place.click();
		to_place.click();
		test.log(Status.PASS, "From & to destination selected");
		cred8.click(); Thread.sleep(4000);
		cred9.click(); Thread.sleep(8000);
		test.log(Status.PASS, "Passenger details given successfully");
		cred10.click(); Thread.sleep(8000);
		cred11.sendKeys("KUMAR");
		cred12.sendKeys("M");
		test.log(Status.PASS, "Passenger 1 details given");
		cred13.click();
		cred14.sendKeys("PREM");
		cred15.sendKeys("M");
		test.log(Status.PASS, "Passenger 2 details given");
		cred16.click(); Thread.sleep(5000);
		test.log(Status.PASS, "Cost of tickets");
		cred17.click();
		//cred18.click();
	//	cred19.click();
		//cred20.click();
		// TODO Auto-generated catch block

		//searchBtn.click();
	}


}
