package org.examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProcuracaoPFTest {

    @Test
    void deveRetornarNomeProcuracaoPF() {
        IProcuracao procuracao = new ProcuracaoPF();

        assertEquals("Procuração Pessoa Física", procuracao.NOME());
    }
}