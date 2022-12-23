package Mobile.Mobile_Sep;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;
import com.google.common.collect.ImmutableMap;

public class Drag_Drop extends Base{

	@Test
	public void testcase1() throws MalformedURLException, InterruptedException
	{
		driver.findElementByAccessibilityId("Views").click();
		driver.findElementByAccessibilityId("Drag and Drop").click();
        
        WebElement source=driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
        
        
   
        ((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
            "elementId", ((RemoteWebElement) source).getId(),
            "endX", 429,
            "endY", 530
        ));
        Thread.sleep(3000);
	}

}
