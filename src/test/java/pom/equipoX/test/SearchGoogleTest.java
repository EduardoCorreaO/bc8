package pom.equipoX.test;

import org.junit.Test;
import pom.equipoX.base.earaya.page.base.JunitBaseTest;
import pom.equipoX.base.earaya.page.GoogleHomePage;

public class SearchGoogleTest extends JunitBaseTest {

    GoogleHomePage googleHomePage;

    @Test
    public void busquedaGoogle(){
        googleHomePage = new GoogleHomePage(driver);
        googleHomePage.irAHomePage();
        googleHomePage.buscarTexto("TSOFT");
    }
}
