package utils;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;


public class BrowserManager {
    public static WebDriver browser;



    public static void openBrowser() {


        System.setProperty("GOOGLE_CHROME_BIN", "/app/.apt/usr/bin/google-chrome");
        System.setProperty("CHROMEDRIVER_PATH", "/app/.chromedriver/bin/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.setBinary("/app/.apt/usr/bin/google-chrome");
        options.addArguments("--enable-javascript");
        options.addArguments("--headless");
        options.addArguments("--disable-gpu");
        options.addArguments("--no-sandbox");
         browser = new ChromeDriver(options);
         //WebDriver browser = new ChromeDriver(options);

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
