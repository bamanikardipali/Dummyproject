package Module1_Profile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeostoxGuestPage
{
	@FindBy(xpath="(//a[text()='Sign In'])[1]")private WebElement signin;
	
	public NeostoxGuestPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickNeostoxGuestPageSignIn()
	{
		signin.click();
	}
}
