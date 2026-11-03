package org.examples;

public class FabricaPF implements IFabricaAbstrata {

    private static FabricaPF instance = new FabricaPF();

    private FabricaPF() {
    }

    public static FabricaPF getInstance() {
        return instance;
    }

    @Override
    public IContrato criarContrato() {
        return new ContratoPF();
    }

    @Override
    public IProcuracao criarProcuracao() {
        return new ProcuracaoPF();
    }
}