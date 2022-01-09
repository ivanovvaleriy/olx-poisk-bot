package utils;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;


public class BrowserManager {
    public static WebDriver browser;



    public static void openBrowser() {

        System.setProperty("webdriver.chrome.driver","/chromedriver");
        WebDriver browser= new ChromeDriver();

        ChromeOptions options=new ChromeOptions();
        options.setBinary("/app/.apt/opt/google/chrome/chrome");

    }

    public static void closeBrowser() {
        browser.quit();
    }

    public static void switchWindowHandle() {
        String winHandleBefore = browser.getWindowHandle();
        for (String winHandle : browser.getWindowHandles())   // Switch to new window opened.

            browser.switchTo().window(winHandle);


    }

    public static void switchWindowBefore() {
        String winHandleBefore = browser.getWindowHandle();




        browser.switchTo().window(winHandleBefore);          // move to previously opened window.

    }

    public static void switchWindowFirst (){
        ArrayList tabs2 = new ArrayList (browser.getWindowHandles());//Получение списка табов

        browser.switchTo().window ((String) tabs2.get(0));//Переключение на первый таб в браузере

    }
//browser.close();//Закрытие активного таба

}
