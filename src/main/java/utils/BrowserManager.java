package utils;
from selenium import webdriver
import os


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;


public class BrowserManager {
    public static WebDriver browser;



    public static void openBrowser() {
        chrome_options = webdriver.ChromeOptions()
        chrome_options.binary_location = os.environ.get("GOOGLE_CHROME_BIN")
        chrome_options.add_argument("--headless")
        chrome_options.add_argument("--disable-dev-shm-usage")
        chrome_options.add_argument("--no-sandbox")
        driver = webdriver.Chrome(executable_path=os.environ.get("CHROMEDRIVER_PATH"), chrome_options=chrome_options)


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
