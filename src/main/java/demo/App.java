/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package demo;

import java.awt.AWTException;
import java.io.IOException;
//import java.net.MalformedURLException;

public class App {
    public void getGreeting() throws InterruptedException, AWTException, IOException {
        // TestCases tests = new TestCases(); // Initialize your test class
        
        // TODO: call your test case functions one after other here
       
        // BookMySHow b = new BookMySHow();
        // b.SearchLinks();
        // b.endTest();
        // tests.testCase01();
        
        // Search_Amazon searchObj = new Search_Amazon();
        // searchObj.searchAmazon();
        // searchObj.endTest();
          
        // OverrideChild ch=new OverrideChild();
        // int b= ch.testmethod();
        // System.out.println(b);

        // Hashmap h=new Hashmap();
        // h.m1();
        // FIZZBUZZ fb= new FIZZBUZZ();
         // FIZZBUZZ.fizzBuzz(20);
        //  System.out.println(  fb.fizzBuzz(20));
       
        // Automate_post_on_linkedin postObj=new Automate_post_on_linkedin();
        // postObj.createPost();
        // postObj.endTest();
        // END Tests

        // tests.endTest(); // End your test by clearning connections and closing
        // // browser

        // NestedFrames nf=new NestedFrames();
        // nf.nested_frames();
        // nf.endTest();


        // Automate_image_urls  imgurl=new Automate_image_urls();
        // imgurl.image_Urls();
        // imgurl.endTest();

        // Automate_imdb_ratings imdbobj=new Automate_imdb_ratings();
        // imdbobj.imdb();
        // imdbobj.endTest();

        // Automate_window_handle winObj= new Automate_window_handle();
        // winObj.wnidow_handle();
        // winObj.endTest();

        // PalindromeString pal=new PalindromeString();
        // String status=pal.isPalindrome("A man, a plan, a canal: Panama");
        // System.out.println(status);

        // PalindromeString pal=new PalindromeString();
        // String result=pal.isPalindrome("sdsa10");
        // System.out.println(result);


        // Hashmap hm= new Hashmap();
        // hm.m1();
         Palindrome palindrome = new Palindrome();
        String ans = palindrome.isPalindrome("1234321");
        System.out.println(ans);
        // palindrome.isPalindrome("madam");
        
        
    }

  

    
    public static void main(String[] args) throws InterruptedException, AWTException, IOException {
        new App().getGreeting();
       
    }
}


