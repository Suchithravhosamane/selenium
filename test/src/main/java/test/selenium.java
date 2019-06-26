package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait; 
public class selenium {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
		WebDriver driver=new ChromeDriver();
		//opening devtest
		driver.get("https://devtest2.nirmata.io/security/");
		//maximize the window 
		driver.manage().window().maximize();
		//Login 
		driver.findElement(By.name("email")).sendKeys("suchitra@neualto.com");
		driver.findElement(By.id("btnLogin")).click();
		//Thread.sleep(500);
		//implicit wait 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("password")).sendKeys("Suchi@1995");
		driver.findElement(By.id("btnLogin")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/a[1]")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//creating cluster
		driver.findElement(By.xpath("//button[@id='addCluster']")).click();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//*[@id=\"k8sClusterManageType\"]/div/div[2]/div[3]")).click();
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//div[@id='k8sManagedGkeuserCluster']//div//div[@id='wizard-form']//div//input[@id='name']")).sendKeys("testgke");
		//driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		//selecting cloud provider
		//Thread.sleep(2000);
		/*
		 * WebElement testdropdown=driver.findElement(By.id("cloudProviderRef")); Select
		 * cloudprovider = new Select(testdropdown);
		 * cloudprovider.selectByVisibleText("velero-gcp");
		 * driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 */
		//Thread.sleep(1000);
		
		
		//select Role
		//WebDriverWait wait = new WebDriverWait(driver, 40);
			//WebElement role = driver.findElement(By.xpath("//select[@id=\"cloudProviderRef\"]")); 
		//driver.findElement(By.cssSelector(".select2-selection__rendered")); 
				//JavascriptExecutor js = (JavascriptExecutor) driver;
				//js.executeScript("document.getElementById('srlSelect').style.display='block'");
				
				
		        //System.out.println("selectnetrole==============>"+role);
		        //Select selectnetrole = new Select(role);
		       
		        //wait.until(
		        	//    ExpectedConditions
		        	  //      .presenceOfNestedElementsLocatedBy(By.xpath("//select[@id=\"cloudProviderRef\"]"), By.tagName("option"))
		        	//);
		        //wait.until(
		        	//    ExpectedConditions
		        	  //      .elementToBeClickable(By.xpath("//select[@id=\"cloudProviderRef\"]"))
		        	//);
		       
		    	//System.out.println("selectnetrole==============>"+selectnetrole.getOptions().get(0).getText());
		    	//role.click();
		    	//Thread.sleep(10000);
		    	//List<WebElement> dropdown5 = selectnetrole.getOptions();
				//System.out.println("selectnetrole size==============>"+dropdown5.size());
				
			 
				//for(int i=0;i<dropdown5.size();i++) {
					//System.out.println("selectnetrole list==============>"+dropdown5.get(i).getAttribute("value"));
				//}
		
				//selectnetrole.selectByIndex(2);
				  
				
				/*
		 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 * selectnetrole.selectByIndex(2);
		 * 
		 * driver.findElement(By.
		 * xpath("//button[@class='btn btn-next btn-nirmata btn-default btn-primary']"))
		 * .click();
		 * 
		 */
		




	}
	

}
