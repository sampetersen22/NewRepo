package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;

import engine.BBpagemethods;

public class BBloginpage extends BBpagemethods {
	
	ExtentReports extent;
	
	@FindBy(xpath="//button[normalize-space()='Menu']")
	WebElement menu;
	
	@FindBy(xpath="//button[normalize-space()='TV & Home Theater']")
	WebElement tvmenu;
	
	@FindBy(xpath="//button[normalize-space()='TVs by Size']")
	WebElement tvsize;
	
	@FindBy(xpath="//a[normalize-space()='75-Inch TVs']")
	WebElement tvinch;
	
	@FindBy(xpath="(//button[@type='button'][normalize-space()='Add to Cart'])[1]")
	WebElement tvcart;
	
	@FindBy(xpath="//button[normalize-space()='Continue shopping']")
	WebElement shopping;
	
	@FindBy(xpath="//button[normalize-space()='Menu']")
	WebElement menu02;
	
	@FindBy(xpath="//button[normalize-space()='Brands']")
	WebElement brands;

	@FindBy(xpath="//a[normalize-space()='Apple']")
	WebElement applemenu;
	
	@FindBy(xpath="(//a[@role='button'][normalize-space()='Mac'])[1]")
	WebElement applemac;
	
	@FindBy(xpath="//a[normalize-space()='MacBook Air']")
	WebElement macbook;
	
	@FindBy(xpath="(//button[@type='button'][normalize-space()='Add to Cart'])[1]")
	WebElement addtocart;
	
	@FindBy(xpath="(//a[normalize-space()='Go to Cart'])[1]")
	WebElement gotocart;
	
	@FindBy(xpath="(//button[normalize-space()='Checkout'])[1]")
	WebElement checkout;
	
	@FindBy(xpath="(//button[normalize-space()='Continue as Guest'])[1]")
	WebElement guest;
	
	@FindBy(xpath="(//input[@id='user.emailAddress'])[1]")
	WebElement email;
	
	@FindBy(xpath="(//input[@id='user.phone'])[1]")
	WebElement phone;

	@FindBy(xpath="(//span[normalize-space()='Continue to Payment Information'])[1]")
	WebElement payment;
	
	
	
	
	@Test
	public void logindetails() throws InterruptedException {
		PageFactory.initElements(driver, this);

		menu.click();
		test.log(Status.PASS, "Menu selected");
		tvmenu.click();
		test.log(Status.PASS, "TV Menu opened");
		tvsize.click();
		test.log(Status.PASS, "TV selected");
		tvinch.click();
		test.log(Status.PASS, "TV size selected");
		tvcart.click(); 
		test.log(Status.PASS, "TV added to cart");
		Thread.sleep(5000);
		shopping.click();
		menu02.click();
			brands.click();
			test.log(Status.PASS, "Brands menu selected");
		applemenu.click();
		test.log(Status.PASS, "Apple products selected");
		applemac.click();
		test.log(Status.PASS, "Applemac menu selected");
		macbook.click();
		test.log(Status.PASS, "Apple Macbook selected");
		addtocart.click();
		test.log(Status.PASS, "Apple MAcbook added to cart");
		gotocart.click(); Thread.sleep(5000);
		checkout.click();
		test.log(Status.PASS, "Checkout");
		guest.click();
		test.log(Status.PASS, "Continuing as guest");
		email.sendKeys("123@gmail.com");
		test.log(Status.PASS, "Email ID entered");
		phone.sendKeys("347 689 2340");
		test.log(Status.PASS, "Mobile no. entered");
		payment.click();
				
}
}
