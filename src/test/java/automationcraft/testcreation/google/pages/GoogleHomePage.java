package automationcraft.testcreation.google.pages;

import automationcraft.engine.selenium.SeleniumBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.sql.Driver;

import static org.junit.Assert.assertTrue;

public class GoogleHomePage extends SeleniumBase {
    public GoogleHomePage(WebDriver driver) {
        super(driver);
    }

    //crearemos funcionalidad

    String URLHOME ="http://www.google.com";
    By searchBox = By.name("q");
    By btnBuscar = By.xpath("(//input[@name=\"btnK\"])[2]");


    public void irAGoogleHome() {
        goToUrl(URLHOME);
    }
    public void botonBuscar(){
        click(btnBuscar);

    }
    public void insertarTextoEnSearchBox(String text){
        type(text,searchBox);

    }

}
