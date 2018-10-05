package SeleniumTechfios.TeachfiosHybrideFrameworkHWPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TechfiosLoginPage {

	WebDriver driver;
	
	public TechfiosLoginPage (WebDriver ldriver) {
		
	this.driver = ldriver;
	}
	
	@FindBy(how=How.ID,using="username")
	WebElement Username;
	
	@FindBy(how=How.ID,using="password")
	WebElement Password;
	
	@FindBy(how=How.NAME, using="login")
	WebElement SigninButton;
	
	public void TechfiosLogin(String email, String password) {
	
		Username.sendKeys(email);
		Password.sendKeys(password);
		SigninButton.click();
		
	}
}

	