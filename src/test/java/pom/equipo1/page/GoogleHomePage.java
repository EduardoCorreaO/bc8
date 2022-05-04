package pom.equipo1.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pom.equipoX.base.earaya.page.base.SeleniumBasePage;

public class GoogleHomePage extends SeleniumBasePage{

    public GoogleHomePage(WebDriver driver) {
        super(driver);
    }

    //identificar locators (page object model) o webElements (PageFactory Model)
    String url = "https://www.google.com";
    By barraGoogle = By.xpath("//*[@name='q']");
    By btnGoogle = By.xpath("//*[@name='btnK']");
    public static WebDriver driver;
   By localizadorOrigin = By.xpath("//input[contains(@class, \"sbox-bind-reference-flight-roundtrip-origin-input\" )]");
     By localizadorDestination= By.xpath("//input[contains(@class, \"sbox-bind-reference-flight-roundtrip-destination-input\" )]");
     By localizadorOriginM1 = By.xpath("//input[contains(@class, \"sbox-bind-reference-flight-segment-1-origin-input\" )]");
     By localizadorDestinationM1= By.xpath("//input[contains(@class, \"sbox-bind-reference-flight-segment-1-destination-input\" )]");
     By localizadorDestinationM2= By.xpath("//input[contains(@class, \"sbox-bind-reference-flight-segment-2-destination-input\" )]");
     By localizadorDateStart = By.xpath("//input[contains(@class, \"sbox-bind-reference-flight-start-date-input\" )]");
     By localizadorDateStartM1 = By.xpath("//input[contains(@class, \"sbox-bind-reference-flight-segment-1-start-date-input\" )]");
     By localizadorDateStartM2 = By.xpath("//input[contains(@class, \"sbox-bind-reference-flight-segment-2-start-date-input\" )]");
     By localizadorAutocomplete = By.xpath("//li[@class=\"item -active\"]");
     By localizadorAutocomplete2 = By.xpath("(//li[@class=\"item\"])[5]");
     By localizadorBtnNextDate = By.xpath("//div[@class = \"_dpmg2--controls-next\"]/descendant::i");
     By localizadorBtnNextDate2 = By.xpath("(//div[@class = \"_dpmg2--controls-next\"]/descendant::i)[3]");
     By localizadorBtnNextDateM1 = By.xpath("(//div[@class = \"_dpmg2--controls-next\"]/descendant::i)[2]");
     By localizadorBtnNextDateM2 = By.xpath("(//div[@class = \"_dpmg2--controls-next\"]/descendant::i)[1]");
     By localizadorMonthActive = By.xpath("//div[contains(@class, \"_dpmg2--month-active\")]");
     By localizadorMonthActive2 = By.xpath("(//div[contains(@class, \"_dpmg2--month-active\")])[3]");
     By localizadorBtnAplicarDate = By.xpath("//button[@class=\"_dpmg2--desktopFooter-button _dpmg2--desktopFooter-button-apply sbox-3-btn -lg -primary\"]");
     By localizadorBtnAplicarDate2 = By.xpath("(//button[@class=\"_dpmg2--desktopFooter-button _dpmg2--desktopFooter-button-apply sbox-3-btn -lg -primary\"])[2]");
     By localizadorBtnAplicarDateM = By.xpath("(//button[@class=\"_dpmg2--desktopFooter-button _dpmg2--desktopFooter-button-apply sbox-3-btn -lg -primary\"])[1]");
     By localizadorPasajeros = By.xpath("(//div[contains(@class, \"sbox-passengers-container\")])[1]");
     By localizadorPasajerosM = By.xpath("(//div[contains(@class, \"sbox-passengers-container\")])[2]");
     By localizadorAumentarAdultos = By.xpath("(//a[@class = \"steppers-icon-right sbox-3-icon-plus\"])[11]");
     By localizadorAumentarNinos = By.xpath("(//a[@class = \"steppers-icon-right sbox-3-icon-plus\"])[12]");
     By localizadorBtnAplicarPasajeros = By.xpath("(//a[text() =\"Aplicar\"])[3]");
     By localizadorBtnBuscar = By.xpath("(//div [@class = \"sbox-button-container\"] )[1]");
     By localizadorBtnBuscarM = By.xpath("(//div [@class = \"sbox-button-container\"] )[2]");
     By localizadorBtnCookie = By.xpath("//a[@class=\"lgpd-banner--button eva-3-btn -white -md\"]");
     By localizadorVolverAPaginaAnterior = By.xpath("//a[@class=\"breadcrumb-text eva-3-link\"]");
     By localizadorClase = By.xpath("(//select[@class=\"select-tag\"])[43]");
     By localizadorEquipajeMano = By.xpath("(//i[@class=\"checkbox-check eva-3-icon-checkmark filters-checkbox-left\"])[5]");
     By localizadorEquipajeBodega = By.xpath("(//i[@class=\"checkbox-check eva-3-icon-checkmark filters-checkbox-left\"])[7]");
     By localizadorUsd = By.xpath("(//i[@class=\"radio-circle\"])[2]");
     By localizadorComprarPrimero = By.xpath("(//em[text() =\"Comprar\"])[1]");
     By localizadorMetodosPago = By.xpath("//div[@class=\"eva-3-card -eva-3-shadow-line frame payment-method\"]/descendant::span[@class=\"payment-method-aligned\"]");
     By localizadorNoVuelos = By.xpath("//h3[@class=\"eva-3-h3 title-description empty-state-message-title-secondary\"]");
     By localizadorCheckNoDate = By.xpath("//input[@class=\"checkbox-tag sbox-bind-checked-no-specified-date\"]");
     By localizadorMultidestino = By.xpath("(//i[@class=\"radio-circle sbox-radio-circle\"])[3]");
     By localizadorAlianzas = By.xpath("//filter-group[@id=\"filter-alliances\"]");
     By localizadorOneWorld = By.xpath("(//i[@class=\"checkbox-check eva-3-icon-checkmark filters-checkbox-left\"])[23]");
     By localizadorDosEscalas = By.xpath("(//i[@class=\"checkbox-check eva-3-icon-checkmark filters-checkbox-left\"])[4]");

    //funciones o acciones que podemos hacer en la web -> buscar en barra google
    public void irAHomePage(){
        goToUrl(url);
    }
    public void buscarTexto(String texto){
        type(texto,barraGoogle);
        click(btnGoogle);
    }

}
