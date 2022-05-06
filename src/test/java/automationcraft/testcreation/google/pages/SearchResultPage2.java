package automationcraft.testcreation.google.pages;

import automationcraft.engine.selenium.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


    public class SearchResultPage2 extends SeleniumBase {
        public SearchResultPage2(WebDriver driver) {
            super(driver);
        }
        By linkDogs = By.xpath("//h3[@class=\"LC20lb MBeuO DKV0Md\"]");

        public void validarPalabraperro (String palabra ){

            String link = getText(linkDogs);
            Assert.assertEquals("dogs",link.contains(palabra));



        }
    }

