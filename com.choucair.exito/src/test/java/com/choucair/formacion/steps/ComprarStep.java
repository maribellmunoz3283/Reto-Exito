package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.ComprarPage;
import net.thucydides.core.annotations.Step;


public class ComprarStep {

    ComprarPage comprarPage;

@Step

    public void abrir() {

        comprarPage.open();

    }

    public void buscar() {
        comprarPage.buscarTelevisor();

    }

    public void lista() throws InterruptedException {

        comprarPage.recorrerLista();


    }

    public void validarCarrito() {

        comprarPage.validarCompra();
    }




}
