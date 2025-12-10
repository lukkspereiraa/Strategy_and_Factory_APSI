package factory;

import dispositivo.Dispositivo;
import dispositivo.Lampada;
import strategy.ModoOperacao;

public class HubIluminacao extends Hub {
    @Override
    protected Dispositivo criarDispositivo(ModoOperacao modo) {
        return new Lampada(modo);
    }
}