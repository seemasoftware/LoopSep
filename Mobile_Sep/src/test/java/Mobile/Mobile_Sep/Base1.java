package Mobile.Mobile_Sep;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class Base1 {
public AndroidDriver driver;
	
	@BeforeMethod
	public void init() throws MalformedURLException {
		File app = new File("C:\\Users\\sr_ta\\Downloads","General-Store.apk");
		
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
		
		driver = new AndroidDriver(new URL("http://192.168.0.17:4723/wd/hub/"),cap);
	}

}
