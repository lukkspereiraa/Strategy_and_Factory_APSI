package dispositivo;

import strategy.ModoEco;
import strategy.ModoOperacao;

public abstract class Dispositivo {
    protected String nome;
    protected ModoOperacao modo;

    public Dispositivo(String nome, ModoOperacao modoInicial) {
        this.nome = nome;
        this.modo = modoInicial;
    }

    public void setModo(ModoOperacao modo) {
        this.modo = modo;
    }

    public void funcionar() {
        this.modo.aplicar(this.nome);
    }
}