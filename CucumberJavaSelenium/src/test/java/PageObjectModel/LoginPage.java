package PageObjectModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	By username = By.id("name");
	By password = By.id("password");
	By loginBtn = By.id("login");

	public LoginPage(WebDriver dr)
	{
		this.driver = dr;
	}
	public void EnterUserName(String usernam)
	{
		driver.findElement(username).sendKeys(usernam);
	}

	public void EnterPassword(String pasword)
	{
		driver.findElement(password).sendKeys(pasword);
	}
	
	public void ClickLoginButon()
	{
		driver.findElement(loginBtn).click(); 
	}



}
