package orange_hrm;
import static org.testng.Assert.assertEquals;
import org.testng.Assert;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import org.openqa.selenium.Point;
import java.io.File;
import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.IOException;
import java.util.Properties;

public class Orange_HRM_keywords {
	private Properties properties;
	public WebDriver driver;
	
	public Orange_HRM_keywords() {
		properties = new Properties();
		try {
			FileInputStream fs =new FileInputStream("config.properties");
			properties.load(fs);
		}
		
		catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load configuration file.");
        }		
	}
	
	
	public void openBrowser() {
		String Browser = properties.getProperty("browser");
		try {
			
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
			String url= properties.getProperty("hrm_url");
			driver.get(url);
			driver.manage().window().maximize();
			System.out.println("Browser open succesfully");
			
		}
		catch (Exception e){
			System.out.println("Error ocurred while opening browser");
		}
		
	}
	public void VerifyTitle(String Title) {
		
	    String Excepted_title =properties.getProperty(Title);
		String Actaul_title = driver.getTitle();
		System.out.println("Excepted title :"+Excepted_title);
		System.out.println("Actaul title :"+Actaul_title);
		Assert.assertEquals(Actaul_title, Excepted_title,"Title does not match with excepted title");
		
	}
	
	public void sendtext(String xpath,String data) {
		try {
		String Element_xpath=properties.getProperty(xpath);
		String Element_data=properties.getProperty(data);
        WebElement element=driver.findElement(By.xpath(Element_xpath));
		
		element.sendKeys(Element_data);
		}
		catch (Exception e){
			System.out.println("enable to find the element "+e.getMessage());
		}
	}
	public void Click_Element(String click) {
		try{
			String Element_click=properties.getProperty(click);
	        WebElement element=driver.findElement(By.xpath(Element_click));
		    element.click();
		}
		catch(Exception e) {
			System.out.println("unable to click the element"+ e.getMessage());
		}
	}
	public void Take_Screenshot(String fileName) {
		try {
            // Create a folder named "screenshots" in the project directory if it doesn't exist
            Path screenshotDir = Paths.get("screenshots");
            if (!Files.exists(screenshotDir)) {
                Files.createDirectories(screenshotDir);
                System.out.println("Created directory: " + screenshotDir.toAbsolutePath());
            }
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            Path destinationPath = screenshotDir.resolve(fileName);
            Files.copy(screenshot.toPath(), destinationPath, StandardCopyOption.REPLACE_EXISTING);

            System.out.println("Screenshot saved to " + destinationPath.toAbsolutePath());
        } catch (Exception e) {
            System.out.println("Failed to take screenshot. Error: " + e.getMessage());
        }
	   
	}
	
	public void Scroll_ToElement(String xpath) {
		try{
			String Element_click=properties.getProperty(xpath);
	        WebElement element=driver.findElement(By.xpath(Element_click));
	       Point loc=element.getLocation();
	       JavascriptExecutor jse = (JavascriptExecutor)driver; 
	       jse.executeScript("window.scrollBy"+loc);
		   
		}
		catch(Exception e) {
			System.out.println("unable to click the element"+ e.getMessage());
		}	
	}
	
	public void data_clear(String xpath) {
		try{
			String Element_clear=properties.getProperty(xpath);
	        WebElement element=driver.findElement(By.xpath(Element_clear));
		    element.clear();
		}
		catch(Exception e) {
			System.out.println("unable to clear the element"+ e.getMessage());
		}
	
	}
	
	public void documents_upload(String xpath,String file_name) {
		try {
			String Element_xpath=properties.getProperty(xpath);
			//String Element_file=properties.getProperty(file_name);
			String projectPath = System.getProperty("user.dir");
			String filePath1 = projectPath + "\\src\\test\\resources\\" + file_name;
			System.out.println(filePath1);
			
			WebElement element_upload =driver.findElement(By.xpath(Element_xpath));
			element_upload.click();
			element_upload.sendKeys(filePath1);
			
			
		}
		catch(Exception e) {
			System.out.println("unable to clear the element"+ e.getMessage());
		}
	}
	
	public void closeBrowser() {
		driver.close();
		
	}
    public static void main(String[] args) throws InterruptedException {
		
    	Orange_HRM_keywords hrm = new Orange_HRM_keywords();
    	hrm.openBrowser();
		hrm.VerifyTitle("Login_Title");
		Thread.sleep(2000);
		hrm.sendtext("username_textbox","Valid_username");
		hrm.sendtext("password_textbox", "Valid_password");
	    hrm.Click_Element("Login_button");
		hrm.VerifyTitle("Login_Title");
		Thread.sleep(2000);
		hrm.Take_Screenshot("home.png");
		Thread.sleep(1000);
		hrm.Click_Element("My_info");
		System.out.println("112233");
		Thread.sleep(1000);
		//hrm.Click_Element("my_info_name_textbox");
		//hrm.Scroll_ToElement("my_info_name_textbox");
		hrm.data_clear("my_info_name_textbox");
		Thread.sleep(5000);
		hrm.data_clear("my_info_name_textbox");
		hrm.sendtext("my_info_name_textbox", "Valid_username"); 
		hrm.Scroll_ToElement("my_add_text");
		hrm.Click_Element("my_add_text");
		System.out.println("scroll");
		hrm.Take_Screenshot("uploadhome.png");
		Thread.sleep(2000);
		hrm.documents_upload("My_upload_doc" , "demo.pdf");

		System.out.println("click add");
	    //hrm.closeBrowser();
	}

}
