package dispositivo;

import strategy.ModoOperacao;

public class Lampada extends Dispositivo {
    public Lampada(ModoOperacao modoInicial) {
        super("Lâmpada Smart", modoInicial);
    }
}