package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.util.Collections;
import java.util.List;

public class ChallangeTenPage {

    @FindBy(name = "username")
    public WebElement usernameField;

    @FindBy(id = "headerSearch")
    public static WebElement headerSearch;

    @FindBy(name = "password")
    public WebElement passwordField;

    @FindBy(name = "password")
    public static WebElement password2Field;

    @FindBy(name = "firstname")
    public WebElement firstnameField;

    @FindBy(name = "lastname")
    public WebElement lastnameField;

    @FindBy(xpath = "//a[contains(@class,'css-1bbgabe')]")
    static
    //div/p[contains(@class,'price')]
    //h3/a[contains(@class,'detailsLink')]

    List<WebElement> results;
    //html/body/div[1]/div[4]/section/div[3]/div/div[1]/table/tbody/tr/td/div/table/tbody/tr/td/div/h3/a/strong
    //*[@id="offers_table"]/tbody/tr[2]/td/div/table/tbody/tr[1]/td[2]/div/h3
    //*[@id="body-container"]/div[3]/div/div[1]

    //*[@id="offers_table"]/tbody/tr[2]/td/div/table/tbody/tr[1]/td[2]/div/h3/a//

    //h3/a[contains(@class,'detailsLink')]

    @FindBy(className = "title-cell ")
    public WebElement rowNumber;

    @FindBy(xpath = "//div/p[contains(@class,'price')]")
    static
    List<WebElement> price;
    //div/p[contains(@class,'price')]
    //*[@id="offers_table"]/tbody/tr[2]/td/div/table/tbody/tr[1]/td[3]/div/p
    @FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/table/tbody/tr[2]/th[4]")
    public WebElement FirstNameValue;

    @FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/table/tbody/tr[2]/th[5]")
    public WebElement LastNameValue;

@FindBy(xpath = "/html/body/table/tbody/tr/th/h1")
    public WebElement loginValue;

    @FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/form/input[5]")
    public WebElement submitButton;

    @FindBy(xpath = "/html/body/div/div[2]/form/button")
    public static WebElement submit2Button;


@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[1]/p[6]/a")
    public WebElement NextPagelink;

    /*public ChallangeTenPage(String charSequence) throws InterruptedException {
        headerSearch.sendKeys(charSequence);
        headerSearch.sendKeys(Keys.ENTER);
        Thread.sleep(1000);
    }*/


    public static void searchFor(String BackMessage) throws InterruptedException {

        headerSearch.sendKeys(BackMessage);
    //headerSearch.sendKeys(new CharSequence[]{});
    headerSearch.sendKeys(Keys.ENTER);
    Thread.sleep(1000);



}



/*
public static void getAllResoults(){
for (int rowNumber=0; rowNumber < results.size();rowNumber++)

    System.out.println(results.get(rowNumber).getText() + " стоимость " + price.get(rowNumber).getText() + " " +
            "ссылка "
            + results.get(rowNumber).getAttribute("href") + "\n"
    );
        System.out.println("* *");

}*/
public static List<String>  mess;
   // public static String mess;

    public static List<String> getStAllResoults(){

        for (int rowNumber=0; rowNumber < results.size();rowNumber++) {
            mess =
                    Collections.singletonList(results.get(rowNumber).getText() +
                          //  price.get(rowNumber).getText() +
                            results.get(rowNumber).getAttribute("href") + "* *");



        }

        //System.out.println();
        return mess;
    }

/*
        for (int rowNumber=0; rowNumber < results.size();rowNumber++) {
            mess =
            results.get(rowNumber).getText() +
            price.get(rowNumber).getText() +
            results.get(rowNumber).getAttribute("href")+ "* *";

        }
        System.out.println();


        return mess;
    }*/



    /*public static void Str2 (String[] args) {

        getAllResoults();
    }*/

    public ChallangeTenPage NextPagelink() throws InterruptedException {
        NextPagelink.click();
        Thread.sleep(1000);


        return this;
    }


    public static List<String> getMess(){
return mess;
    }


    /* public static String getMess(){
return mess;
    }*/

    public static void EnterPasswordFieldValue(String value) throws InterruptedException {
        password2Field.sendKeys(value);
        submit2Button.click();
        Thread.sleep(1000);


    }



}
