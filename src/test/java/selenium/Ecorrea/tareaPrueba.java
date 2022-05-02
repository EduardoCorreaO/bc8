package selenium.Ecorrea;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class tareaPrueba {

    public static WebDriver driver;
    public By introducirShiffondress = By.id("search_query_top");
    public By localizadorBtnBuscar = By.name("submit_search");
    public By mensajeDeError = By.xpath(" //p[@class =\"alert alert-warning\"]");
    public By localizarVestidoChiffonDress = By.xpath("//img[@class =\"replace-2x img-responsive\"]");
    public By localizarResultadoDeBarra = By.xpath("//div[@ class=\\\"ac_results\\\"]");
    public By btnQuikVewBlouse = By.xpath("//a[@class=\"quick-view\"]");
    public By localizadordropdownnn = By.xpath("//select[@name=\"group_1\"]");
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
    public void busquedadeproductoextistente(){
        driver.get("http://automationpractice.com/index.php");
        WebElement IngresoShiffondress = driver.findElement(introducirShiffondress);
        IngresoShiffondress.sendKeys("chiffon dress");
        WebElement btnBuscar = driver.findElement(localizadorBtnBuscar);
        btnBuscar.submit();
        assertEquals("Search - My Store", driver.getTitle());}

    @Test
    public void busquedadeProductoExistente2() throws InterruptedException {
        driver.get("http://automationpractice.com/index.php");
        WebElement IngresoShiffondress = driver.findElement(introducirShiffondress);
        IngresoShiffondress.sendKeys("chiffon dress");
        WebElement btnBuscar = driver.findElement(localizadorBtnBuscar);
        btnBuscar.submit();
        Thread.sleep(2000);
        WebElement vestidoChiffonDress = driver.findElement(localizarVestidoChiffonDress);
        vestidoChiffonDress.click();


    }
    @Test
    public void busquedadeProductoExistente3() throws InterruptedException {
        driver.get("http://automationpractice.com/index.php");
        WebElement IngresoShiffondress = driver.findElement(introducirShiffondress);
        IngresoShiffondress.sendKeys("loquido mata pulgas");
        WebElement btnBuscar = driver.findElement(localizadorBtnBuscar);
        btnBuscar.submit();
        Thread.sleep(2000);
        assertTrue(driver.findElement(mensajeDeError).isDisplayed());

    }
    @Test
    public void busquedaDeBlou()throws InterruptedException {
        driver.get("http://automationpractice.com/index.php");
        WebElement blouBlouse = driver.findElement(introducirShiffondress);
        blouBlouse.sendKeys("blou");
        blouBlouse.click();
        Thread.sleep(3000);
        WebElement resul = driver.findElement(localizarResultadoDeBarra);
        resul.click();



    }
    @Test
    public void Cambiarproducto() throws InterruptedException {
        driver.get("http://automationpractice.com/index.php");
        WebElement IngresoShiffondress = driver.findElement(introducirShiffondress);
        IngresoShiffondress.sendKeys("blo");
        IngresoShiffondress.click();

        WebElement dropdown = driver.findElement(localizadordropdownnn);
        Select manejodropdow = new Select(dropdown);
        manejodropdow.selectByValue("3");

    }



    @After
    public void close(){

        if(driver != null){
            driver.close();
        }



    }

}
