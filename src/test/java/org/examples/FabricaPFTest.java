package org.examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FabricaPFTest {

    @Test
    void deveCriarContratoPF() {
        IFabricaAbstrata fabrica = FabricaPF.getInstance();

        assertEquals("Contrato PF emitido", fabrica.criarContrato().emitir());
    }

    @Test
    void deveCriarProcuracaoPF() {
        IFabricaAbstrata fabrica = FabricaPF.getInstance();

        assertEquals("Procuração Pessoa Física", fabrica.criarProcuracao().NOME());
    }
}