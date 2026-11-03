package org.examples;

public class PagamentoParcelado implements IFormaPagamento {

    @Override
    public double calcular(double valor) {
        return valor * 1.1;
    }
}
