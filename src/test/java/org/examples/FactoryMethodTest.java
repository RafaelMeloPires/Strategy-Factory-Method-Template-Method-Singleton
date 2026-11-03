package org.examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactoryMethodTest {

    @Test
    void deveRetornarSempreAMesmaInstancia() {
        assertEquals(FactoryMethod.getInstance(), FactoryMethod.getInstance());
    }

    @Test
    void deveObterFabricaPF() {
        IFabricaAbstrata fabrica = FactoryMethod.getInstance().obterFabrica("PF");

        assertEquals(FabricaPF.class, fabrica.getClass());
    }

    @Test
    void deveObterFabricaPJ() {
        IFabricaAbstrata fabrica = FactoryMethod.getInstance().obterFabrica("PJ");

        assertEquals(FabricaPJ.class, fabrica.getClass());
    }

    @Test
    void deveLancarExcecaoParaFabricaInexistente() {
        String mensagem = null;
        try {
            FactoryMethod.getInstance().obterFabrica("XX");
        } catch (IllegalArgumentException ex) {
            mensagem = ex.getMessage();
        }

        assertEquals("Fabrica inexistente", mensagem);
    }
}