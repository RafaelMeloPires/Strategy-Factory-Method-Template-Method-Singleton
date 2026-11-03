package org.examples;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContratoPJTest {

    @Test
    void deveEmitirContratoPJ() {
        IContrato contrato = new ContratoPJ();
        assertEquals("Contrato PJ emitido", contrato.emitir());
    }
}