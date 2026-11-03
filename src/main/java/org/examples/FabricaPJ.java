package org.examples;

public class FabricaPJ implements IFabricaAbstrata {

    private static FabricaPJ instance = new FabricaPJ();

    private FabricaPJ() {
    }

    public static FabricaPJ getInstance() {
        return instance;
    }

    @Override
    public IContrato criarContrato() {
        return new ContratoPJ();
    }

    @Override
    public IProcuracao criarProcuracao() {
        return new ProcuracaoPJ();
    }
}