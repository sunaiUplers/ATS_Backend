package testcase_Runner;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import support_Files.ScreenRecorderUtil;
import utilites_ATS.ReadXlsx_TalentDashboard_TalentProfile;
import utilites_ATS.ReadXlsx_Talent_Profile_Update;
import utilites_ATS.ReadXlsx_Talent_Profile_Update_Assessments;
import utilites_ATS.ReadXlsx_Talents;
import utilites_ATS.ReadXlsx_Talents_Filter;

public class Talents extends Runner{


	
	
	@Ignore
	@Test(dataProvider="TalentFilter" , dataProviderClass=ReadXlsx_Talents_Filter.class , priority =3)
	public void Talents_Filter(String Search_Name , String Search_Email , String Start_Date, String End_Date
			,String POC_Search , String Role, String SourceLink_Organic	,String SourceLink_Paid
			,String SourceLink_Email, String SourceLink_WhatsApp , String SourceLink_SocialMedia) throws InterruptedException, AWTException, IOException {
		
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		Robot r = new Robot();
		
		driver.findElement(By.xpath(prop.getProperty("Talents"))).click();
		Thread.sleep(1500);
		
		driver.findElement(By.xpath(prop.getProperty("List"))).click();
		
		
		driver.findElement(By.xpath(prop.getProperty("List_Total_Applications"))).click();
		Thread.sleep(2000);
		String count = driver.findElement(By.xpath(prop.getProperty("List_Total_Applications"))).getText();
		int parseInt = Integer.parseInt(count);
		int parse = (parseInt/10);
		Thread.sleep(1500);
		js.executeScript("window.scroll(0,400)");
		Thread.sleep(1000);
		js.executeScript("window.scroll(0,800)");
		Thread.sleep(1000);
		js.executeScript("window.scroll(0,1200)");
		Thread.sleep(1000);
		js.executeScript("document.querySelector(\"#team_table\").scroll(400,0)");
		Thread.sleep(1000);
		js.executeScript("document.querySelector(\"#team_table\").scroll(600,0)");
		Thread.sleep(1000);
		js.executeScript("document.querySelector(\"#team_table\").scroll(800,0)");
		Thread.sleep(1000);
		js.executeScript("document.querySelector(\"#team_table\").scroll(0,400)");
		Thread.sleep(1000);
		js.executeScript("document.querySelector(\"#team_table\").scroll(0,600)");
		Thread.sleep(1000);
		js.executeScript("document.querySelector(\"#team_table\").scroll(0,800)");
		Thread.sleep(1000);
		
		
		for (int i = 0; i < parse; i++) {
			driver.findElement(By.xpath(prop.getProperty("table_Up"))).click();
			Thread.sleep(1000);
		}
		
		js.executeScript("window.scroll(0,4000)");
		
		WebElement show = driver.findElement(By.xpath("//select[@name='team_table_length']"));
		driver.findElement(By.xpath("//select[@name='team_table_length']")).click();
		
		Select s = new Select(show);
		
		
		js.executeScript("window.scroll(0,4000)");
		s.selectByValue("10");
		js.executeScript("window.scroll(0,4000)");
		Thread.sleep(4000);
		s.selectByValue("25");
		js.executeScript("window.scroll(0,4000)");
		Thread.sleep(3000);
		
		s.selectByValue("50");
		js.executeScript("window.scroll(0,4000)");
		Thread.sleep(3000);
		s.selectByValue("100");
		Thread.sleep(4000);
		js.executeScript("window.scroll(0,4000)");
		Thread.sleep(2000);
		js.executeScript("window.scroll(0,8000)");
		Thread.sleep(3500);
		s.selectByValue("10");
		Thread.sleep(3000);
		js.executeScript("window.scroll(1200,0)");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(prop.getProperty("List_Total_Applications"))).click();
		Thread.sleep(1500);
		
		
		String TotalApplication = Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\TotalApplication.png");
		
		js.executeScript("window.scroll(0,2000)");
		Thread.sleep(1500);
		js.executeScript("window.scroll(0,100)");
		Thread.sleep(1500);
		
		String TotalApplication1 = Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\TotalApplication1.png");
		
		driver.findElement(By.xpath(prop.getProperty("List_Registration_Pending"))).click();
		Thread.sleep(1500);
		
		String RegistrationPending = Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\RegistrationPending.png");
		
		
		js.executeScript("window.scroll(0,2000)");
		Thread.sleep(1500);
		String RegistrationPending1 = Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\RegistrationPending1.png");
		
		js.executeScript("window.scroll(0,100)");
		driver.findElement(By.xpath(prop.getProperty("List_Assessment_Pending"))).click();
		Thread.sleep(1500);
		String Assessment_Pending = Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\Assessment_Pending.png");
		
		
		js.executeScript("window.scroll(0,2000)");
		Thread.sleep(1500);
		String Assessment_Pending1 = Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\Assessment_Pending1.png");
		
		js.executeScript("window.scroll(0,100)");
		Thread.sleep(1000);
		driver.findElement(By.xpath(prop.getProperty("List_Assessment_1TechCleared"))).click();
		Thread.sleep(1500);
		String OneTechCleared = Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\1TechCleared.png");
		
		
		js.executeScript("window.scroll(0,2000)");
		Thread.sleep(1500);
		String OneTechCleared1 = Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\1TechCleared1.png");
		
		js.executeScript("window.scroll(0,100)");
		Thread.sleep(1000);
		driver.findElement(By.xpath(prop.getProperty("List_Assessment_2TechCleared"))).click();
		Thread.sleep(1500);
		String TwoTechCleared = Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\2TechCleared.png");
		
		js.executeScript("window.scroll(0,2000)");
		Thread.sleep(1500);
		String TwoTechCleared1 = Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\2TechCleared1.png");
		
		
	
		
		
		
		
		
		js.executeScript("window.scroll(0,100)");
		Thread.sleep(1000);
		driver.findElement(By.xpath(prop.getProperty("List_Assessment_3PlusTechCleared"))).click();
		Thread.sleep(1500);
		String ThreePlusTechCleared = Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\3PlusTechCleared.png");
		
		js.executeScript("window.scroll(0,2000)");
		Thread.sleep(1500);
		String ThreePlusTechCleared1 = Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\3PlusTechCleared1.png");
		
		js.executeScript("window.scroll(0,100)");
		Thread.sleep(1000);
		driver.findElement(By.xpath(prop.getProperty("List_Assessment_VersantCleared"))).click();
		Thread.sleep(1500);
		String VersantCleared = Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\VersantCleared.png");
		
		js.executeScript("window.scroll(0,2000)");
		Thread.sleep(1500);
		String VersantCleared1 = Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\VersantCleared1.png");
		
		js.executeScript("window.scroll(0,100)");
		Thread.sleep(1000);
		driver.findElement(By.xpath(prop.getProperty("List_Assessment_VersantFailed"))).click();
		Thread.sleep(1500);
		String VersantFailed = Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\VersantFailed.png");
		
		js.executeScript("window.scroll(0,2000)");
		Thread.sleep(1500);
		String VersantFailed1 = Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\VersantFailed1.png");
		
		js.executeScript("window.scroll(0,100)");
		Thread.sleep(1000);
		driver.findElement(By.xpath(prop.getProperty("List_Legal_Pending"))).click();
		Thread.sleep(1500);
		js.executeScript("window.scroll(0,2000)");
		Thread.sleep(1500);
		String Legal_Pending = Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\Legal_Pending.png");
		
		js.executeScript("window.scroll(0,100)");
		Thread.sleep(1000);
		String Legal_Pending1 = Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\Legal_Pending1.png");
		
		driver.findElement(By.xpath(prop.getProperty("List_Legal_Decline"))).click();
		Thread.sleep(1500);
		String Legal_Decline = Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\Legal_Decline.png");
		
		js.executeScript("window.scroll(0,2000)");
		Thread.sleep(1500);
		String Legal_Decline1 = Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\Legal_Decline1.png");
		
		js.executeScript("window.scroll(0,100)");
		Thread.sleep(1000);
		driver.findElement(By.xpath(prop.getProperty("List_Legal_Signed"))).click();
		Thread.sleep(1500);
		String Legal_Signed = Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\Legal_Signed.png");
		
		js.executeScript("window.scroll(0,2000)");
		Thread.sleep(1500);
		String Legal_Signed1= Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\Legal_Signed1.png");
		
		js.executeScript("window.scroll(0,100)");
		Thread.sleep(1000);
		driver.findElement(By.xpath(prop.getProperty("List_On_Boarded"))).click();
		Thread.sleep(1500);
		String On_Boarded= Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\On_Boarded.png");
		
		js.executeScript("window.scroll(0,2000)");
		Thread.sleep(1500);
		
		String On_Boarded1= Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\On_Boarded1.png");
		
		js.executeScript("window.scroll(0,100)");
		Thread.sleep(1000);
		driver.findElement(By.xpath(prop.getProperty("List_Filter"))).click();
		js.executeScript("window.scroll(0,400)");
		
		
		
