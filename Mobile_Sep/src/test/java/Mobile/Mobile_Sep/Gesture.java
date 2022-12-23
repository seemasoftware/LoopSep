package Mobile.Mobile_Sep;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class Gesture {
	public static void main(String[] args) throws InterruptedException, MalformedURLException {

	File app = new File("C:\\Users\\sr_ta\\Downloads","ApiDemo.apk");
	
	File js = new File("C:\\Users\\sr_ta\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"); //---- main.js file path
	AppiumDriverLocalService service = new AppiumServiceBuilder()
				.withAppiumJS(js)
				.withIPAddress("0.0.0.0")
				.withArgument(GeneralServerFlag.BASEPATH,"wd/hub")
				.usingPort(4723)
				.build(); 

	service.start();
	DesiredCapabilities cap = new DesiredCapabilities();
	//cap.setCapability("device", "Android");
	//cap.setCapability(CapabilityType.BROWSER_NAME, "");
	//cap.setCapability(CapabilityType.VERSION, "12");
	cap.setCapability("app", app.getAbsolutePath());
	cap.setCapability("deviceName", "R58MA02ZM1K");
	cap.setCapability("platform", "Android");
	cap.setCapability("automationName", "UiAutomator2");
	
	AndroidDriver driver = new AndroidDriver(new URL("http://192.168.0.17:4723/wd/hub/"),cap);
	driver.findElementByAccessibilityId("Views").click();
	
    driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Expandable Lists']")).click();
    driver.findElementByAccessibilityId("1. Custom Adapter").click();
        
    WebElement element=driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
	  ((JavascriptExecutor)driver).executeScript("mobile: longClickGesture",ImmutableMap.of("elementId",((RemoteWebElement)element).getId(),"duration",2000));
	  Thread.sleep(3000);
}


}
