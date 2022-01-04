
import org.testng.annotations.*;
import org.w3c.dom.Text;
import pages.ChallangeTenPage;
import utils.BrowserManager;
import utils.Navigator;

import javax.annotation.CheckReturnValue;

import static org.testng.AssertJUnit.assertEquals;

public class Main {


    @BeforeMethod
    public void before() {
        BrowserManager.openBrowser();
    }

    @Test


    public void getDataFromOlx() throws InterruptedException {

//        Navigator.openChallengeTenPage().searchFor("Text").getAllResoults();


    }


    @AfterMethod
    public void closeBrowser() {
        BrowserManager.closeBrowser();
    }



}


