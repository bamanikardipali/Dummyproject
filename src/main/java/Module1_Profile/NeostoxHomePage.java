package Module1_Profile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeostoxHomePage 
{
	@FindBy(xpath="(//span[text()='Hi  '])[1]")private WebElement UserID;
	
	public NeostoxHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public String getUserID()
	{
		String text = UserID.getText();
		return text;
	}
}
