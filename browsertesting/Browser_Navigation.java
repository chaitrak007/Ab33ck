package browsertesting;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Browser_Navigation {
	@Test
	public void testcase2() {
	ChromeDriver d = new ChromeDriver();
	
	  d.get("https://www.google.in");
	  String title= d.getTitle();
	  d.manage().window().maximize();
	  d.navigate().refresh();
	  d.navigate().to("https://www.facebook.com");
	  d.navigate().back();
	  d.navigate().forward();
	  
}
}