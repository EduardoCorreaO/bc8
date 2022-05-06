package automationcraft.testcreation.google.pages;

import automationcraft.engine.selenium.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;



public class SearchResultPage extends SeleniumBase {
    public SearchResultPage(WebDriver driver) {
        super(driver);
    }
    By linkCats = By.xpath("//h3 [@class=\"LC20lb MBeuO DKV0Md\"]");

    public void validarPalabragato (String palabra ){

          String link = getText(linkCats);
        Assert.assertEquals("cats",link.contains(palabra));




    }
}

