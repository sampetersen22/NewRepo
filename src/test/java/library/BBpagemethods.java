package library;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import Utility.BestBuy;
import Utility.DataDriven;
import Utility.DataDrivenTwo;

public class BBpagemethods extends BestBuy {

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
	public String[][] exceldataOne() throws IOException {
		String[][] data2  =	DataDrivenTwo.readExcelTwo(); 
		return data2;
	}

	@AfterMethod
	public void lastmethod() {
		//closepage();
		stopReport();
	}

}
