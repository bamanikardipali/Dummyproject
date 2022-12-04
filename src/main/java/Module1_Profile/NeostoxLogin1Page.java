package Module1_Profile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeostoxLogin1Page 
{
	@FindBy(xpath="(//input[@type='number'])[1]")private WebElement mobileno;
	@FindBy(xpath="(//a[text()='Sign In'])[2]")private WebElement signinbtn;	
	
	public NeostoxLogin1Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void inpNeostoxLogin1PageMobileno(String Mobileno)
	{
		mobileno.sendKeys(Mobileno);
	}
	
	public void clickNeostoxLogin1Page()
	{
		signinbtn.click();
	}
}
