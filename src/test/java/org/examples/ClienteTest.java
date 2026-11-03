package org.examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveCriarClientePessoaFisica() {
        Cliente cliente = new Cliente("PF");

        assertEquals("Contrato PF emitido", cliente.getContrato().emitir());
        assertEquals("Procuração Pessoa Física", cliente.getProcuracao().NOME());
    }

    @Test
    void deveCriarClientePessoaJuridica() {
        Cliente cliente = new Cliente("PJ");

        assertEquals("Contrato PJ emitido", cliente.getContrato().emitir());
        assertEquals("Procuração Pessoa Jurídica", cliente.getProcuracao().NOME());
    }
}