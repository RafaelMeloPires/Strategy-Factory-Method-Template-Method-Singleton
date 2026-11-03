package org.examples;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContratoPFTest {

    @Test
    void deveEmitirContratoPF() {
        IContrato contrato = new ContratoPF();
        assertEquals("Contrato PF emitido", contrato.emitir());
    }
}