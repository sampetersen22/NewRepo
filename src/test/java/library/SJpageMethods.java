package library;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import Utility.DataDriven;
import Utility.SpiceJet;

public class SJpageMethods extends SpiceJet{

	@BeforeSuite
	public void beforesuite() {
		startReport();
	}

	@BeforeMethod
	public void firstmethod() throws InterruptedException {
		test = reports.createTest("Testcase");
		browsers(); Thread.sleep(5000);
		urlpage(); Thread.sleep(5000);
	}

	@DataProvider
	public String[][] exceldata() throws IOException {
		String[][] data1=	DataDriven.readExcel(); 
		return data1;
	}

	@AfterMethod
	public void lastmethod() {
		//closepage();
		stopReport();
	}
}
