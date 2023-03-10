package testcase_Runner;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;

import javax.swing.text.Utilities;

import java.util.Base64;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import support_Files.Base_Class;
import support_Files.ScreenRecorderUtil;
import utilites_ATS.ReadXlsx_DashBoard;
import utilites_ATS.ReadXlsx_Login;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.junit.Assert;
import org.monte.screenrecorder.ScreenRecorder;

public class Reusable_Methods extends Runner {

	

	@Test(dataProvider = "DashBoard", dataProviderClass = ReadXlsx_DashBoard.class, priority = 3)
	public void dash_Board(String StartDate_Year, String StartDate_Month, String EndDate_Year, String EndDate_Month,
			String TalentRoles, String Search) throws Exception {

		driver.findElement(By.xpath(prop.getProperty("Dashboard"))).click();
		driver.findElement(By.xpath(prop.getProperty("Dashboard_Filter"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(prop.getProperty("StartDate"))).click();

		Thread.sleep(2000);
		

		while (true) {

			WebElement findElement = driver.findElement(By.xpath("/html/body/div[2]/div[2]/table/thead/tr/th[2]"));
			if (findElement.getText().equals(StartDate_Year)) {

				break;

			} else {

				Thread.sleep(2000);
				driver.findElement(By.xpath("//body/div[2]/div[2]/table[1]/thead[1]/tr[1]/th[1]")).click();

			}
		}

		List<WebElement> months = driver
				.findElements(By.xpath("/html[1]/body[1]/div[2]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/span"));
		for (WebElement month : months) {
			if (month.getText().equals(StartDate_Month)) {
				System.out.println(month);
				Actions a = new Actions(driver);
				a.click(month).build().perform();
			}
		}

		Thread.sleep(2000);

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("Screenshot\\Start_Date.png");
		FileUtils.copyFile(source, destination);

		InputStream is = new FileInputStream("Screenshot\\Start_Date.png");
		byte[] bytes = IOUtils.toByteArray(is);
		String screenshot = Base64.getEncoder().encodeToString(bytes);

		extent.createTest("Enter Start Date").log(Status.PASS, "Date Entered ")
				.addScreenCaptureFromBase64String(screenshot);

		Thread.sleep(2000);

		driver.findElement(By.xpath(prop.getProperty("EndDate"))).click();

		Thread.sleep(2000);
		while (true) {
			WebElement findElement2 = driver.findElement(By.xpath("/html/body/div[3]/div[2]/table/thead/tr/th[2]"));
			if (findElement2.getText().equals(EndDate_Year)) {
				break;
			} else {
				driver.findElement(By.xpath("//body/div[3]/div[2]/table[1]/thead[1]/tr[1]/th[1]")).click();

			}
		}
		Thread.sleep(2000);

		List<WebElement> endmonths = driver.findElements(By.xpath("/html/body/div[3]/div[2]/table/tbody/tr/td/span"));
		for (WebElement end : endmonths) {
			if (end.getText().equals(EndDate_Month)) {
				System.out.println(end);
				Actions a = new Actions(driver);
				a.click(end).build().perform();
			}
		}
		
		
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File src = ts1.getScreenshotAs(OutputType.FILE);
		File dst = new File("Screenshot\\End_Date.png");
		FileUtils.copyFile(src, dst);

		InputStream input = new FileInputStream("Screenshot\\End_Date.png");
		byte[] byts = IOUtils.toByteArray(input);
		String image = Base64.getEncoder().encodeToString(byts);

		extent.createTest("Enter End Date").log(Status.PASS, "Date Entered ")
				.addScreenCaptureFromBase64String(image);

		
		
		
	

//		Thread.sleep(2000);
//
		driver.findElement(By.xpath(prop.getProperty("Filter_View"))).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("percentage"))).click();
//		// driver.findElement(By.xpath(prop.getProperty("count"))).click();
		driver.findElement(By.xpath(prop.getProperty("Talent_Qualified_Status"))).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("Qualified_3years"))).click();
		driver.findElement(By.xpath(prop.getProperty("Talent_Roles"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(prop.getProperty("Talent_Roles"))).sendKeys(TalentRoles);
		Thread.sleep(2000);
		
		

		Robot r = new Robot();
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

		WebElement role1 = driver.findElement(By.xpath("//ul[@class='select2-selection__rendered']/li"));
		String attribute = role1.getAttribute("title");

		if (attribute.equalsIgnoreCase(TalentRoles)) {
			System.out.println("Given Talent Role : " + TalentRoles);
		} else {
			driver.findElement(By.xpath(prop.getProperty("Talent_Roles"))).click();
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			Object close = js.executeScript(
					" return document.querySelector(\"#m_accordion_5_item_3_body > div > div > div:nth-child(5) > span > span.selection > span > ul > li.select2-selection__choice > span\")");
			js.executeScript("arguments[0].click()", close);

			Thread.sleep(3000);
			driver.findElement(By.xpath(prop.getProperty("Talent_Roles"))).sendKeys(TalentRoles);
			Thread.sleep(3000);

			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);

		}
		Thread.sleep(2000);
		
		TakesScreenshot t = (TakesScreenshot) driver;
		File s = t.getScreenshotAs(OutputType.FILE);
		File d = new File("Screenshot\\Talent_Role.png");
		FileUtils.copyFile(s, d);

		InputStream i = new FileInputStream("Screenshot\\Talent_Role.png");
		byte[] b = IOUtils.toByteArray(i);
		String img = Base64.getEncoder().encodeToString(b);

		extent.createTest("Search Talent Role").log(Status.PASS, "Talent Role Selected")
				.addScreenCaptureFromBase64String(img);
		
		Thread.sleep(2000);


		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scroll(0,800)");

		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("table_Up"))).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("table_Down"))).click();
		Thread.sleep(1500);
		j.executeScript("document.querySelector(\"#conversion_report\").scroll(400,0)");
		Thread.sleep(1500);
		j.executeScript("document.querySelector(\"#conversion_report\").scroll(0,400)");
		Thread.sleep(1500);
		j.executeScript("window.scroll(0,2000)");
		Thread.sleep(2000);

		driver.findElement(By.xpath(prop.getProperty("Search"))).sendKeys(Search);

		Thread.sleep(2000);
		
		TakesScreenshot tss = (TakesScreenshot) driver;
		File f = tss.getScreenshotAs(OutputType.FILE);
		File fi = new File("Screenshot\\Search.png");
		FileUtils.copyFile(f, fi);

		InputStream ist = new FileInputStream("Screenshot\\Search.png");
		byte[] be = IOUtils.toByteArray(ist);
		String img1 = Base64.getEncoder().encodeToString(be);

		extent.createTest("Search WebTable").log(Status.PASS, "Searched Input Displayed in WebTable")
				.addScreenCaptureFromBase64String(img1);
		
		driver.findElement(By.xpath(prop.getProperty("Excel"))).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("CSV"))).click();
		Thread.sleep(1500);
		
		
		TakesScreenshot shot  =(TakesScreenshot) driver;
		File file = shot.getScreenshotAs(OutputType.FILE);
		File des = new File("Screenshot\\File.png");
		FileUtils.copyFile(file, des);

		InputStream ism = new FileInputStream("Screenshot\\File.png");
		byte[] bte = IOUtils.toByteArray(ism);
		String img2 = Base64.getEncoder().encodeToString(bte);

		extent.createTest("Download Excel & CSV ").log(Status.PASS, "File Downloaded Successfully")
				.addScreenCaptureFromBase64String(img2);
		
		
		
		
		
		extent.flush();
		
	//	ScreenRecorderUtil.stopRecord();

	}

	@Test(priority = 1)
	public void browser_Launch() throws Exception {

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\properties_ATS\\locators.properties");
		prop.load(fis);
		
	//	ScreenRecorderUtil.startRecord("browser_Launch()");

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

}
