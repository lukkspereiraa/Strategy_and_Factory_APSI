import factory.Hub;
import factory.HubClimatizacao;
import factory.HubIluminacao;
import strategy.ModoEco;
import strategy.ModoPerfomance;

public class Main {
    public static void main(String[] args) {
        // Executando Iluminação  no modo eco
        Hub hub1 = new HubIluminacao();
        hub1.operar(new ModoEco());
        hub1.operar(new ModoPerfomance());

        // Executando Climatização com modo Perfomace
        Hub hub2 = new HubClimatizacao();
        hub2.operar(new ModoPerfomance());
        hub2.operar(new ModoEco());
    }
}