package factory;

import dispositivo.ArCondicionado;
import dispositivo.Dispositivo;
import strategy.ModoOperacao;

public class HubClimatizacao extends Hub {
    @Override
    protected Dispositivo criarDispositivo(ModoOperacao modo) {
        return new ArCondicionado(modo);
    }
}