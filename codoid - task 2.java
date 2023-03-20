codoid - task

//Read data from Excel and given that data as input for login and password and click or ?

package org.codoid;

import java.io.FileInputStream;

import org.day3.Cell;
import org.day3.In;
import org.day3.Row;
import org.day3.XSSFSheet;
import org.day3.XSSFWorkbook;
import org.day3.and;
import org.day3.based;
import org.day3.the;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelSheet {
	public static void main(String[] args) {
		FileInputStream fs = new FileInputStream("D:\\DemoFile.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheetAt(0);
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		System.out.println(sheet.getRow(0).getCell(0));
		Row row1 = sheet.getRow(1);
		Cell cell1 = row1.getCell(1);
		System.out.println(sheet.getRow(0).getCell(1));
		Row row2 = sheet.getRow(1);
		Cell cell2 = row2.getCell(1);
		System.out.println(sheet.getRow(1).getCell(0));
		Row row3 = sheet.getRow(1);
		Cell cell3 = row3.getCell(1);
		System.out.println(sheet.getRow(1).getCell(1));
		
		
		
	}

}

   //Write code for handling multiple browsers and switch to new windows?
   
   package org.codoid;

import org.day3.InterruptedException;
import org.day3.Set;
import org.day3.String;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindows {
	public static void main(String[] args)throws InterruptedException
	{
		System.setProperty("webdriver.chromedriver","C:\\Users\\Dell Latitude 7390\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("Parent window's handle -> " + parentWindowHandle);
		WebElement clickElement = driver.findElement(By.id("button1"));
		 
		for(int i = 0; i < 3; i++)
		{
		clickElement.click();
		Thread.sleep(3000);
		}
		 
		Set<String> allWindowHandles = driver.getWindowHandles();
		 
		for(String handle : allWindowHandles)
		{
		System.out.println("Window handle - > " + handle);
		}
	}

}
      
    //How to shift between tabs of the same browser using selenium?

    package org.codoid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tabs {
	public static <String, Object> void main(String[] args) {
		ystem.setProperty("webdriver.chromedriver","C:\\Users\\Dell Latitude 7390\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.g("https://business.twitter.com/start-advertising");
		
		 ArrayList<String> newTab = new ArrayList<String>(driver.getWindowsHandle());
		    Object oldTab;
			newTab.remove(oldTab);
		    
		    driver.switchTo().window(newTab.get(0));
		    assertAdvertisingBlog();

		    
		    driver.close();
		   
		    driver.switchTo().window(oldTab);
		    assertStartAdvertising();

		   
		}

		private static void assertStartAdvertising() {
		    assertEquals("Start Advertising | Twitter for Business", driver.getTitle());
		}

		private static void assertAdvertisingBlog() {
		    assertEquals("Twitter Advertising", driver.getTitle());
		}
	}

}
      // How to perform upload files using selenium ?

      package org.codoid;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver","C:\\Users\\Dell Latitude 7390\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		   driver.get("https://www.monsterindia.com/seeker/registration"); 
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		   JavascriptExecutor js = (JavascriptExecutor)driver; 
		   js.executeScript("window.scrollBy(0,380)");
		   Thread.sleep(3000);
		 
		   
		 
		   WebElement browse = driver.findElement(By.xpath("//input[@id='file-upload']"));
		   
		   browse.sendKeys("C:\\Users\\Chait\\Desktop\\Files\\Job Specification.txt");
		   System.out.println("File is Uploaded Successfully");
		 
	}

}
   

