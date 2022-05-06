package automationcraft.testcreation.farmacia.pages;

import automationcraft.engine.selenium.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOutPage extends SeleniumBase {

    public CheckOutPage(WebDriver driver) {super(driver);}
    By aumentoDeProductos = By.id("cart-3415746-qty");
    By actualizarLaCompra = By.xpath("(//button[@type=\"submit\"])[2]");
    By btnMensajePupUp  = By.xpath("//button[@class=\"action-primary action-accept\"]");
    By mensajeDeExedido = By.id("modal-content-24");
    By mensajeDeCarrito2 = By.xpath("//div[@class='toast-message']");
    By mensajeDeReceta = By.xpath("//div[@class=\"message message-warning warning\"]");
    By ingresoNumeroCMR = By.xpath("(//input[@type=\"text\"])[19]");
    By numeroInvalido = By.id("cupon-cmr-invalido");

    public String validarMensajeIngresoProductoEnCarritoDos() {
        exwait(mensajeDeCarrito2);
        if (isDisplayed(mensajeDeCarrito2)) {
            return getText(mensajeDeCarrito2);
        }
        return "mensaje no valido";
    }

    public void aumentarProducto(){
       click(aumentoDeProductos);

    }

    public void actualizarCompra(){

       click(actualizarLaCompra);

    }

    public String validarMensajePopUp(){

        exwait(mensajeDeExedido);
        if (isDisplayed(mensajeDeExedido)) {
            return getText(mensajeDeExedido);
        }
        return "mensaje no valido";


    }
    public String validarReceta(){

        exwait(mensajeDeReceta);
        if (isDisplayed(mensajeDeReceta)) {
            return getText(mensajeDeReceta);
        }
        return "mensaje no valido";


    }

    public void ingresarNumeroCmr(){







    }
    public String numeroDeCMRInvalido(){

        exwait(numeroInvalido);
        if (isDisplayed(numeroInvalido)) {
            return getText(numeroInvalido);
        }
        return "mensaje no valido";


    }



}
