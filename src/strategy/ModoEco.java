package strategy;

public class ModoEco implements ModoOperacao {
    @Override
    public void aplicar(String nomeDispositivo) {
        System.out.println(nomeDispositivo + " em MODO ECO: Economia (50% potência).");
    }
}
