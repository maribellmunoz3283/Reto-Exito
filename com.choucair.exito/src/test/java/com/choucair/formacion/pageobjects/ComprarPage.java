package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.regex.Pattern;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;


@DefaultUrl("https://www.exito.com/")

public class ComprarPage extends PageObject {


    @FindBy(id = "downshift-0-input")
    WebElementFacade CAMPO;

    @FindBy(xpath = "//label[@for='zlg']")
    WebElementFacade MARCA;

    @FindBy(xpath = "//label[contains(.,'Uhd-4K')]")
    WebElementFacade RESOLUCION;

    @FindBy(xpath = "//label[@for='z49-pulgadas']")
    WebElementFacade TAMANO;

    @FindBy(xpath = "(//div[@class='vtex-search-result-3-x-galleryItem pa4'])[1]")
    WebElementFacade ELEGIR_TELEVISOR;

    @FindBy(xpath = "//span[contains(.,'Televisor LG 49 pulgadas UM7300 UHD 4K Smart TV - LG')]")
    WebElementFacade TEXTCARRITO;



    public void buscarTelevisor() {

        CAMPO.click();
        CAMPO.typeAndEnter("Televisor");
        MARCA.click();
        waitFor(6).second();
        RESOLUCION.click();
        waitFor(6).second();
        TAMANO.click();
        waitFor(10).second();
        ELEGIR_TELEVISOR.click();

    }

   public void recorrerLista() throws InterruptedException {

        List<WebElement> divs = getDriver().findElements(By.cssSelector("(//div[@class='vtex-search-result-3-x-galleryItem pa4'])"));
        // int count = divs.size();
       // System.out.println(count);
         System.out.println(divs.size()); //para mostrar tamaño

    }

    public void validarCompra() {

        String carrito = TEXTCARRITO.getText();
        assertThat(carrito,containsString("Televisor LG 49 pulgadas UM7300 UHD 4K Smart TV - LG"));

        }

    }













