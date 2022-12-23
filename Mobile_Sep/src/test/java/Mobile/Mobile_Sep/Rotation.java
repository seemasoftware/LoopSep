package Mobile.Mobile_Sep;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.DeviceRotation;

public class Rotation extends Base{

	@Test
	public void testcase1() throws MalformedURLException, InterruptedException
	{
		driver.findElementByAccessibilityId("Preference").click();
		driver.findElementByAccessibilityId("3. Preference dependencies").click();
		
        
        
        driver.findElement(By.id("android:id/checkbox")).click();
        DeviceRotation landscape= new DeviceRotation(0, 0, 90);
        driver.rotate(landscape);
        
        
	}

}
