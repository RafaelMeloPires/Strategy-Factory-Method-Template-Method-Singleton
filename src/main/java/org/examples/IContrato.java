package org.examples;

public interface IContrato {

    String emitir();

    double calcularValor(double valor, IFormaPagamento forma);
}
