package SeleniumTechfios.TeachfiosHybrideFrameworkHWTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import SeleniumTechfios.TeachfiosHybrideFrameworkHWPage.TechfiosAddContact;
import SeleniumTechfios.TeachfiosHybrideFrameworkHWPage.TechfiosHomePage;
import SeleniumTechfios.TeachfiosHybrideFrameworkHWPage.TechfiosLoginPage;
import util.BrowserFactory;
import util.ExcelReader;

public class AddContactTest {
	ExcelReader reader = new ExcelReader(".\\Data\\testdata.xlsx");
	String email=reader.getCellData("Sheet1", "Email", 2);
	String password=reader.getCellData("Sheet1", "Password", 2);
	String fullname=reader.getCellData("Sheet1", "Fullname", 2);
	String company=reader.getCellData("Sheet1", "Company", 2);
	String emailown=reader.getCellData("Sheet1", "EmailOwn", 2);
	String phone=reader.getCellData("Sheet1", "Phone", 2);
	String address=reader.getCellData("Sheet1", "Address", 2);
	String city=reader.getCellData("Sheet1", "City", 2);
	String state=reader.getCellData("Sheet1", "State", 2);
	String zip=reader.getCellData("Sheet1", "Zip", 2);
	String country=reader.getCellData("Sheet1", "Country", 2);
	
@Test
public void AddContactInformation() {
	WebDriver driver  = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login/");
	driver.manage().window().maximize();
	System.out.println(phone);
	System.out.println(zip);
	TechfiosLoginPage login = PageFactory.initElements(driver, TechfiosLoginPage.class);
	login.TechfiosLogin(email, password);
	
	TechfiosHomePage home = PageFactory.initElements(driver, TechfiosHomePage.class);
	home.ClickAddContact();
	

	TechfiosAddContact contact = PageFactory.initElements(driver, TechfiosAddContact .class);
	contact.FillingUpAddressForm(fullname, company, emailown, phone, address, city, state, zip, country);
	
	driver.close();
	driver.quit();
}
}
