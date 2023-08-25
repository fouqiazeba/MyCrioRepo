package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NestedFrames {
    ChromeDriver driver;

    public NestedFrames(){

        System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }
    
    public void endTest()
    {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }

    public void nested_frames(){
       // Navigate to URL  https://the-internet.herokuapp.com/nested_frames
       driver.get("https://the-internet.herokuapp.com/nested_frames");
//Navigate to URL  https://the-internet.herokuapp.com/nested_frames
//Switch to topParentFrame  driver.switchTo().frame(1) 
driver.switchTo().frame(0);
//Switch to inner Frame by Frame Name  driver.switchTo().frame(frame-left) 
driver.switchTo().frame("frame-left");
//declare a WebElement leftEle Using Locator "Tag Name" leftEle | body |  WebElement leftEle = driver.findElement(By.tagName("body"));
 WebElement leftEle = driver.findElement(By.tagName("body"));
String textleft=leftEle.getText();
System.out.println(" Left frame Text  is "+textleft);
driver.switchTo().parentFrame();

//declare a new variable and  store middleFrame Text   String  middleText= middleEle.getText();
// "give the print command to print the text   System.out.println(middleText);
// "
driver.switchTo().frame("frame-middle");
 WebElement midtEle = driver.findElement(By.tagName("body"));
 String textmid=midtEle.getText();
 System.out.println(" Middle frame Text  is "+textmid);
driver.switchTo().parentFrame();


// switch to parent frame   
driver.switchTo().frame("frame-right");
WebElement rtEle = driver.findElement(By.tagName("body"));
String txtrt=rtEle.getText();
 System.out.println(" Right frame Text  is "+txtrt);
 //driver.switchTo().parentFrame();
 driver.switchTo().defaultContent();
driver.switchTo().frame("frame-bottom");

WebElement bottElement = driver.findElement(By.tagName("body"));
String txbot=bottElement.getText();
System.out.println("Bottom frame Text  is "+txbot);

// Switch to inner Frame by Frame Name Using Locator "Name" driver.switchTo().frame(frame-right) 
// declare a WebElement rightEle Using Locator "Tag Name" rightEle | body |  WebElement rightEle = driver.findElement(By.tagName("body")
// declare a new variable and  store rightFrame Text   String  rightText= rightEle.getText();
// "give the print command to print the text   System.out.println(rightText);
// "
//  switch to the deafault frame    driver.switchTo().defaultContent();
// switch to bottom frame  driver.switchTo().frame(2);
// declare a WebElement bottomEle Using Locator "Tag Name" bottomEle | body |  WebElement bottomEle = driver.findElement(By.tagName("body")
    }
}
