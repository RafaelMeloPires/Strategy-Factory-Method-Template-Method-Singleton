package org.examples;

public class PagamentoAVista implements IFormaPagamento {

    @Override
    public double calcular(double valor) {
        return valor * 0.9;
    }
}