		Thread.sleep(2500);
		driver.findElement(By.xpath(prop.getProperty("List_Filter_QualifiedStatus"))).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("List_Filter_QualifiedStatus_All"))).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("List_Filter_Status"))).click();
		Thread.sleep(2500);
		
		driver.findElement(By.xpath(prop.getProperty("List_Filter_Status_Registration_Pending"))).click();
		Thread.sleep(2500);
		String Status_Registration_Pending= Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\Status_Registration_Pending.png");
		
		js.executeScript("window.scroll(0,2000)");
		Thread.sleep(1500);
		
		String Status_Registration_Pending1= Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\Status_Registration_Pending1.png");
		
		
		js.executeScript("window.scroll(0,400)");
		Thread.sleep(1000);
		driver.findElement(By.xpath(prop.getProperty("List_Filter_Status"))).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath(prop.getProperty("List_Filter_Status_Assessment_Pending"))).click();
		Thread.sleep(2500);
		js.executeScript("window.scroll(0,2000)");
		Thread.sleep(1500);
		js.executeScript("window.scroll(0,400)");
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath(prop.getProperty("List_Filter_Status"))).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath(prop.getProperty("List_Filter_Status_AssessmentInProcess"))).click();
		Thread.sleep(2500);
		js.executeScript("window.scroll(0,2000)");
		Thread.sleep(1500);
		js.executeScript("window.scroll(0,400)");
		Thread.sleep(1000);
		driver.findElement(By.xpath(prop.getProperty("List_Filter_Status"))).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath(prop.getProperty("List_Filter_Status_AllAssessmentCompleted"))).click();
		Thread.sleep(2500);
		js.executeScript("window.scroll(0,2000)");
		Thread.sleep(1500);
		js.executeScript("window.scroll(0,400)");
		Thread.sleep(1000);
		driver.findElement(By.xpath(prop.getProperty("List_Filter_Status"))).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath(prop.getProperty("List_Filter_Status_LegalPending"))).click();
		Thread.sleep(2500);
		js.executeScript("window.scroll(0,2000)");
		Thread.sleep(1500);
		js.executeScript("window.scroll(0,400)");
		Thread.sleep(1000);
		driver.findElement(By.xpath(prop.getProperty("List_Filter_Status"))).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath(prop.getProperty("List_Filter_Status_LegalSigned"))).click();
		Thread.sleep(2500);
		js.executeScript("window.scroll(0,2000)");
		Thread.sleep(1500);
		js.executeScript("window.scroll(0,400)");
		Thread.sleep(1000);
		driver.findElement(By.xpath(prop.getProperty("List_Filter_Status"))).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath(prop.getProperty("List_Filter_Status_OnBoarded"))).click();
		Thread.sleep(2500);
		js.executeScript("window.scroll(0,2000)");
		Thread.sleep(1500);
		js.executeScript("window.scroll(0,400)");
		Thread.sleep(1000);
		driver.findElement(By.xpath(prop.getProperty("List_Filter_Status"))).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath(prop.getProperty("List_Filter_Status_All"))).click();
		js.executeScript("window.scroll(0,2000)");
		Thread.sleep(1500);
		js.executeScript("window.scroll(0,400)");
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath(prop.getProperty("List_Filter_Date_From"))).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("List_Filter_Date_From"))).sendKeys(Start_Date);
		Thread.sleep(1500);
		
		String Start_Date1= Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\Start_Date1.png");
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		driver.findElement(By.xpath(prop.getProperty("List_Filter_Date_End"))).sendKeys(End_Date);
		Thread.sleep(1500);
		String End_Date1= Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\End_Date1.png");
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		js.executeScript("window.scroll(0,2000)");
		Thread.sleep(1500);
		js.executeScript("window.scroll(0,400)");
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath(prop.getProperty("List_Filter_Date_From"))).click();
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_BACK_SPACE);
		r.keyRelease(KeyEvent.VK_BACK_SPACE);
		r.keyRelease(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(prop.getProperty("List_Filter_Date_End"))).click();
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_BACK_SPACE);
		r.keyRelease(KeyEvent.VK_BACK_SPACE);
		r.keyRelease(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(prop.getProperty("List_Filter_PointOfContact"))).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("List_Filter_PointOfContact_Search"))).sendKeys(POC_Search);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		String PointOfContact= Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\PointOfContact.png");
		Thread.sleep(1500);
		js.executeScript("window.scroll(0,2000)");
		Thread.sleep(1500);
		String PointOfContact1= Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\PointOfContact1.png");
		
		js.executeScript("window.scroll(0,400)");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(prop.getProperty("List_Filter_PointOfContact"))).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("List_Filter_PointOfContact_All"))).click();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		js.executeScript("window.scroll(0,2000)");
		Thread.sleep(1500);
		js.executeScript("window.scroll(0,400)");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(prop.getProperty("List_Filter_QualifiedStatus"))).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("List_Filter_QualifiedStatus_NotAvailable"))).click();
		js.executeScript("window.scroll(0,2000)");
		Thread.sleep(1500);
		js.executeScript("window.scroll(0,400)");
		Thread.sleep(1000);	
		
		driver.findElement(By.xpath(prop.getProperty("List_Filter_QualifiedStatus"))).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("List_Filter_QualifiedStatus_Qualified3PlusYears"))).click();
		js.executeScript("window.scroll(0,2000)");
		Thread.sleep(1500);
		js.executeScript("window.scroll(0,400)");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(prop.getProperty("List_Filter_QualifiedStatus"))).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("List_Filter_QualifiedStatus_NotQualified"))).click();
		js.executeScript("window.scroll(0,2000)");
		Thread.sleep(1500);
		js.executeScript("window.scroll(0,400)");
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath(prop.getProperty("List_Filter_QualifiedStatus"))).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("List_Filter_QualifiedStatus_All"))).click();
		
		String QualifiedStatus_All= Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\QualifiedStatus_All.png");
		
		js.executeScript("window.scroll(0,2000)");
		Thread.sleep(1500);
		js.executeScript("window.scroll(0,400)");
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath(prop.getProperty("List_Filter_QualifiedStatus"))).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("List_Filter_QualifiedStatus_All"))).click();
		js.executeScript("window.scroll(0,2000)");
		Thread.sleep(1500);
		js.executeScript("window.scroll(0,400)");
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath(prop.getProperty("List_Filter_TalentSource"))).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("List_Filter_TalentSource_SkillBased"))).click();
		js.executeScript("window.scroll(0,2000)");
		Thread.sleep(1500);
		js.executeScript("window.scroll(0,400)");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(prop.getProperty("List_Filter_TalentSource"))).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("List_Filter_TalentSource_ProfileBased"))).click();
		js.executeScript("window.scroll(0,2000)");
		Thread.sleep(1500);
		js.executeScript("window.scroll(0,400)");
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath(prop.getProperty("List_Filter_TalentSource"))).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("List_Filter_TalentSource_ODR"))).click();
		js.executeScript("window.scroll(0,2000)");
		Thread.sleep(1500);
		js.executeScript("window.scroll(0,400)");
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath(prop.getProperty("List_Filter_TalentSource"))).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("List_Filter_TalentSource_ALL"))).click();
		js.executeScript("window.scroll(0,2000)");
		Thread.sleep(1500);
		js.executeScript("window.scroll(0,400)");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(prop.getProperty("List_Filter_Role"))).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("List_Filter_Role_Search"))).sendKeys(Role);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		js.executeScript("window.scroll(0,2000)");
		Thread.sleep(1500);
		js.executeScript("window.scroll(0,400)");
		Thread.sleep(2000);
		driver.findElement(By.xpath(prop.getProperty("List_Filter_Role"))).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("List_Filter_Role_ALL"))).click();
		Thread.sleep(1500);
		
		
		driver.findElement(By.xpath(prop.getProperty("List_Filter_CurrentEmployeeStatus"))).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("List_Filter_CurrentEmployeeStatus_FullTimeEmployee"))).click();
		js.executeScript("window.scroll(0,2000)");
		Thread.sleep(1500);
		js.executeScript("window.scroll(0,400)");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(prop.getProperty("List_Filter_CurrentEmployeeStatus"))).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("List_Filter_CurrentEmployeeStatus_FullTimeFreelancing"))).click();
		js.executeScript("window.scroll(0,2000)");
		Thread.sleep(1500);
		js.executeScript("window.scroll(0,400)");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(prop.getProperty("List_Filter_CurrentEmployeeStatus"))).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("List_Filter_CurrentEmployeeStatus_OnContract"))).click();
		js.executeScript("window.scroll(0,2000)");
		Thread.sleep(1500);
		js.executeScript("window.scroll(0,400)");
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath(prop.getProperty("List_Filter_CurrentEmployeeStatus"))).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("List_Filter_CurrentEmployeeStatus_UnEmployed"))).click();
		js.executeScript("window.scroll(0,2000)");
		Thread.sleep(1500);
		js.executeScript("window.scroll(0,400)");
		Thread.sleep(1000);
		driver.findElement(By.xpath(prop.getProperty("List_Filter_CurrentEmployeeStatus"))).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(prop.getProperty("List_Filter_CurrentEmployeeStatus_All"))).click();
		
		
		driver.findElement(By.xpath(prop.getProperty("List_Filter_Availability"))).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("List_Filter_Availability_FullTime"))).click();
		js.executeScript("window.scroll(0,2000)");
		Thread.sleep(1500);
		js.executeScript("window.scroll(0,400)");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(prop.getProperty("List_Filter_Availability"))).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("List_Filter_Availability_PartTime"))).click();
		js.executeScript("window.scroll(0,2000)");
		Thread.sleep(1500);
		js.executeScript("window.scroll(0,400)");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(prop.getProperty("List_Filter_Availability"))).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("List_Filter_Availability_ProjectToProject"))).click();
		js.executeScript("window.scroll(0,2000)");
		Thread.sleep(1500);
		js.executeScript("window.scroll(0,400)");
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath(prop.getProperty("List_Filter_Availability"))).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("List_Filter_Availability_All"))).click();
		js.executeScript("window.scroll(0,2000)");
		Thread.sleep(1500);
		js.executeScript("window.scroll(0,400)");
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath(prop.getProperty("List_Filter_Talent_Parking_Status"))).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("List_Filter_Talent_Parking_Status_Parked"))).click();
		js.executeScript("window.scroll(0,2000)");
		Thread.sleep(1500);
		js.executeScript("window.scroll(0,400)");
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath(prop.getProperty("List_Filter_Talent_Parking_Status"))).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("List_Filter_Talent_Parking_Status_NotParked"))).click();
		js.executeScript("window.scroll(0,2000)");
		Thread.sleep(1500);
		js.executeScript("window.scroll(0,400)");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(prop.getProperty("List_Filter_Talent_Parking_Status"))).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("List_Filter_Talent_Parking_Status_Select"))).click();
		js.executeScript("window.scroll(0,2000)");
		Thread.sleep(1500);
		js.executeScript("window.scroll(0,400)");
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath(prop.getProperty("List_Filter_MethodOfWorking"))).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("List_Filter_MethodOfWorking_Office"))).click();
		js.executeScript("window.scroll(0,2000)");
		Thread.sleep(1500);
		js.executeScript("window.scroll(0,400)");
		Thread.sleep(1000);
		driver.findElement(By.xpath(prop.getProperty("List_Filter_MethodOfWorking"))).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("List_Filter_MethodOfWorking_Office"))).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(prop.getProperty("List_Filter_MethodOfWorking"))).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("List_Filter_MethodOfWorking_Hybrid"))).click();
		js.executeScript("window.scroll(0,2000)");
		Thread.sleep(1500);
		js.executeScript("window.scroll(0,400)");
		Thread.sleep(1000);
		driver.findElement(By.xpath(prop.getProperty("List_Filter_MethodOfWorking"))).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("List_Filter_MethodOfWorking_Hybrid"))).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath(prop.getProperty("List_Filter_MethodOfWorking"))).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("List_Filter_MethodOfWorking_Remote"))).click();
		js.executeScript("window.scroll(0,2000)");
		Thread.sleep(1500);
		js.executeScript("window.scroll(0,400)");
		Thread.sleep(1000);
		driver.findElement(By.xpath(prop.getProperty("List_Filter_MethodOfWorking"))).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("List_Filter_MethodOfWorking_Remote"))).click();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath(prop.getProperty("List_Filter_SourceLink"))).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("List_Filter_SourceLink_Search"))).sendKeys(SourceLink_Organic);
		Thread.sleep(1500);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		js.executeScript("window.scroll(0,2000)");
		Thread.sleep(1500);
		js.executeScript("window.scroll(0,400)");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(prop.getProperty("List_Filter_SourceLink"))).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("List_Filter_SourceLink_Search"))).sendKeys(SourceLink_Paid);
		Thread.sleep(1500);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		js.executeScript("window.scroll(0,2000)");
		Thread.sleep(1500);
		js.executeScript("window.scroll(0,400)");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(prop.getProperty("List_Filter_SourceLink"))).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("List_Filter_SourceLink_Search"))).sendKeys(SourceLink_Email);
		Thread.sleep(1500);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		js.executeScript("window.scroll(0,2000)");
		Thread.sleep(1500);
		js.executeScript("window.scroll(0,400)");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(prop.getProperty("List_Filter_SourceLink"))).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("List_Filter_SourceLink_Search"))).sendKeys(SourceLink_WhatsApp);
		Thread.sleep(1500);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		js.executeScript("window.scroll(0,2000)");
		Thread.sleep(1500);
		js.executeScript("window.scroll(0,400)");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(prop.getProperty("List_Filter_SourceLink"))).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("List_Filter_SourceLink_Search"))).sendKeys(SourceLink_SocialMedia);
		Thread.sleep(1500);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		js.executeScript("window.scroll(0,2000)");
		Thread.sleep(1500);
		js.executeScript("window.scroll(0,400)");
		Thread.sleep(1000);
		driver.findElement(By.xpath(prop.getProperty("List_Filter_SourceLink"))).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(prop.getProperty("List_Filter_SourceLink_Select"))).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath(prop.getProperty("Excel"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(prop.getProperty("CSV"))).click();
		Thread.sleep(6000);
	
				
		
		try {
			ScreenRecorderUtil.stopRecord();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Ignore
	@Test(dataProvider = "Talent_Data", dataProviderClass = ReadXlsx_Talents.class, priority = 3)
	public void Add_Talents(String Talent_Name, String Talent_Email, String Contact_No, String LinkedIn,
			String Current_Pay, String Expected_Pay, String Experience, String Position_Applied, String Notice_Period,
			String Assessment_1, String Assessment_2, String Assessment_3, String Resume)
			throws InterruptedException, AWTException, IOException {

		driver.findElement(By.xpath(prop.getProperty("Talents"))).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("List"))).click();

		driver.findElement(By.xpath(prop.getProperty("List_Add_Talent"))).click();
		driver.findElement(By.xpath(prop.getProperty("List_Talent_Name"))).clear();
		String Talent_Name_TextBox = Screenshot(
				"C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Add_Talent\\Talent_Name_TextBox.png");
		driver.findElement(By.xpath(prop.getProperty("List_Talent_Name"))).sendKeys(Talent_Name);

		String Talent_Name_Enter = Screenshot(
				"C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Add_Talent\\Talent_Name_Enter.png");

		extent.createTest("Talent Name").log(Status.INFO, "Talent Name Entered")
				.addScreenCaptureFromBase64String(Talent_Name_TextBox)
				.addScreenCaptureFromBase64String(Talent_Name_Enter);

		driver.findElement(By.xpath(prop.getProperty("List_Talent_Email"))).clear();

		String Talent_Email_TextBox = Screenshot(
				"C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Add_Talent\\Talent_Email_TextBox.png");

		driver.findElement(By.xpath(prop.getProperty("List_Talent_Email"))).sendKeys(Talent_Email);

		String Talent_Email_Entered = Screenshot(
				"C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Add_Talent\\Talent_Email_Entered.png");

		extent.createTest("Talent Email").log(Status.INFO, "Talent Email Entered")
				.addScreenCaptureFromBase64String(Talent_Email_TextBox)
				.addScreenCaptureFromBase64String(Talent_Email_Entered);

		driver.findElement(By.xpath(prop.getProperty("List_Talent_Contact_No"))).clear();
		String Talent_Contact_TextBox = Screenshot(
				"C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Add_Talent\\Talent_Contact_TextBox.png");

		driver.findElement(By.xpath(prop.getProperty("List_Talent_Contact_No"))).sendKeys(Contact_No);

		String Talent_Contact_Entered = Screenshot(
				"C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Add_Talent\\Talent_Contact_Entered.png");

		extent.createTest("Talent Contact").log(Status.INFO, "Talent Contact Entered")
				.addScreenCaptureFromBase64String(Talent_Contact_TextBox)
				.addScreenCaptureFromBase64String(Talent_Contact_Entered);

		driver.findElement(By.xpath(prop.getProperty("List_Talent_Source"))).click();
		Thread.sleep(1500);

		String Talent_Source_TextBox = Screenshot(
				"C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Add_Talent\\Talent_Source_TextBox.png");

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		Thread.sleep(3000);

//	r.keyPress(KeyEvent.VK_DOWN);
//	r.keyRelease(KeyEvent.VK_DOWN);
//	

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		String Talent_Source_Entered = Screenshot(
				"C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Add_Talent\\Talent_Source_Entered.png");

		extent.createTest("Talent Source Choose").log(Status.INFO, "Talent Source Entered")
				.addScreenCaptureFromBase64String(Talent_Source_TextBox)
				.addScreenCaptureFromBase64String(Talent_Source_Entered);

		driver.findElement(By.xpath(prop.getProperty("List_Talent_LinkedIn"))).clear();

		String Talent_linkedIn_TextBox = Screenshot(
				"C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Add_Talent\\Talent_linkedIn_TextBox.png");

		driver.findElement(By.xpath(prop.getProperty("List_Talent_LinkedIn"))).sendKeys(LinkedIn);

		String Talent_LinkedIn_Entered = Screenshot(
				"C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Add_Talent\\Talent_LinkedIn_Entered.png");

		extent.createTest("Talent LinkedIn").log(Status.INFO, "Talent LinkedIn Entered")
				.addScreenCaptureFromBase64String(Talent_linkedIn_TextBox)
				.addScreenCaptureFromBase64String(Talent_LinkedIn_Entered);

		driver.findElement(By.xpath(prop.getProperty("List_Current_Employee_Status"))).click();

		String Talent_EmployeeStatus = Screenshot(
				"C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Add_Talent\\Talent_EmployeeStatus.png");

		driver.findElement(By.xpath(prop.getProperty("List_Current_Employee_Status_Full_Time_Employee"))).click();

		String Talent_FullTimeEmployee = Screenshot(
				"C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Add_Talent\\Talent_FullTimeEmployee.png");

		driver.findElement(By.xpath(prop.getProperty("List_Current_Employee_Status"))).click();
		driver.findElement(By.xpath(prop.getProperty("List_Current_Employee_Status_Full_Time_Freelancing"))).click();

		String Talent_FullTimeFreeLancing = Screenshot(
				"C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Add_Talent\\Talent_FullTimeFreeLancing.png");

		driver.findElement(By.xpath(prop.getProperty("List_Current_Employee_Status"))).click();
		driver.findElement(By.xpath(prop.getProperty("List_Current_Employee_Status_On_Contract"))).click();

		String Talent_OnContract = Screenshot(
				"C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Add_Talent\\Talent_OnContract.png");

		driver.findElement(By.xpath(prop.getProperty("List_Current_Employee_Status"))).click();
		driver.findElement(By.xpath(prop.getProperty("List_Current_Employee_Status_Un_Employed"))).click();

		String Talent_UnEmployed = Screenshot(
				"C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Add_Talent\\Talent_UnEmployed.png");

		extent.createTest("Talent Current Employee Status").log(Status.INFO, "Talent Choose UnEmployed ")
				.addScreenCaptureFromBase64String(Talent_EmployeeStatus)
				.addScreenCaptureFromBase64String(Talent_FullTimeEmployee)
				.addScreenCaptureFromBase64String(Talent_FullTimeFreeLancing)
				.addScreenCaptureFromBase64String(Talent_OnContract)
				.addScreenCaptureFromBase64String(Talent_UnEmployed);

		driver.findElement(By.xpath(prop.getProperty("List_Talent_Current_CTC"))).clear();
		String Talent_CurrentCTC_TextBox = Screenshot(
				"C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Add_Talent\\Talent_CurrentCTC_TextBox.png");

		driver.findElement(By.xpath(prop.getProperty("List_Talent_Current_CTC"))).sendKeys(Current_Pay);
		String Talent_CurrentCTC_Entered = Screenshot(
				"C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Add_Talent\\Talent_CurrentCTC_Entered.png");

		extent.createTest("Talent Current CTC").log(Status.INFO, "Current CTC Entered")
				.addScreenCaptureFromBase64String(Talent_CurrentCTC_TextBox)
				.addScreenCaptureFromBase64String(Talent_CurrentCTC_Entered);

		driver.findElement(By.xpath(prop.getProperty("List_Talent_Expected_CTC"))).clear();

		String Talent_ExpectedCTC_TextBox = Screenshot(
				"C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Add_Talent\\Talent_ExpectedCTC_TextBox.png");

		driver.findElement(By.xpath(prop.getProperty("List_Talent_Expected_CTC"))).sendKeys(Expected_Pay);

		String Talent_ExpectedCTC_Entered = Screenshot(
				"C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Add_Talent\\Talent_ExpectedCTC_Entered.png");

		extent.createTest("Talent Expected CTC").log(Status.INFO, "Expected CTC Entered")
				.addScreenCaptureFromBase64String(Talent_ExpectedCTC_TextBox)
				.addScreenCaptureFromBase64String(Talent_ExpectedCTC_Entered);

		driver.findElement(By.xpath(prop.getProperty("List_Talent_Experience"))).sendKeys(Experience);

		String Talent_Experience_Entered = Screenshot(
				"C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Add_Talent\\Talent_Experience_Entered.png");

		extent.createTest("Talent Experience").log(Status.INFO, "Experience Entered")
				.addScreenCaptureFromBase64String(Talent_Experience_Entered);

		driver.findElement(By.xpath(prop.getProperty("List_Talent_Position_Applied"))).click();

		Thread.sleep(2000);
		String Talent_PositionApplied = Screenshot(
				"C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Add_Talent\\Talent_PositionApplied.png");

		driver.findElement(By.xpath(prop.getProperty("List_Talent_Position_Applied_TextBox")))
				.sendKeys(Position_Applied);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(1500);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		String Talent_PositionApplied_Entered = Screenshot(
				"C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Add_Talent\\Talent_PositionApplied_Entered.png");

		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		extent.createTest("Position Applied").log(Status.INFO, "Position Entered")
				.addScreenCaptureFromBase64String(Talent_PositionApplied)
				.addScreenCaptureFromBase64String(Talent_PositionApplied_Entered);

		Thread.sleep(2000);
//	driver.findElement(By.xpath(prop.getProperty("List_Talent_Notice_Period"))).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(prop.getProperty("List_Talent_Notice_Period_Immediately"))).click();

		String Talent_NoticePeriod_Immediately = Screenshot(
				"C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Add_Talent\\Talent_NoticePeriod_Immediately.png");

		extent.createTest("Notice Period ").log(Status.INFO, "Talent Choose Notice Period")
				.addScreenCaptureFromBase64String(Talent_NoticePeriod_Immediately);

		// driver.findElement(By.xpath(prop.getProperty("List_Talent_Notice_Period"))).click();

		driver.findElement(By.xpath(prop.getProperty("List_Talent_Working_Hours"))).click();

		String Talent_Working_Hours = Screenshot(
				"C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Add_Talent\\Talent_Working_Hours.png");

		driver.findElement(By.xpath(prop.getProperty("List_Talent_Working_Hours_US_Fullshift"))).click();

		driver.findElement(By.xpath(prop.getProperty("List_Talent_Working_Hours"))).click();
		driver.findElement(By.xpath(prop.getProperty("List_Talent_Working_Hours_US_Partialshift"))).click();

		driver.findElement(By.xpath(prop.getProperty("List_Talent_Working_Hours"))).click();
		driver.findElement(By.xpath(prop.getProperty("List_Talent_Working_Hours_UK_Fullshift"))).click();

		driver.findElement(By.xpath(prop.getProperty("List_Talent_Working_Hours"))).click();
		driver.findElement(By.xpath(prop.getProperty("List_Talent_Working_Hours_IST_Fullshift"))).click();

		driver.findElement(By.xpath(prop.getProperty("List_Talent_Working_Hours"))).click();
		driver.findElement(By.xpath(prop.getProperty("List_Talent_Working_Hours_AU_Fullshift"))).click();

		driver.findElement(By.xpath(prop.getProperty("List_Talent_Working_Hours"))).click();
		driver.findElement(By.xpath(prop.getProperty("List_Talent_Working_Hours_AU_Partialshift"))).click();

		String Talent_Working_Hours_AUPartialShift = Screenshot(
				"C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Add_Talent\\Talent_Working_Hours_AUPartialShift.png");

		Thread.sleep(1500);

		extent.createTest("Working Hours Preference1 ").log(Status.INFO, "Talent Choosed AU Partial Shift")
				.addScreenCaptureFromBase64String(Talent_Working_Hours)
				.addScreenCaptureFromBase64String(Talent_Working_Hours_AUPartialShift);

		driver.findElement(By.xpath(prop.getProperty("List_Talent_Working_Hours_2"))).click();
		Thread.sleep(1500);

		String Talent_Working_Hours2 = Screenshot(
				"C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Add_Talent\\Talent_Working_Hours2.png");

		try {
			List<WebElement> working2 = driver.findElements(By.xpath("//ul[@id='select2-shift_1-results']/li"));
			for (WebElement webElement : working2) {
				System.out.println(webElement.getText());
				if (webElement.getText().equalsIgnoreCase("UK Shift 2:00 PM to 11:00 PM")) {
					webElement.click();
				}
			}
		} catch (Exception e1) {

			List<WebElement> working2 = driver.findElements(By.xpath("//ul[@id='select2-shift_1-results']/li"));
			for (WebElement webElement : working2) {
				System.out.println(webElement.getText());
				if (webElement.getText().equalsIgnoreCase("UK Shift 2:00 PM to 11:00 PM")) {
					webElement.click();
				}
			}

		}

		String Talent_Working_Hours_UKShift = Screenshot(
				"C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Add_Talent\\Talent_Working_Hours_UKShift.png");

		extent.createTest("Working Hours Preference2 ").log(Status.INFO, "Talent Choosed UK Shift")
				.addScreenCaptureFromBase64String(Talent_Working_Hours2)
				.addScreenCaptureFromBase64String(Talent_Working_Hours_UKShift);

		driver.findElement(By.xpath(prop.getProperty("List_Talent_Working_Hours_3"))).click();

		Thread.sleep(1500);

		String Talent_Working_Hours3 = Screenshot(
				"C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Add_Talent\\Talent_Working_Hours3.png");

		try {
			List<WebElement> working3 = driver.findElements(By.xpath("//ul[@id='select2-shift_2-results']/li"));
			for (WebElement webElement : working3) {
				System.out.println(webElement.getText());
				if (webElement.getText().equalsIgnoreCase("IST Full Shift 10:30 AM to 7:30 PM")) {
					webElement.click();
				}
			}
		} catch (Exception e1) {

			List<WebElement> working3 = driver.findElements(By.xpath("//ul[@id='select2-shift_2-results']/li"));
			for (WebElement webElement : working3) {
				System.out.println(webElement.getText());
				if (webElement.getText().equalsIgnoreCase("IST Full Shift 10:30 AM to 7:30 PM")) {
					webElement.click();
				}
			}

		}

		Thread.sleep(1500);

		String Talent_Working_Hours_ISTShift = Screenshot(
				"C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Add_Talent\\Talent_Working_Hours_ISTShift.png");

		extent.createTest("Working Hours Preference3 ").log(Status.INFO, "Talent Choosed IST Shift")
				.addScreenCaptureFromBase64String(Talent_Working_Hours3)
				.addScreenCaptureFromBase64String(Talent_Working_Hours_ISTShift);

		driver.findElement(By.xpath(prop.getProperty("List_Talent_Method_Of_Working1"))).click();
		driver.findElement(By.xpath(prop.getProperty("List_Talent_Method_Of_Working_Remote"))).click();

		String Talent_Remote = Screenshot(
				"C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Add_Talent\\Talent_Remote.png");

		driver.findElement(By.xpath(prop.getProperty("List_Talent_Method_Of_Working2"))).click();
		driver.findElement(By.xpath(prop.getProperty("List_Talent_Method_Of_Working_In_Office"))).click();

		String Talent_InOffice = Screenshot(
				"C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Add_Talent\\Talent_InOffice.png");

		driver.findElement(By.xpath(prop.getProperty("List_Talent_Method_Of_Working3"))).click();
		driver.findElement(By.xpath(prop.getProperty("List_Talent_Method_Of_Working_Hybrid"))).click();

		String Talent_Hybrid = Screenshot(
				"C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Add_Talent\\Talent_Hybrid.png");

		Thread.sleep(1500);

		extent.createTest("Method of Working ").log(Status.INFO, "Talent Choose Method of Working")
				.addScreenCaptureFromBase64String(Talent_Remote).addScreenCaptureFromBase64String(Talent_InOffice)
				.addScreenCaptureFromBase64String(Talent_Hybrid);

		driver.findElement(By.xpath(prop.getProperty("List_Talent_Skill_Based_Assessment"))).click();
		Thread.sleep(1500);

		List<WebElement> assesment = driver
				.findElements(By.xpath("//label[.='Search Skills For Assessments']/following::ul[2]/li"));

		for (WebElement w : assesment) {
			if (w.getText().equalsIgnoreCase(Assessment_1)) {
				w.click();
				break;
			}

		}

		String Talent_Assessment1 = Screenshot(
				"C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Add_Talent\\Talent_Assessment1.png");

		driver.findElement(By.xpath(prop.getProperty("List_Talent_Skill_Based_Assessment"))).click();

		Thread.sleep(1000);

		try {

			List<WebElement> assesments = driver
					.findElements(By.xpath("//label[.='Search Skills For Assessments']/following::ul[2]/li"));
			for (WebElement w : assesments) {
				if (w.getText().equalsIgnoreCase(Assessment_2)) {
					w.click();
					break;
				}
			}
		} catch (StaleElementReferenceException e) {
			List<WebElement> assesments = driver
					.findElements(By.xpath("//label[.='Search Skills For Assessments']/following::ul[2]/li"));
			for (WebElement w : assesments) {
				if (w.getText().equalsIgnoreCase(Assessment_2)) {
					w.click();
					break;
				}

			}
		}

		String Talent_Assessment2 = Screenshot(
				"C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Add_Talent\\Talent_Assessment2.png");

		driver.findElement(By.xpath(prop.getProperty("List_Talent_Skill_Based_Assessment"))).click();

		try {
			List<WebElement> assesments3 = driver
					.findElements(By.xpath("//label[.='Search Skills For Assessments']/following::ul[2]/li"));

			for (WebElement w : assesments3) {
				if (w.getText().equalsIgnoreCase(Assessment_3)) {
					w.click();
					break;

				}

			}
		} catch (StaleElementReferenceException e) {
			List<WebElement> assesments3 = driver
					.findElements(By.xpath("//label[.='Search Skills For Assessments']/following::ul[2]/li"));

			for (WebElement w : assesments3) {
				if (w.getText().equalsIgnoreCase(Assessment_3)) {
					w.click();
					break;

				}

			}

		}

		String Talent_Assessment3 = Screenshot(
				"C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Add_Talent\\Talent_Assessment3.png");

		extent.createTest("Talent Skills for Assessment ").log(Status.INFO, "Assessment Choosed")
				.addScreenCaptureFromBase64String(Talent_Assessment1)
				.addScreenCaptureFromBase64String(Talent_Assessment2)
				.addScreenCaptureFromBase64String(Talent_Assessment3);

		driver.findElement(By.xpath(prop.getProperty("List_Talent_resume"))).sendKeys(Resume);

		String Talent_Resume = Screenshot(
				"C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Add_Talent\\Talent_Resume.png");
		extent.createTest(" Talent Resume   ").log(Status.INFO, "Resume Uploaded Successfully")
				.addScreenCaptureFromBase64String(Talent_Resume);

		driver.findElement(By.xpath(prop.getProperty("List_Talent_Submit"))).click();
		Thread.sleep(4000);

		String Profile_Created = Screenshot(
				"C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Add_Talent\\Profile_Created.png");
		extent.createTest("Talent Profile Creation").log(Status.PASS, "Profile Created Successfully")
				.addScreenCaptureFromBase64String(Profile_Created);

		try {
			// ScreenRecorderUtil.stopRecord();
		} catch (Exception e) {
			e.printStackTrace();
		}

//	extent.flush();
	}
	

	

	@Ignore
	@Test(dataProvider="Talent_Profile_Update_Data" , dataProviderClass=ReadXlsx_Talent_Profile_Update.class , priority=4)
	public void Profile_Update(String Search , String Notes )  throws InterruptedException, AWTException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Robot r = new Robot();

		driver.findElement(By.xpath(prop.getProperty("Talents"))).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("List"))).click();

		driver.findElement(By.xpath(prop.getProperty("List_Search"))).sendKeys("testabc");

		js.executeScript("window.scroll(0,800)");
		Thread.sleep(3000);

		List<WebElement> findElements = driver.findElements(By.xpath("//td"));
		for (WebElement webElement : findElements) {
			System.out.println(webElement.getText());
		}

		Thread.sleep(3000);

		WebElement findElement = driver.findElement(By.xpath("//tbody/tr/td[1]/div/button"));
		findElement.click();

		Thread.sleep(2000);

		List<WebElement> findElements2 = driver
				.findElements(By.xpath("//table[@id='team_table']/tbody/tr/td/div/div/a"));
		for (WebElement webElement : findElements2) {
			if (webElement.getText().equalsIgnoreCase("Detail")) {
				webElement.click();
			}
		}

		String parent = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();

		for (String window : windowHandles) {

			if (!window.equals(parent)) {
				driver.switchTo().window(window);
				System.out.println(driver.getTitle());
			}
		}
		
		

		driver.findElement(By.xpath(prop.getProperty("List_Resume"))).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("List_Assessments"))).click();
		Thread.sleep(1500);
		
		
		driver.findElement(By.xpath(prop.getProperty("List_Legal"))).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("List_Notes"))).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("List_Scheduled_Emails"))).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("List_Scheduled_Emails_Search"))).sendKeys(Search );
		Thread.sleep(1500);

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_DELETE);
		r.keyRelease(KeyEvent.VK_DELETE);
		r.keyRelease(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("List_Notes"))).click();

		driver.findElement(By.xpath(prop.getProperty("List_Notes_TextBox"))).sendKeys(Notes);
		
		
		
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);

		Thread.sleep(3000);

		
		driver.findElement(By.xpath(prop.getProperty("List_Notes_Bold"))).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("List_Notes_Italic"))).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("List_Notes_Underlined"))).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("List_Notes_Remove_Font_Style"))).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("List_Notes_Font_Size"))).click();
		Thread.sleep(1500);
		List<WebElement> fontsize = driver.findElements(By.xpath("//form[@id='add_details_form']//following::ul[@aria-label='Font Size']/li"));
		for (WebElement webElement : fontsize) {
			if(webElement.getText().equals("11")) {
				webElement.click();
			}
			
		}
		
		r.keyRelease(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("List_Notes_TextBox"))).click();
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		
		driver.findElement(By.xpath(prop.getProperty("List_Notes_More_Color"))).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//div[@data-event='backColor']/div/div/button)[11]")).click();
		
	//*****************************************************************************************************	
		
