package org.examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PagamentoAVistaTest {

    @Test
    void deveAplicarDescontoDe10PorCento() {
        IFormaPagamento forma = new PagamentoAVista();

        assertEquals(90, forma.calcular(100), 0.001);
    }
}
