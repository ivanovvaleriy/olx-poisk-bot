package utils;


import pages.ChallangeTenPage;

import static org.openqa.selenium.support.PageFactory.initElements;
import static utils.BrowserManager.browser;

public class Navigator {


    public static ChallangeTenPage openChallengeTenPage() {
        //System.setProperty("webdriver.chrome.driver", "L:/Projects/chromedriver.exe");
       // browser =

        browser.navigate().to("https://www.olx.ua");
        return initElements(browser, ChallangeTenPage.class);

    }

}
