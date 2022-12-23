package Mobile.Mobile_Sep;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class Test {
	public static void main(String[] args) throws MalformedURLException, InterruptedException
	{
		
		File app = new File("C:\\Users\\sr_ta\\Downloads","ApiDemo.apk");
		
		File js = new File("C:\\Users\\sr_ta\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"); //---- main.js file path

	
				  
				   AppiumDriverLocalService service =
				    new AppiumServiceBuilder()    
				    .withAppiumJS(js)
				    .withIPAddress("0.0.0.0")
				       .withArgument(GeneralServerFlag.BASEPATH, "wd/hub")
				    .usingPort(4723)
				    .build();
				   service.start();
				
		
		
		DesiredCapabilities cap=new DesiredCapabilities();
		
		 cap.setCapability("app", app.getAbsolutePath());
		 cap.setCapability("deviceName","d8fce2e62744");
		 cap.setCapability("platformName","Android");
		 cap.setCapability("automationName","UiAutomator2");
		
		
	
		 AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		 
		 driver.findElementByAccessibilityId("Preference").click();
		 driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
		 driver.findElement(By.id("android:id/checkbox")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		 driver.findElement(By.id("android:id/edit")).sendKeys("Deepak");
		 ((WebElement) driver.findElements(By.className("android.widget.Button")).get(1)).click();
	}


}
