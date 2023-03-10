package testcase_Runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import support_Files.Base_Class;
import utilites_ATS.ReadXlsx_Login;

public class Sample extends Base_Class{

	public  WebDriver driver;
	public static ExtentReports extent;
	public static ExtentSparkReporter sparks;
	
	Properties prop = new Properties();
	
	
	@Test(priority = 1)
	public void browserLaunch() throws IOException {

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\properties_ATS\\locators.properties");
		prop.load(fis);

		String browser_Name = prop.getProperty("browser");
		if (browser_Name.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(prop.getProperty("URL"));
			driver.manage().window().maximize();

		} else if (browser_Name.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get(prop.getProperty("URL"));
			driver.manage().window().maximize();

		} else if (browser_Name.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.get(prop.getProperty("URL"));
			driver.manage().window().maximize();
		}
	}
	
	@Test(dataProvider ="Login_Data" , dataProviderClass = ReadXlsx_Login.class , priority =2 )
	private void login(String username, String password) throws IOException, InterruptedException {

		
		extent = new ExtentReports();
		sparks = new ExtentSparkReporter("ExtentReports\\Sample.html");
		extent.attachReporter(sparks);
	

		driver.findElement(By.xpath(prop.getProperty("username"))).sendKeys(username);
		driver.findElement(By.xpath(prop.getProperty("password"))).sendKeys(password);
		driver.findElement(By.xpath(prop.getProperty("login"))).click();
		Thread.sleep(2000);
		javaScript_Scroll_800();
		Thread.sleep(2000);
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("Screenshot\\Login.png");
		FileUtils.copyFile(source, destination);
		
		InputStream is = new FileInputStream("Screenshot\\Login.png");
		byte[] bytes = IOUtils.toByteArray(is);
		String screenshot = Base64.getEncoder().encodeToString(bytes);
		
		takesScreenshot("Screenshot\\Login1.png");
		Thread.sleep(2000);
	//	String screenshot = Extent_Report_Base64("Screenshot\\Login.png");
		Thread.sleep(2000);
		extent.createTest("User in Login Url").log(Status.PASS, "User in Login Section").addScreenCaptureFromBase64String(screenshot);
		extent.flush();
	}





//	Actions a = new Actions(driver);
//	List<WebElement> findElements = driver.findElements(By.xpath("//ul[@id='select2-talent_roles-results']/li"));
//	for (WebElement webElement : findElements) {
//		if (webElement.getText().equals("Python")) {
//			// a.click(webElement).build().perform();
//			// javaScript_Click(webElement);
//			webElement.click();
//			break;
//		}
//	}

}
