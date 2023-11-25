import java.util.ArrayList;
import java.util.List;

import main.yahtzee.utils.Dado;

public class RolagemDados {
    private List<Integer> valoresDosDados;
    private Dado dado;

    public RolagemDados() {
        valoresDosDados = new ArrayList<>();
        dado = new Dado();
    }

    public List<Integer> rolarDados() {
        valoresDosDados.clear();

        for (int i = 0; i < 5; i++) {
            int valorDoDado = dado.getValor();
            valoresDosDados.add(valorDoDado); // Adiciona o valor gerado à lista
        }

        return valoresDosDados;
    }
}
