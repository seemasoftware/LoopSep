package Mobile.Mobile_Sep;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class E2E_TC2 extends Base1{
	@Test
	public void testcase() throws InterruptedException {
	Thread.sleep(4000);
	//driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Deepak");
	//driver.hideKeyboard();
	/*driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
	driver.findElement(By.id("android:id/text1")).click();
	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));"));
	driver.findElement(By.xpath("//android.widget.TextView[@text='Argentina']")).click();*/
	driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	String toastmsg=driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
	System.out.println("toastmsg is "+toastmsg);
	Assert.assertEquals(toastmsg,"Please enter your name");
}
}
