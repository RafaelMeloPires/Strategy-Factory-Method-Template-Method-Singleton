package org.examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProcuracaoPJTest {

    @Test
    void deveRetornarNomeProcuracaoPJ() {
        IProcuracao procuracao = new ProcuracaoPJ();

        assertEquals("Procuração Pessoa Jurídica", procuracao.NOME());
    }
}