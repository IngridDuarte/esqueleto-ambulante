package com.thoughtworks.aceleradora.controllers;

import org.junit.Test;

import static org.junit.Assert.*;

public class InicioControllerTest {

    @Test
    public void renderiza_pagina_inicio() {
        InicioController inicioController = new InicioController();

        assertEquals("inicio", inicioController.renderizaPaginaInicial());
    }
}