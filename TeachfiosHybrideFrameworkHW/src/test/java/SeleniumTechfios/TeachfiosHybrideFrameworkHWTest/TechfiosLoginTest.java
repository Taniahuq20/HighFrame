package SeleniumTechfios.TeachfiosHybrideFrameworkHWTest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import SeleniumTechfios.TeachfiosHybrideFrameworkHWPage.TechfiosLoginPage;
import util.BrowserFactory;
import util.ExcelReader;

public class TechfiosLoginTest {
	ExcelReader reader = new ExcelReader(".\\Data\\testdata.xlsx");	
		String email=reader.getCellData("Sheet1", "Email", 2);
		String password=reader.getCellData("Sheet1", "Password", 2);
	@Test
	public void login() {
		
		WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login/");
		driver.manage().window().maximize();
		
		TechfiosLoginPage login = PageFactory.initElements(driver,TechfiosLoginPage.class);
		login.TechfiosLogin(email, password);
		
		System.out.println(email);
		System.out.println(password);
		driver.close();
		driver.quit();
	}
}
