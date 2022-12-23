package Mobile.Mobile_Sep;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

public class Scrolling_2 extends Base {
	@Test
	public void test3()
	{
	driver.findElementByAccessibilityId("Views").click();	
	boolean canScrollMore;
		
	do 
	{
	 canScrollMore = (Boolean)((JavascriptExecutor)driver).executeScript("mobile: scrollGesture", 
	 ImmutableMap.builder()
	 .put("left",100)
	 .put("top",100)
	 .put("width",200)
	 .put("height",200)
	 .put("direction","down")
	 .put("percent",3.0)
	 .build()
	);
	
	}while(canScrollMore);
	}

}