//		List<WebElement> backcolor = driver.findElements(By.xpath("//div[@data-event='backColor']/div/div/button"));
//		for (WebElement webElement : backcolor) {
//			String cssValue = webElement.getCssValue("background-color");
//			String color = Color.fromString(cssValue).asHex();
//			if(color.equals("#636363")) {
//				Thread.sleep(1500);
//				webElement.click();
//			}
//		}
	
		//*****************************************************************************************************
		
		r.keyRelease(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		
		driver.findElement(By.xpath(prop.getProperty("List_Notes_TextBox"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(prop.getProperty("List_Notes_UnOrdered_list"))).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("List_Notes_Ordered_list"))).click();
		Thread.sleep(1500);
	//	driver.findElement(By.xpath(prop.getProperty("List_Notes_Paragraph"))).click();
		Thread.sleep(1500);
		
		
		System.out.println("test");
		driver.findElement(By.xpath(prop.getProperty("List_Notes_Line_Height"))).click();
		Thread.sleep(1500);
		List<WebElement> lineheight = driver.findElements(By.xpath("//ul[@aria-label='Line Height']/li"));
		
		for (WebElement webElement : lineheight) {
			if(webElement.getText().equalsIgnoreCase("3.0")) {
				webElement.click();
			}
		}
		
		Thread.sleep(2000);
		driver.findElement(By.xpath(prop.getProperty("List_Notes_Line_Height"))).click();
		for (WebElement webElement : lineheight) {
			if(webElement.getText().equalsIgnoreCase("1.6")) {
				webElement.click();
			}
		}
		
		r.keyRelease(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("List_Notes_TextBox"))).click();
		
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		Thread.sleep(1500);
		
		driver.findElement(By.xpath(prop.getProperty("List_Notes_More_Color"))).click();
		
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//div[@data-event='backColor']/div/div/button)[8]")).click();
		Thread.sleep(1500);
		r.keyRelease(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		
		//**************************************
//		for (WebElement webElement : backcolor) {
//			String cssValue = webElement.getCssValue("background-color");
//			String color = Color.fromString(cssValue).asHex();
//			if(color.equals("#FFFFFF")) {
//				Thread.sleep(1500);
//				webElement.click();
//			}
//		}
		
		//*******************************************
		
		System.out.println("test2");
		
		driver.findElement(By.xpath(prop.getProperty("List_Notes_TextBox"))).click();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("List_Notes_More_Color"))).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//div[@data-event='foreColor']/div/div/button)[9]")).click();
		Thread.sleep(1500);
		
		r.keyRelease(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		driver.findElement(By.xpath(prop.getProperty("List_Notes_TextBox"))).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("List_Notes_Table"))).click();
		Thread.sleep(1500);
		
		driver.findElement(By.xpath(prop.getProperty("List_Notes_Table"))).click();
		
		Thread.sleep(1500);
		
		driver.findElement(By.xpath(prop.getProperty("List_Notes_Submit"))).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath(prop.getProperty("List_Legal"))).click();
		Thread.sleep(1500);
		
		driver.findElement(By.xpath(prop.getProperty("List_Legal_Search"))).click();
		driver.findElement(By.xpath(prop.getProperty("List_Legal_Search"))).sendKeys("djkhfj");
		Thread.sleep(1500);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_BACK_SPACE);
		r.keyRelease(KeyEvent.VK_BACK_SPACE);
		r.keyRelease(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(3500);
		
		
		try {
		//	ScreenRecorderUtil.stopRecord();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	@Ignore
	@Test(dataProvider="Talent_Profile_Update_Assessment_Data" , 
			dataProviderClass=ReadXlsx_Talent_Profile_Update_Assessments.class , priority = 5)
	public void TalentDashboard_Assessments(String Search ,String POC1 , String Assessment_Search1 ,
			String Add_New_Assessment1 , String Assessment_Update
) throws AWTException, InterruptedException, IOException {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Robot r = new Robot();
		
		driver.findElement(By.xpath(prop.getProperty("Talents"))).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("List"))).click();
		String List_Search = Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\Talent_DashBoard\\List_Search.png");
		
		js.executeScript("window.scroll(0,400)");
		driver.findElement(By.xpath(prop.getProperty("List_Search"))).sendKeys(Search);
		js.executeScript("window.scroll(0,400)");
		Thread.sleep(3000);
		String List_Search_Email = Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\Talent_DashBoard\\List_Search_Email.png");
		
		extent.createTest("Talent Email Search")
		.log(Status.INFO, "Email Displayed")
		.addScreenCaptureFromBase64String(List_Search)
		.addScreenCaptureFromBase64String(List_Search_Email);
		
		List<WebElement> findElements = driver.findElements(By.xpath("//td"));
		for (WebElement webElement : findElements) {
			System.out.println(webElement.getText());
		}

		Thread.sleep(3000);
		WebElement findElement = driver.findElement(By.xpath("//tbody/tr/td[1]/div/button"));
		findElement.click();
		Thread.sleep(2000);
		
		List<WebElement> findElements2 = driver
				.findElements(By.xpath("//table[@id='team_table']/tbody/tr/td/div/div/a"));
		for (WebElement webElement : findElements2) {
			if (webElement.getText().equalsIgnoreCase("Detail")) {
				webElement.click();
			}
		}

		String parent = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();

		for (String window : windowHandles) {

			if (!window.equals(parent)) {
				driver.switchTo().window(window);
				System.out.println(driver.getTitle());
			}
		}
		
		driver.findElement(By.xpath(prop.getProperty("List_Assessments"))).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("List_Assessments_POC"))).click();
		Thread.sleep(1500);
		
		String PointOfContact = Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\Talent_DashBoard\\PointOfContact.png");
		
		try {
			List<WebElement> point_Of_Contacts = driver.findElements(By.xpath(prop.getProperty("List_Assessments_POC_Options")));
			for (WebElement contact : point_Of_Contacts) {
				if(contact.getText().equalsIgnoreCase(POC1)) {
					contact.click();
				}
			}
			
		} catch (StaleElementReferenceException e) {

			List<WebElement> point_Of_Contacts = driver.findElements(By.xpath(prop.getProperty("List_Assessments_POC_Options")));
			for (WebElement contact : point_Of_Contacts) {
				if(contact.getText().equalsIgnoreCase(POC1)) {
					contact.click();
				}
			}
		}
		
		Thread.sleep(1500);
		
		String PointOfContactSelect = Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\Talent_DashBoard\\PointOfContactSelect.png");
		
		extent.createTest("Select Point of Contact")
		.log(Status.INFO, "Point of Contact is Selected")
		.addScreenCaptureFromBase64String(PointOfContact)
		.addScreenCaptureFromBase64String(PointOfContactSelect);
		
		String AssessmentSearch = Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\Talent_DashBoard\\AssessmentSearch.png");
		
		js.executeScript("window.scroll(0,200)");
		
		driver.findElement(By.xpath("//div[@id='assessments_table_filter']//input")).sendKeys(Assessment_Search1);
		Thread.sleep(1500);
		
		String AssessmentSearch1 = Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\Talent_DashBoard\\AssessmentSearch1.png");
		
		
		extent.createTest("Assessment Search")
		.log(Status.INFO, "Assessment Displayed")
		.addScreenCaptureFromBase64String(AssessmentSearch)
		.addScreenCaptureFromBase64String(AssessmentSearch1);
	
		
		Thread.sleep(1500);
		driver.findElement(By.xpath("//div[@id='assessments_table_filter']//input")).click();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_BACK_SPACE);
		r.keyRelease(KeyEvent.VK_BACK_SPACE);
		r.keyRelease(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		js.executeScript("window.scroll(0,400)");
		
		Thread.sleep(1500);
		WebElement row1open = driver.findElement(By.xpath("//table[@id='assessments_table']/tbody/tr[1]/td[1]"));
		js.executeScript("arguments[0].click()", row1open);
		Thread.sleep(1500);
		WebElement row1close = driver.findElement(By.xpath("//table[@id='assessments_table']/tbody/tr[1]/td[1]"));
		js.executeScript("arguments[0].click()", row1close);
		Thread.sleep(1500);
		
		WebElement row2open = driver.findElement(By.xpath("//table[@id='assessments_table']/tbody/tr[2]/td[1]"));
		js.executeScript("arguments[0].click()", row2open);
		Thread.sleep(1500);
		WebElement row2close = driver.findElement(By.xpath("//table[@id='assessments_table']/tbody/tr[2]/td[1]"));
		js.executeScript("arguments[0].click()", row2close);
		Thread.sleep(1500);
		js.executeScript("window.scroll(400,0)");
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("List_Assessments_AssignNewAssessment"))).click();
		
		Thread.sleep(2000);
	
		String NewAssignment = Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\Talent_DashBoard\\NewAssignment.png");
		
		driver.findElement(By.xpath(prop.getProperty("List_Assessments_AssignNewAssessment_AddSkill"))).click();
		Thread.sleep(1500);
		String NewAssignmentAddSkill = Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\Talent_DashBoard\\NewAssignmentAddSkill.png");
		driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys(Add_New_Assessment1);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
			
		Thread.sleep(1500);
		
		String NewAssignmentAddSkillSelected = Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\Talent_DashBoard\\NewAssignmentAddSkillSelected.png");
		
		driver.findElement(By.xpath(prop.getProperty("List_Assessments_AssignNewAssessment_Submit"))).click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(6000);
		
		String NewAssignmentAddSkillUpdated = Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\Talent_DashBoard\\NewAssignmentAddSkillUpdated.png");
		
		extent.createTest("Assign New Assessment")
		.log(Status.INFO, "New Assessment Updated ")
		.addScreenCaptureFromBase64String(NewAssignment)
		.addScreenCaptureFromBase64String(NewAssignmentAddSkill)
		.addScreenCaptureFromBase64String(NewAssignmentAddSkillSelected)
		.addScreenCaptureFromBase64String(NewAssignmentAddSkillUpdated);
		
		driver.findElement(By.xpath("//div[@id='assessments_table_filter']//input")).sendKeys(Assessment_Update);
		Thread.sleep(1500);
		js.executeScript("window.scroll(0,400)");
		Thread.sleep(1000);
		
		String SearchNewAssignment = Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\Talent_DashBoard\\SearchNewAssignment.png");
		
		extent.createTest("Search New Assessment")
		.log(Status.INFO, "New Assessment Displayed ")
		.addScreenCaptureFromBase64String(SearchNewAssignment);
	
	//	js.executeScript("arguments[0].click()", row1open);
		Thread.sleep(1500);
		
		js.executeScript("window.scroll(0,200)");
		
		driver.findElement(By.xpath(prop.getProperty("List_Assessments_ChangeAssessmentSequence"))).click();
		Thread.sleep(1500);
		
		String AssessmentSequence = Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\Talent_DashBoard\\AssessmentSequence.png");
		
		WebElement drag = driver.findElement(By.xpath(prop.getProperty("List_Assessments_ChangeAssessmentSequence_iMochaAnjaliTest")));
		WebElement drop = driver.findElement(By.xpath(prop.getProperty("List_Assessments_ChangeAssessmentSequence_Versant")));
		
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		a.dragAndDrop(drop, drag).build().perform();
		Thread.sleep(2000);

		String AssessmentSequenceUpdate = Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\Talent_DashBoard\\AssessmentSequenceUpdate.png");
	
		driver.findElement(By.xpath(prop.getProperty("List_Assessments_ChangeAssessmentSequence_Update"))).click();
		Thread.sleep(2000);
		
		js.executeScript("window.scroll(0,200)");
		Thread.sleep(2000);
		
		String AssessmentSequenceUpdated = Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\Talent_DashBoard\\AssessmentSequenceUpdated.png");
		
		extent.createTest("Assessment Versant Sequence Change")
		.log(Status.PASS, "Versant Sequence Updated")
		.addScreenCaptureFromBase64String(AssessmentSequence)
		.addScreenCaptureFromBase64String(AssessmentSequenceUpdate)
		.addScreenCaptureFromBase64String(AssessmentSequenceUpdated);
	
		extent.flush();
		
		Thread.sleep(2000);
		try {
		//	ScreenRecorderUtil.stopRecord();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	@Ignore
	@Test(dataProvider="TalentProfile_Data" , dataProviderClass =ReadXlsx_TalentDashboard_TalentProfile.class , priority=6)
	public void TalentDashboard_TalentProfile(String Search, String Photo , String Name, String Email, String PhoneNumber, String Address,
			String City, String	Pincode, String	LinkedIn_Profile , String Resume) throws InterruptedException, IOException, AWTException {

			JavascriptExecutor js =(JavascriptExecutor)driver;
			Robot r = new Robot();
			Actions a = new Actions(driver);
			
			driver.findElement(By.xpath(prop.getProperty("Talents"))).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath(prop.getProperty("List"))).click();
			
			js.executeScript("window.scroll(0,400)");
			driver.findElement(By.xpath(prop.getProperty("List_Search"))).sendKeys(Search);
			js.executeScript("window.scroll(0,400)");
			Thread.sleep(3000);
			String List_Search_Email = Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\Talent_DashBoard\\List_Search_Email.png");
			
			
			List<WebElement> findElements = driver.findElements(By.xpath("//td"));
			for (WebElement webElement : findElements) {
				System.out.println(webElement.getText());
			}

			Thread.sleep(3000);
			WebElement findElement = driver.findElement(By.xpath("//tbody/tr/td[1]/div/button"));
			findElement.click();
			Thread.sleep(2000);
			
			List<WebElement> findElements2 = driver
					.findElements(By.xpath("//table[@id='team_table']/tbody/tr/td/div/div/a"));
			for (WebElement webElement : findElements2) {
				if (webElement.getText().equalsIgnoreCase("Detail")) {
					webElement.click();
				}
			}

			String parent = driver.getWindowHandle();
			Set<String> windowHandles = driver.getWindowHandles();

			for (String window : windowHandles) {

				if (!window.equals(parent)) {
					driver.switchTo().window(window);
					System.out.println(driver.getTitle());
				}
			}
			
			
			Thread.sleep(1500);
	//		driver.findElement(By.xpath(prop.getProperty("profile"))).click();
			Thread.sleep(1500);
			
				driver.switchTo().frame(0);
				
			String Talent_Previous_Pic = Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\Talent_DashBoard\\Previous_Pic.png");
			Thread.sleep(3500);
			driver.findElement(By.xpath("//label[@for='profilePic']/ancestor::div[@class='filewrap']")).click();
			driver.findElement(By.xpath(prop.getProperty("profile_Picture_link"))).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath(prop.getProperty("profile_Picture"))).sendKeys(Photo);
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);

					
		//********************************* Add Personal Details***********************************
					
			Thread.sleep(1000);
			
			// Talent_Profile_Screenshot
			
			String Talent_Updated_Pic = Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\Talent_DashBoard\\Talent_Updated_Pic.png");
			extent.createTest("Talent Change Profile Picture ")
			.log(Status.INFO, "Talent_Profile_Pic_Changed")
			.addScreenCaptureFromBase64String(Talent_Previous_Pic)
			.addScreenCaptureFromBase64String(Talent_Updated_Pic);
			
			
			driver.findElement(By.xpath(prop.getProperty("personal_Details_Add"))).click();
			Thread.sleep(1000);
			
			Object scroll = js.executeScript("return document.querySelector(\"#app > section > div.profileAccordion.accordionOpen > div.accordionContent.accordionContentOpen > div.contentHeading\")");
			js.executeScript("arguments[0].scrollIntoView(true)", scroll);
			
			Thread.sleep(1000);
			
	//		js.executeScript("window.scroll(0,600)");
			Thread.sleep(1000);
			String Talent_Personal_Details_Before = Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\Talent_DashBoard\\Talent_Personal_Details_Before.png");
			extent.createTest("Talent_Personal_Details_Before_Edit")
			.log(Status.INFO, "Talent_Personal_Details_Before_Edit")
			.addScreenCaptureFromBase64String(Talent_Personal_Details_Before);
			
			
			Object scrolltop = js.executeScript("return document.querySelector(\"#app > section > div.profileHead > div.overview > div.content > div.d-flex.align-items-center.flex-wrap > button\")");
			js.executeScript("arguments[0].scrollIntoView(true)", scrolltop);
			
			Thread.sleep(1000);
			driver.findElement(By.xpath(prop.getProperty("personal_Details_Edit"))).click();
			Thread.sleep(1500);
			
			driver.findElement(By.xpath(prop.getProperty("Name"))).clear();
			Thread.sleep(1000);
			String Talent_Name_Edit = Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\Talent_DashBoard\\Talent_Name_Edit.png");
			Thread.sleep(1500);
			driver.findElement(By.xpath(prop.getProperty("Name"))).sendKeys(Name);
			Thread.sleep(1500);
			String Talent_Name_Changed = Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\Talent_DashBoard\\Talent_Name_Changed.png");
			
			extent.createTest("Talent_Edit_Name")
			.log(Status.INFO, "Talent Name Changed")
			.addScreenCaptureFromBase64String(Talent_Name_Edit)
			.addScreenCaptureFromBase64String(Talent_Name_Changed);
			
			driver.findElement(By.xpath(prop.getProperty("Gender"))).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath(prop.getProperty("Female"))).click();
			Thread.sleep(1000);
			
			String Talent_Gender_Edit = Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\Talent_DashBoard\\Talent_Gender_Edit.png");
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@class='react-select__single-value css-qc6sy-singleValue']")).click();
	//		driver.findElement(By.xpath(prop.getProperty("Gender"))).click();
			driver.findElement(By.xpath(prop.getProperty("Male"))).click();
			Thread.sleep(1500);
			String Talent_Gender_Changed = Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\Talent_DashBoard\\Talent_Gender_Changed.png");
			
			extent.createTest("Talent_Edit_Gender")
			.log(Status.INFO, "Talent Gender Changed ")
			.addScreenCaptureFromBase64String(Talent_Gender_Edit)
			.addScreenCaptureFromBase64String(Talent_Gender_Changed);
		
			js.executeScript("window.scroll(0,800)");
			Thread.sleep(1500);
			driver.findElement(By.xpath(prop.getProperty("DOB"))).click();
			
			Thread.sleep(1500);
			
			String Talent_DOB_Edit = Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\Talent_DashBoard\\Talent_DOB_Edit.png");
			
			
			String StartDate_Year= "May 2002";
		//	String StartDate_Year= DOB;
			String year = StartDate_Year.replaceAll("[^0-9]", "");
			System.out.println(year);
			int years = Integer.parseInt(year);
			while (true) {

				WebElement find = driver.findElement(By.xpath("//div[@class='react-datepicker__current-month']"));
				String text = find.getText();
				System.out.println("text" + text);
				String replaceAll = text.replaceAll("[^0-9]", "");
				
				int num = Integer.parseInt(replaceAll);
				System.out.println("num" + num);
				
				if (find.getText().equals(StartDate_Year)) {

					break;
					//1996>2000
				}  else if(num>=years) {

					driver.findElement(By.xpath("//span[@class='react-datepicker__navigation-icon react-datepicker__navigation-icon--previous']/ancestor::button")).click();

				}else {
					driver.findElement(By.xpath("//span[@class='react-datepicker__navigation-icon react-datepicker__navigation-icon--next']/ancestor::button")).click();
				}
			}

			String actual_Date="14";
			try {
			List<WebElement> dates = driver
					.findElements(By.xpath("//div[@class='react-datepicker__month-container']//child::div[@class='react-datepicker__month']//div/div"));
			for (WebElement date : dates) {
				
					if (date.getText().equals(actual_Date)) {
						System.out.println(date.getText());
						
					date.click();
					Thread.sleep(1000);
					}
			}}
					catch(StaleElementReferenceException e) {
						List<WebElement> dates = driver
								.findElements(By.xpath("//div[@class='react-datepicker__month-container']//child::div[@class='react-datepicker__month']//div/div"));
						for (WebElement date : dates) {
							
								if (date.getText().equals(actual_Date)) {
									System.out.println(date.getText());
									
								Thread.sleep(1000);
								a.click(date).build().perform();
						
						
					}}
			Thread.sleep(1500);
			
			String Talent_DOB_Changed = Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\Talent_DashBoard\\Talent_DOB_Changed.png");
			extent.createTest("Talent_Edit_DOB")
			.log(Status.INFO, "Talent DOB Changed")
			.addScreenCaptureFromBase64String(Talent_DOB_Edit)
			.addScreenCaptureFromBase64String(Talent_DOB_Changed);
		
			Thread.sleep(1000);
			
			driver.findElement(By.xpath(prop.getProperty("Email"))).click();
			Thread.sleep(1500);
			
			driver.findElement(By.xpath(prop.getProperty("phone_Number"))).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath(prop.getProperty("phone_Number"))).clear();

			String Talent_Edit_MobileNumber = Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\Talent_DashBoard\\Talent_Edit_MobileNumber.png");
		
			Thread.sleep(1500);
			
			driver.findElement(By.xpath(prop.getProperty("phone_Number"))).sendKeys(PhoneNumber);
			Thread.sleep(1500);
			
			String Talent_MobileNumber_Changed = Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\Talent_DashBoard\\Talent_MobileNumber_Changed.png");
			extent.createTest("Talent_Edit_MobileNumber")
			.log(Status.INFO, "Talent_MobileNumber Changed")
			.addScreenCaptureFromBase64String(Talent_Edit_MobileNumber)
			.addScreenCaptureFromBase64String(Talent_MobileNumber_Changed);
		
			
			driver.findElement(By.xpath(prop.getProperty("Address"))).click();
			Thread.sleep(1500);
			String Talent_Edit_Address = Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\Talent_DashBoard\\Talent_Edit_Address.png");
			
			
			driver.findElement(By.xpath(prop.getProperty("Address"))).clear();
			Thread.sleep(1500);
			driver.findElement(By.xpath(prop.getProperty("Address"))).sendKeys(Address);
			Thread.sleep(1500);
			
			String Talent_Address_Changed = Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\Talent_DashBoard\\Talent_Address_Changed.png");
			extent.createTest("Talent_Edit_Address")
			.log(Status.INFO, "Talent_Address_Changed")
			.addScreenCaptureFromBase64String(Talent_Edit_Address)
			.addScreenCaptureFromBase64String(Talent_Address_Changed);
		
			driver.findElement(By.xpath(prop.getProperty("City"))).clear();
			Thread.sleep(1500);
			
			String Talent_Edit_City = Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\Talent_DashBoard\\Talent_Edit_City.png");
			
			driver.findElement(By.xpath(prop.getProperty("City"))).sendKeys(City);
			Thread.sleep(1500);
			
			String Talent_City_Changed = Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\Talent_DashBoard\\Talent_City_Changed.png");
			extent.createTest("Talent_Edit_City")
			.log(Status.INFO, "Talent_City_Changed")
			.addScreenCaptureFromBase64String(Talent_Edit_City)
			.addScreenCaptureFromBase64String(Talent_City_Changed);
			
			driver.findElement(By.xpath(prop.getProperty("Pincode"))).clear();
			Thread.sleep(1500);
			
			String Talent_Edit_Pincode = Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\Talent_DashBoard\\Talent_Edit_Pincode.png");
			
			
			driver.findElement(By.xpath(prop.getProperty("Pincode"))).sendKeys(Pincode);
			Thread.sleep(1500);
			
			String Talent_Pincode_Changed = Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\Talent_DashBoard\\Talent_Pincode_Changed.png");
			extent.createTest("Talent_Edit_Pincode")
			.log(Status.INFO, "Talent_Pincode_Changed")
			.addScreenCaptureFromBase64String(Talent_Edit_Pincode)
			.addScreenCaptureFromBase64String(Talent_Pincode_Changed);
			
			driver.findElement(By.xpath(prop.getProperty("Linkedin_Profile_Edit"))).clear();
			Thread.sleep(1500);
			
			String Talent_Edit_Linkedin = Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\Talent_DashBoard\\Talent_Edit_Linkedin.png");
			
			driver.findElement(By.xpath(prop.getProperty("Linkedin_Profile_Edit"))).sendKeys(LinkedIn_Profile);
			Thread.sleep(1500);
			
			String Talent_Linkedin_Changed = Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\Talent_DashBoard\\Talent_Linkedin_Changed.png");
			extent.createTest("Talent_Edit_Linkedin")
			.log(Status.INFO, "Talent_Linkedin_Changed")
			.addScreenCaptureFromBase64String(Talent_Edit_Linkedin)
			.addScreenCaptureFromBase64String(Talent_Linkedin_Changed);
			
			Thread.sleep(1500);
			js.executeScript("window.scroll(0,1000)");
			Thread.sleep(1500);
				
			String Talent_Resume_Replace = Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\Talent_DashBoard\\Talent_Resume_Replace.png");
			
			driver.findElement(By.xpath(prop.getProperty("resume_Replace_Link"))).click();
			
			Thread.sleep(1000);
			
			
		
			Thread.sleep(2000);
			driver.findElement(By.xpath(prop.getProperty("resume_Replace_File"))).sendKeys(Resume);
			Thread.sleep(1500);
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
			r.keyPress(KeyEvent.VK_TAB);
			
			r.keyRelease(KeyEvent.VK_TAB);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);

			
			
			
			Thread.sleep(1500);
			
			System.out.println("Resume : " + Resume);
			WebElement actualResume = driver.findElement(By.xpath("//div[@class='d-flex align-items-center']"));
			System.out.println("ActualResume : " + actualResume.getText());
		
			String actualResume1 = actualResume.getText();
			actualResume1 = actualResume1.replaceAll("[^.A-Za-z]", " ");
			System.out.println("actualResume1 : " +actualResume1);
			System.out.println(actualResume1.contains("Resume-Sample"));
			
			if (actualResume1.contains("Resume-Sample")) {
				String Talent_Resume_Changed = Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\Talent_DashBoard\\Talent_Resume_Changed.png");
				extent.createTest("Talent_Resume_Replace")
				.log(Status.INFO, "Talent_Resume_Changed")
				.addScreenCaptureFromBase64String(Talent_Resume_Replace)
				.addScreenCaptureFromBase64String(Talent_Resume_Changed);
			}else {
				
				String Talent_Resume_Changed = Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\Talent_DashBoard\\Talent_Resume_Changed.png");
				extent.createTest("Talent_Resume_Replace")
				.log(Status.FAIL, "Talent Resume Upload Failed")
				.addScreenCaptureFromBase64String(Talent_Resume_Replace)
				.addScreenCaptureFromBase64String(Talent_Resume_Changed);
				
			}
			
			
					}
			
			
			Thread.sleep(2000);
			driver.findElement(By.xpath(prop.getProperty("personal_Details_Save_Changes"))).click();
			Thread.sleep(2500);
			
	//		Object scroll = js.executeScript("return document.querySelector(\"#app > section > div.profileAccordion.accordionOpen > div.accordionContent.accordionContentOpen > div.contentHeading\")");
			js.executeScript("arguments[0].scrollIntoView(true)", scroll);
			Thread.sleep(1000);

	
			//	driver.findElement(By.xpath(prop.getProperty("personal_Details_Minimize"))).click();
			Thread.sleep(2000);
			String Talent_Personal_Details_Changed = Screenshot("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Screenshot\\Talents\\List\\Talent_DashBoard\\Talent_Personal_Details_Changed.png");
			Thread.sleep(1500);
			extent.createTest("Talent Personal Details Changed")
			.log(Status.PASS, "Personal Details of Talent Changed Successfully")
			.addScreenCaptureFromBase64String(Talent_Personal_Details_Changed);
		
			extent.flush();
			try {
				ScreenRecorderUtil.stopRecord();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
		
	}
	

	

}
