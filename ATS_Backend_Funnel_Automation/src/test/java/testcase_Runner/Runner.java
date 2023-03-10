package testcase_Runner;

import java.awt.AWTException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.junit.Assert;
import org.monte.screenrecorder.ScreenRecorder;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import support_Files.ScreenRecorderUtil;
import utilites_ATS.ReadXlsx_Login;

public class Runner  {
	
	public static WebDriver driver;
	static Properties prop = new Properties();
	
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter sparks = new ExtentSparkReporter("ExtentReports\\Talents\\Talent_DashBoard_TalentProfile.html");
	
	
	
	
	
	@BeforeClass
	public void set_Up() throws Exception {
		
		ScreenRecorderUtil.startRecord("set_UP");
		
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\properties_ATS\\locators.properties");
		prop.load(fis);
		extent.attachReporter(sparks);

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
	
	

	

	@Test(dataProvider = "Login_Data", dataProviderClass = ReadXlsx_Login.class, priority = 1)
	public void Login(String username, String password) throws IOException, InterruptedException {

		

		driver.findElement(By.xpath(prop.getProperty("username"))).sendKeys(username);
		driver.findElement(By.xpath(prop.getProperty("password"))).sendKeys(password);
		driver.findElement(By.xpath(prop.getProperty("login"))).click();

		String actual = driver.getTitle().trim();
		String expected = "Uplers Talent Solutions Staging | Dashboard";
		Assert.assertEquals(expected, actual);


	}
	
//	public static String Screenshots() throws IOException {
//		// TODO Auto-generated method stub
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File source = ts.getScreenshotAs(OutputType.FILE);
//		File destination = new File("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Screencapture\\SS.png");
//		FileUtils.copyFile(source, destination);
//
//		InputStream is = new FileInputStream("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Screencapture\\SS.png");
//		byte[] bytes = IOUtils.toByteArray(is);
//		String screenshot = Base64.getEncoder().encodeToString(bytes);
//		return screenshot;
//	}
	
	public static String Screenshot(String path) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(path);
		FileUtils.copyFile(source, destination);

		
		
		InputStream is = new FileInputStream(path);
		byte[] bytes = IOUtils.toByteArray(is);
		String screenshot = Base64.getEncoder().encodeToString(bytes);
		return screenshot;
	}
	
	
	
	@AfterClass
	private void tear_Down() throws Exception {
		
	//	ScreenRecorderUtil.stopRecord();
	//	driver.quit();
		
	}
	
}
