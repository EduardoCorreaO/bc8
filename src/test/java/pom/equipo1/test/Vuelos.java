package pom.equipo1.test;

import org.junit.Test;
import pom.equipo1.base.JunitBaseTest;
import pom.equipo1.pages.BusquedaAlojamientosFalabellaPage;
import pom.equipo1.pages.BusquedaVueloFalabellaPage;

public class Vuelos extends JunitBaseTest {

    BusquedaVueloFalabellaPage busquedaVueloFalabellaPage;

    @Test
    public void VTC1(){
        busquedaVueloFalabellaPage = new BusquedaVueloFalabellaPage(driver);
        busquedaVueloFalabellaPage.irAlojamientosFalabella();
        busquedaVueloFalabellaPage.aceptarCookies();
        busquedaVueloFalabellaPage.ingresarOrigen("scl");
        busquedaVueloFalabellaPage.ingresarDestino("bsb");
        busquedaVueloFalabellaPage.ingresarFechaIda(10, 2022, 5);
        busquedaVueloFalabellaPage.ingresarFechaVuelta(25, 2022, 5, 2022, 5);
        busquedaVueloFalabellaPage.aplicarFecha();
        busquedaVueloFalabellaPage.buscarVuelo();

    }
    @Test
    public void VTC2(){
        busquedaVueloFalabellaPage = new BusquedaVueloFalabellaPage(driver);
        busquedaVueloFalabellaPage.irAlojamientosFalabella();
        busquedaVueloFalabellaPage.aceptarCookies();
        busquedaVueloFalabellaPage.ingresarOrigen("scl");
        busquedaVueloFalabellaPage.ingresarDestino("bsb");
        busquedaVueloFalabellaPage.ingresarFechaIda(10, 2022, 5);
        busquedaVueloFalabellaPage.ingresarFechaVuelta(25, 2022, 5, 2022, 5);
        busquedaVueloFalabellaPage.aplicarFecha();
        busquedaVueloFalabellaPage.localizarCasillaPasajeros();
        busquedaVueloFalabellaPage.localizadorBTNAumentarAdultos();
        busquedaVueloFalabellaPage.localizadorBotonAplicarPasajeros();
        busquedaVueloFalabellaPage.buscarVuelo();
        busquedaVueloFalabellaPage.localizadorBotonComprar();
        busquedaVueloFalabellaPage.localizarVolverAtras();



    }

}
