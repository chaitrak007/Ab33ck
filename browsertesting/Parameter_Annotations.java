package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_Annotations {
WebDriver driver;

@Test
@Parameters("browsers")
void browser(String nameofthebrowser) {
	if(nameofthebrowser.equalsIgnoreCase("chrome")) {
		driver=new ChromeDriver();
		driver.get("https//:www.google.com");
	}
		if(nameofthebrowser.equalsIgnoreCase("safari")) {
			driver=new SafariDriver();
			
	}
}

}

