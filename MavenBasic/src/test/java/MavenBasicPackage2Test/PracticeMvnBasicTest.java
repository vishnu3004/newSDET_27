package MavenBasicPackage2Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PracticeMvnBasicTest {

	public WebDriver driver ;
	@Test(groups="regressionTest")
	public void compileTest() {


		System.out.println("compilation pass");
		

	}
	@Test(groups="regressionTest")

	public void executeTest() {

		System.out.println("execution success");
	}
}
	

