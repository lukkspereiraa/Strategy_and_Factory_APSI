package strategy;

public class ModoPerfomance implements ModoOperacao {
    @Override
    public void aplicar(String nomeDispositivo) {
        System.out.println(nomeDispositivo + " em MODO PERFORMANCE: Turbo (100%).");
    }
}
