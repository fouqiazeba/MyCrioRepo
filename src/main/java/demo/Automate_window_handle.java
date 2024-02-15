package demo;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.google.common.graph.SuccessorsFunction;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automate_window_handle {

    ChromeDriver driver;

    public Automate_window_handle() {
        System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void endTest() {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }

    public void wnidow_handle() throws IOException {

        // navigate to the url
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open");

        // get currenet window handle and store it in String parenthandle
        String mainWindowHandle = driver.getWindowHandle();
        System.out.println("parent window handle is :" + mainWindowHandle);
        // locate the iframe by id Using Locator "XPath" WebElement iframeResult |
        // //iframe[@id='iframeResult']
        WebElement iframe = driver.findElement(By.id("iframeResult"));
        // switch to the iframe by webElement driver.switchTo().iframe(iframeResult);
        driver.switchTo().frame(iframe);

        // locate the try it button Using Locator "Tag Name" WebElement
        // try_it=driver.findElement(By.tagName("button"));
        // click on try it button try_it.click();
        WebElement try_itBtn = driver.findElement(By.tagName("button"));
        try_itBtn.click();
        // get the windowHandles in the Set
        Set<String> allWindowHandles = driver.getWindowHandles();
        // iterate through the handle
        // if the handle is not equal to parent windowHandle then save as child window
        // and switch to childWindow handle

        Iterator<String> iterator = allWindowHandles.iterator();
        while (iterator.hasNext()) {
            String ChildWindow = iterator.next();

            if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
                driver.switchTo().window(ChildWindow);
                // get the currentURL of the page getCurrentURL();
                // get the title of the page getTitle();
                String currentUrl = driver.getCurrentUrl();
                String currentTitle = driver.getTitle();
                System.out.println("current url of page is : " + currentUrl );
                System.out.println(" Current title of page is : " + currentTitle);
            }

            // screen shot
            // Convert web driver object to TakeScreenshot

            TakesScreenshot scrShot = ((TakesScreenshot) driver);

            // Call getScreenshotAs method to create image file

            File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

            // Move image file to new destination

            File DestFile = new File(
                    "C:\\Users\\hp\\testfolder\\selenium_starter\\src\\main\\java\\demo\\screenShot.png");

            // Copy file at destination

            FileUtils.copyFile(SrcFile, DestFile);

            // take screenshot take screenshot
            // swicth to parentwindow
            driver.switchTo().window(mainWindowHandle);
        }

    }

}