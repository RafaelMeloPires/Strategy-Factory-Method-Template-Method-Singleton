package org.examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContratoAbstratoTest {

    // valor <= 0

    @Test
    void deveLancarExcecaoParaValorNegativo() {
        String mensagem = null;
        try {
            new ContratoPF().calcularValor(-1, new PagamentoAVista());
        } catch (IllegalArgumentException ex) {
            mensagem = ex.getMessage();
        }

        assertEquals("Valor deve ser maior que zero", mensagem);
    }

    @Test
    void deveLancarExcecaoParaValorZero() {
        String mensagem = null;
        try {
            new ContratoPF().calcularValor(0, new PagamentoAVista());
        } catch (IllegalArgumentException ex) {
            mensagem = ex.getMessage();
        }

        assertEquals("Valor deve ser maior que zero", mensagem);
    }

    @Test
    void deveAceitarValorPositivo() {
        IContrato contrato = new ContratoPF();

        assertEquals(0.9, contrato.calcularValor(1, new PagamentoAVista()), 0.001);
    }

    // forma == null

    @Test
    void deveLancarExcecaoParaFormaPagamentoNula() {
        String mensagem = null;
        try {
            new ContratoPJ().calcularValor(1000, null);
        } catch (IllegalArgumentException ex) {
            mensagem = ex.getMessage();
        }

        assertEquals("Forma de pagamento inválida", mensagem);
    }

    @Test
    void deveCalcularValorAVista() {
        IContrato contrato = new ContratoPJ();

        assertEquals(900, contrato.calcularValor(1000, new PagamentoAVista()), 0.001);
    }

    @Test
    void deveCalcularValorParcelado() {
        IContrato contrato = new ContratoPJ();

        assertEquals(1100, contrato.calcularValor(1000, new PagamentoParcelado()), 0.001);
    }
}
