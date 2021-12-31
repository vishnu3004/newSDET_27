package MavenBasicPracticeTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicClassMavenTest {
	public WebDriver driver ;
 @Test(groups = "smoketest")
	public void mavenPracticeTest() {
		System.out.println("maven run success");
		
		
	}
	@Test(groups = "smoketest")
	public void mavenPractice2Test() {
		
	System.out.println("maven fail");
	
	}
		
}
