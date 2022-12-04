package Module1_Profile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeostoxLogin2Page 
{
	@FindBy(xpath="//input[@type='password']")private WebElement PWD;
	@FindBy(xpath="//a[text()='Submit']")private WebElement submitbtn;	
	
	public NeostoxLogin2Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void inpNeostoxLogin2PagePassword(String password)
	{
		PWD.sendKeys(password);
	}
	
	public void clickNeostoxLogin2Page()
	{
		submitbtn.click();
	}
}
