package org.examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PagamentoParceladoTest {

    @Test
    void deveAplicarAcrescimoDe10PorCento() {
        IFormaPagamento forma = new PagamentoParcelado();

        assertEquals(110, forma.calcular(100), 0.001);
    }
}
