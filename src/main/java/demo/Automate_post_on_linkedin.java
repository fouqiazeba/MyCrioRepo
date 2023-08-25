package demo;

//import java.time.Duration;
//import java.time.Duration;
//import java.util.List;
import java.util.concurrent.TimeUnit;
//import java.util.function.Function;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.slf4j.helpers.SubstituteLoggerFactory;
//import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automate_post_on_linkedin {
  //System.setProperty("webdriver.chrome.driver","C:\Users\hp\chrome\chrome-win64");

 // private static final long DurationOfSe = 0;
  ChromeDriver driver;

public Automate_post_on_linkedin(){
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
    public void createPost() throws InterruptedException{


        
//navigate to url    url | https://in.linkedin.com/ 
//driver.get("https://www.linkedin.com/");
driver.get("https://www.linkedin.com");
//enter username or Email  Using Locator "XPath" userName | //input[@id='session_key'] | "fouqiazebakhan@gmail.com"
WebElement email=driver.findElement(By.xpath("//input[@id='session_key']"));
email.clear();
email.sendKeys("mkmhan@outlook.com");
//enter password Using Locator "XPath" password | //input[@id='session_password'] | "*******"
WebElement password=driver.findElement(By.xpath("//input[@id='session_password']"));
password.clear();
//click on login Using Locator "XPath" password | //input[@id='session_password'] | "*******"
password.sendKeys("outlook@2000");
  //click on signin 
  WebElement signin=driver.findElement(By.xpath("//button[contains(text(),'Sign ')]"));
  signin.click();
  Thread.sleep(3000);
System.out.println("All ok till homepage ...... ");

// //click on name of user  Using Locator "XPath" name | //div[text()='fouqia zeba']
 WebElement user=driver.findElement(By.xpath("//div[@class='t-16 t-black t-bold']"));
 user.click();
 Thread.sleep(2000);

//  boolean b=user.isDisplayed();
//  System.out.println(b);
//   user.click();
//   Thread.sleep(2000);
//   ///3///3////3

// //find element profileviews  Using Locator "XPath" profileviews | //*[@id="ember493"]/div[3]/ul/li[1]/div/div[2]/div/a/div/div/div/div/span[1]
// WebElement profileviews=driver.findElement(By.xpath("(//div[starts-with(@id,'ember')])[8]"));
// //get text of profileviews  profileviews.getText()
//   profileviews.getText();
// //find searchAppearences and get text  Using Locator "XPath" searchAppearence | //*[@id="ember604"]/div[3]/ul/li[3]/div/div[2]/div/a/div/div/div/div/span[1]
// WebElement searchAppearences=driver.findElement(By.xpath("(//div[starts-with(@id,'ember')])[9]"));
//   searchAppearences.getText();
  ///3////3////3
      

   WebElement  views1=driver.findElement(By.xpath("//span[contains(text(),' profile view')][1]"));
    System.out.println(views1.getText());

     WebElement  views2=driver.findElement(By.xpath("//span[contains(text(),'post impressions')][2]"));
    System.out.println( views2.getText());
    // for (WebElement webElement : views) {
      
    //    System.out.println(webElement.getText());
    // }
    //System.out.println("views message printed ......");
    Thread.sleep(5000);
  //find home icon and click
  // driver.findElement(By.xpath("//span[text()='Home']")).click();
  // System.out.println("home icon clicked");  
//find start post text area and enter a value Using Locator "XPath" startAPost | //span[text()='Start a post']
////comment 

WebElement HomeIcon=driver.findElement(By.xpath("(//a[@target='_self'])[1]"));
HomeIcon.click();

System.out.println("home icon clicked");
WebElement startaPost=driver.findElement(By.xpath("//span[text()='Start a post']"));
startaPost.click();
//System.out.println("start a post btn  clicked");
Thread.sleep(2000);
 WebElement writehere=driver.findElement(By.xpath("//p/br"));
  writehere.sendKeys("I never lose. I either win or learn. - Nelson Mandela");
  Thread.sleep(2000);
//   WebElement photo=driver.findElement(By.xpath("//button[@aria-label='Add media']//span[@class='share-promoted-detour-button__icon-container']"));
//  //
//  //WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(3));
//  //wait.until(ExpectedConditions(elementToBeClicksble(photo)));
//  photo.click();
//  //Thread.sleep(1000);
//  String path="C:\\Users\\hp\\OneDrive\\Pictures\\chicken pickle.jpg";
//use robot class here 
//   photo.sendKeys(path+Keys.ENTER);
//   Thread.sleep(1000);
//   System.out.println("path added .........");
//   Thread.sleep(3000);
//     WebElement nextbtn=driver.findElement(By.xpath("//span[text()='Next']"));
//     nextbtn.click();
//  System.out.println("upload photo done ..........");

  //click on post button  Using Locator "XPath" post | //span[text()='Post']

  WebElement post=driver.findElement(By.xpath("//span[text()='Post']"));
  post.click();
//find message post successful and verify it is displayed or not  Using Locator "XPath" post | //*[text()='Post successful.']
WebElement post_success=driver.findElement(By.xpath("//*[text()='Post successful.']"));
boolean status=post_success.isDisplayed();
System.out.println("post success ?: "+ status );

}
   
}
