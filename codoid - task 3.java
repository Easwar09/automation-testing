codoid - task
// How to perform download files using seleium ?
 
 package org.codoid;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerformFile {
	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver","C:\\Users\\Dell Latitude 7390\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.monsterindia.com/seeker/registration");
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		 
		   JavascriptExecutor js = (JavascriptExecutor)d;
		   js.executeScript("window.scrollBy(0,380)");		   Thread.sleep(3000);
		 
		  
		 
		   WebElement browse = driver.findElement(By.xpath("//input[@id='file-upload']"));
		   
		   browse.sendKeys("C:\\Users\\Chait\\Desktop\\Files\\Job Specification.txt"); 
		   System.out.println("File is Uploaded Successfully");
		 
	}

}
  
    // How to find more than one web element in selenium ?

    List <WebElement> eleList = driver.findElements(By.xpath(“xpath”));

// To fetch the size of the list

int listSize = eleList.size();

//for loop

for (int i=0; i<listSize; i++)

{

 // Clicking on each link

 links.get(i).click();

 // Navigating back to the previous page that stores the links

 driver.navigate().back();}