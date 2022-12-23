package Mobile.Mobile_Sep;

import org.testng.annotations.Test;


public class Scrolling_1 extends Base{
	@Test
	public void test2() {
		
		
		driver.findElementByAccessibilityId("Views").click();
		
		driver.findElementsByAccessibilityId("new UiScrollabel(new UiSelector()).scrollIntoView(text(\\\"WebView\")");		
	}


}
