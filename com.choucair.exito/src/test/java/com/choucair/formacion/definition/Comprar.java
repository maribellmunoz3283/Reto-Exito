package com.choucair.formacion.definition;

import com.choucair.formacion.steps.ComprarStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class Comprar {

    @Steps

    ComprarStep comprarStep;


    @Dado("^que maribell quiere comprar un televisor$")
    public void que_maribell_quiere_comprar_un_televisor()  {
        comprarStep.abrir();

    }

    @Cuando("^ella ingresa a la pagina virtual del Exito y selecciona el que mas le gusta$")
    public void ella_ingresa_a_la_pagina_virtual_del_Exito_y_selecciona_el_que_mas_le_gusta() throws InterruptedException{


        comprarStep.buscar();
        comprarStep.lista();

    }

    @Entonces("^realiza la compra para que sea enviado a su casa$")
    public void realiza_la_compra_para_que_sea_enviado_a_su_casa()  {

       comprarStep.validarCarrito();
    }
}
