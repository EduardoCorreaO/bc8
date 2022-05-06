package automationcraft.testcreation.farmacia.pages;

import automationcraft.engine.selenium.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.sql.Driver;

public class CarritoDeComprasPage extends SeleniumBase {
    public CarritoDeComprasPage(WebDriver driver) {super(driver);}
    By btnAgregarAlCarrito = By.xpath("//button[@class=\"action tocart primary \"]");
    By mensajeDeCarrito = By.xpath("//div[@class='toast-message']");
    By contadorProductosEnCarrito = By.xpath("//span[@class=\"counter-number\"]");
    By btnCarrito = By.xpath("//i[@class=\"navbar-tool-icon icon-cart\"]");
    By btnverCarrito = By.id("top-cart-btn-checkout");
    //-----------------------------------------------------------


    public void irAURLFarmacia(String url){

        goToUrl(url);

    }
    public void clickBtnAgregarCarrito(){
        click(btnAgregarAlCarrito);
    }

    public String validarMensajeIngresoProductoEnCarrito() {
        exwait(mensajeDeCarrito);
        if (isDisplayed(mensajeDeCarrito)) {
            return getText(mensajeDeCarrito);
        }
        return "mensaje no valido";
    }
    public void iraCarritoDeCompra() {
        click(btnCarrito);

        click(btnverCarrito);

    }

}
