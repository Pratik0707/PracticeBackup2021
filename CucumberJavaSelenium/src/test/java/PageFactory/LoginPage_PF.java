package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {

	WebDriver Driver;

	@FindBy(xpath="//input[@id='name']")
	WebElement username;

	@FindBy(id="password")
	WebElement password;

	@FindBy(id="login")
	WebElement loginBtn;



	//Constructor
	public LoginPage_PF(WebDriver dr)
	{
		this.Driver = dr;
		PageFactory.initElements(Driver, this);// instead of LoginPage_PF.class, we can use only 'this'   

	}

	public void setUserName(String username)
	{
		this.username.sendKeys(username);		
	}

	public void setPassword(String pass)
	{
		password.sendKeys(pass);	
	}

	public void clickLoginButton()
	{
		loginBtn.click();
	}

}
