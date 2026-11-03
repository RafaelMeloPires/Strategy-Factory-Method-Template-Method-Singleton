package org.examples;

public class Cliente {

    private IContrato contrato;
    private IProcuracao procuracao;

    public Cliente(String tipo) {
        IFabricaAbstrata fabrica = FactoryMethod.getInstance().obterFabrica(tipo);
        this.contrato = fabrica.criarContrato();
        this.procuracao = fabrica.criarProcuracao();
    }

    public IContrato getContrato() {
        return contrato;
    }

    public IProcuracao getProcuracao() {
        return procuracao;
    }
}