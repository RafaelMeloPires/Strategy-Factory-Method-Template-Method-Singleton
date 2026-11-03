package org.examples;

public abstract class ContratoAbstrato implements IContrato {

    // Template Method: o esqueleto é fixo, as subclasses só informam o tipo
    @Override
    public final String emitir() {
        return "Contrato " + getTipo() + " emitido";
    }

    protected abstract String getTipo();

    // Strategy: o cálculo depende da forma de pagamento recebida
    @Override
    public double calcularValor(double valor, IFormaPagamento forma) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor deve ser maior que zero");
        }
        if (forma == null) {
            throw new IllegalArgumentException("Forma de pagamento inválida");
        }
        return forma.calcular(valor);
    }
}
