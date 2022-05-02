package selenium.Ecorrea;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class VuelosFalabella {
    public static WebDriver driver;
    public By LocalizadorDeIngresoOrigen = By.xpath("//input[contains(@class, \"sbox-bind-reference-flight-roundtrip-origin-input\" )]");
    public By LocalizadorDeIngresoDestino = By.xpath("//input[contains(@class, \"sbox-bind-reference-flight-roundtrip-destination-input\" )]");
    public By LocalizadorDeFechaOrigen = By.xpath("//div[@class=\"input-container sbox-bind-event-click-start-date\"]");
    public By LocalizadorDeDiaOrigen = By.xpath("/html/body/div[4]/div/div[5]/div[1]/div[4]/span[28]/span[1]");
    public By LocalizadorDeFechaRegreso = By.xpath("//div[@class=\"input-container sbox-bind-event-click-end-date\"]");
    public By LocalizadorDeBtnBuscar = By.xpath("//em[@class =\"btn-text\"]");

    @BeforeClass
    public static void init(){WebDriverManager.chromedriver().setup();}
    @Before
    public void setUp(){
        //preparacion de Driver = Manager
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

    }
    @Test
    public void BusquedaDeVueloIdayRegreso() throws InterruptedException {
        driver.get("https://www.viajesfalabella.cl/vuelos/");
        //ingreso de origen
        WebElement ingresoDeOrigen = driver.findElement(LocalizadorDeIngresoOrigen);
        ingresoDeOrigen.sendKeys("SCL");
        ingresoDeOrigen.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        //ingreso de destino
        WebElement ingresoDeDestino = driver.findElement(LocalizadorDeIngresoDestino);
        ingresoDeDestino.sendKeys("BSB");
        ingresoDeDestino.sendKeys(Keys.ENTER);
        //ingreso de fecha de origen

        //ingreso de fecha de llegada



    }



    @After
    public void close(){

        if(driver != null){
            driver.close();
        }



    }
}
