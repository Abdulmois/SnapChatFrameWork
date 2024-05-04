package fileUtility;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import genericlibrary.BaseClass;
import objectRepository.ApparelsPage;
import objectRepository.WelcomePage;

public class ApparelsTest extends BaseClass {

	@Test
	public void apparel_001() {
		WelcomePage welcome=new WelcomePage(driver);
		
		ApparelsPage apparel=new ApparelsPage(driver);
		
		//Click on Apparels link
		welcome.getApparelLink().click();
		test.log(LogStatus.INFO, "Clicked on Apparels link");
		//Verify Apparel page is displayed
		Assert.assertEquals(apparel.getPageTitle().getText(), "Apparel & Shoes");
		test.log(LogStatus.PASS, "Apparels page is displayed");
		
//		Reporter.log("jnojcbsoaclj",true);
	}
}

