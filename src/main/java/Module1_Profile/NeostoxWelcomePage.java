package Module1_Profile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeostoxWelcomePage 
{
	@FindBy(xpath="(//a[text()='OK'])[2]")private WebElement okBtn;
	
	public NeostoxWelcomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickNeostoxWelcomePageOKbtn()
	{
		okBtn.click();
	}
}
