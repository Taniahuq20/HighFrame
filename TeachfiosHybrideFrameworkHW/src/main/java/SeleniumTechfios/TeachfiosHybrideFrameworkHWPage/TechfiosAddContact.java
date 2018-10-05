package SeleniumTechfios.TeachfiosHybrideFrameworkHWPage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TechfiosAddContact {

	WebDriver driver;
	public TechfiosAddContact (WebDriver ldriver) {
		this.driver=ldriver;
	}
	
	@FindBy(how=How.ID,using="account")	
	WebElement Fullname; 

	@FindBy(how=How.ID,using="company")	
	WebElement Company;

	@FindBy(how=How.ID,using="email")	
	WebElement EmailOwn;

	@FindBy(how=How.ID,using="phone")	
	WebElement Phone;
	
	@FindBy(how=How.ID,using="address")	
	WebElement Address;

	@FindBy(how=How.ID,using="city")	
	WebElement City;

	@FindBy(how=How.ID,using="state")	
	WebElement State;

	@FindBy(how=How.ID,using="zip")	
	WebElement Zip;
	
	@FindBy(how=How.XPATH,using="//*[@id='rform']/div[9]/div/span/span[1]/span")	
	WebElement CountryTextbox;
	
	@FindBy(how=How.XPATH,using="//*[@id='rform']/div[9]/div/span/span[1]/span/span[2]/b")	
	WebElement DropErrow;
	
	@FindBy(how=How.XPATH,using="html/body/span/span/span[1]/input")	
	WebElement SearchTextbox;

	@FindBy(how=How.ID,using="submit")	
	WebElement Submit;
	
	public void FillingUpAddressForm(String fullname, String company, String emailown, String phone, String address, String city, String state, String zip, String country) {
		
		Fullname.sendKeys(fullname);
		Company.sendKeys(company);	
		EmailOwn.sendKeys(emailown);
		Phone.sendKeys(phone);	
		Address.sendKeys(address);
		City.sendKeys(city);
		State.sendKeys(state);
		Zip.sendKeys(zip);
		
		DropErrow.click();
		SearchTextbox.sendKeys(country);
		CountryTextbox.sendKeys(Keys.ENTER);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Submit.click();
		}
	}

