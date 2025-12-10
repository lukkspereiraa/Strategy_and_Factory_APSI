package factory;

import dispositivo.Dispositivo;
import strategy.ModoOperacao;

public abstract class Hub {
    protected abstract Dispositivo criarDispositivo(ModoOperacao modo);

    public void operar(ModoOperacao modoInicial) {
        Dispositivo dispositivo = criarDispositivo(modoInicial);
        System.out.println(">> Hub iniciou operação...");
        dispositivo.funcionar();
    }
}
