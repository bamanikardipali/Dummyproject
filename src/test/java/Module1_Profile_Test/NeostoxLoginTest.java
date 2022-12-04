package Module1_Profile_Test;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LibraryFile.BaseClass;
import LibraryFile.UtilityClass;
import Module1_Profile.NeostoxGuestPage;
import Module1_Profile.NeostoxHomePage;
import Module1_Profile.NeostoxLogin1Page;
import Module1_Profile.NeostoxLogin2Page;
import Module1_Profile.NeostoxWelcomePage;



public class NeostoxLoginTest extends BaseClass
{
	NeostoxGuestPage guest;
	NeostoxLogin1Page login1;
	NeostoxLogin2Page login2;
	NeostoxWelcomePage welcome;
	NeostoxHomePage home;
	int TCID;
	
	
	@BeforeClass
	public void openBrowser() throws IOException
	{
		initilizeBrowser();
		guest=new NeostoxGuestPage(driver);
		login1=new NeostoxLogin1Page(driver);
		login2=new NeostoxLogin2Page (driver);
		welcome=new NeostoxWelcomePage (driver);
		
	}
	
	@BeforeMethod
	public void loginToApp() throws IOException
	{
		guest.clickNeostoxGuestPageSignIn();
		login1.inpNeostoxLogin1PageMobileno(UtilityClass.getPFData("UN"));
		login1.clickNeostoxLogin1Page();
		login2.inpNeostoxLogin2PagePassword(UtilityClass.getPFData("PWD"));
		login2.clickNeostoxLogin2Page();
		guest.clickNeostoxGuestPageSignIn();
		
	}
	
	@Test
	public void verifyUserID() throws EncryptedDocumentException, IOException
	{
		TCID=401;
		String actUserID = home.getUserID();
		String expUserID = UtilityClass.getTD(0,0);
		Assert.assertEquals(actUserID,expUserID,"Failed:both are diffrent");
		
	}
	
	@AfterMethod
	public void logoutFromApp(ITestResult s1) throws IOException
	{
		if(s1.getStatus()==ITestResult.FAILURE)
		{
			UtilityClass.captureSS(driver,TCID);
		}
		
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
	
}
