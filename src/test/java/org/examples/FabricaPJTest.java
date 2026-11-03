package org.examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FabricaPJTest {

    @Test
    void deveCriarContratoPJ() {
        IFabricaAbstrata fabrica = FabricaPJ.getInstance();

        assertEquals("Contrato PJ emitido", fabrica.criarContrato().emitir());
    }

    @Test
    void deveCriarProcuracaoPJ() {
        IFabricaAbstrata fabrica = FabricaPJ.getInstance();

        assertEquals("Procuração Pessoa Jurídica", fabrica.criarProcuracao().NOME());
    }
}