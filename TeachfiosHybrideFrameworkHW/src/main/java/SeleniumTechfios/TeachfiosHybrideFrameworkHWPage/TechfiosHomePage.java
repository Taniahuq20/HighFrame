package SeleniumTechfios.TeachfiosHybrideFrameworkHWPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TechfiosHomePage {
	
	
	
	
	WebDriver driver;

	public TechfiosHomePage (WebDriver Tdriver) {
		
		this.driver = Tdriver;
	}

	@FindBy(how = How.XPATH,using = "//*[@id='side-menu']/li[2]/a/span[1]")
	WebElement CRM;
		
	@FindBy(how = How.XPATH,using = "//*[@id='side-menu']/li[2]/ul/li[1]/a")
	WebElement AddContact;
			
	public void ClickAddContact() {
		CRM.click();
		AddContact.click();
	}		

}




