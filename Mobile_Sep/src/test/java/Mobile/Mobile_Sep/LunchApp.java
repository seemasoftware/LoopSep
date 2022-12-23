package Mobile.Mobile_Sep;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

public class LunchApp extends Base{
	@Test
	public  void test1() throws MalformedURLException, InterruptedException {
		
	
	// driver.findElementByAccessibilityId("Preference").click();
	// driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
	// driver.findElement(By.id("android:id/checkbox")).click();
	// Thread.sleep(3000);
	// driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
	 //driver.findElement(By.id("android:id/edit")).sendKeys("Deepak");
	// ((WebElement) driver.findElements(By.className("android.widget.Button")).get(1)).click();
	
	//service.stop();
	 
	 driver.findElementByAccessibilityId("Views").click();
		
     driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Expandable Lists']")).click();
     driver.findElementByAccessibilityId("1. Custom Adapter").click();
     
	   WebElement element=driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
	  ((JavascriptExecutor)driver).executeScript("mobile: longClickGesture",ImmutableMap.of("elementId",((RemoteWebElement)element).getId(),"duration",2000));
	  Thread.sleep(3000);
	  String text =driver.findElement(By.id("android:id/title")).getText();
	  Assert.assertEquals(text,"Sample menu");
	  Assert.assertTrue(driver.findElement(By.id("android:id/title")).isDisplayed());
	  
	}

}
