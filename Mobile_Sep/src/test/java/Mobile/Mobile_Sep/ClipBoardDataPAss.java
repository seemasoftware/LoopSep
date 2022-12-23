package Mobile.Mobile_Sep;

import java.net.MalformedURLException;
import org.testng.annotations.Test;

import org.openqa.selenium.By;

public class ClipBoardDataPAss extends Base{

	@Test
	public void testcase1() throws MalformedURLException, InterruptedException
	{
		driver.findElementByAccessibilityId("Preference").click();
		driver.findElementByAccessibilityId("3. Preference dependencies").click();
		
        driver.findElement(By.id("android:id/checkbox")).click();
        driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
        driver.setClipboardText("Deepak wifi");
        driver.findElement(By.id("android:id/edit")).sendKeys(driver.getClipboardText());
        
        
	}

}
