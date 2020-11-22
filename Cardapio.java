import java.util.ArrayList;
import java.util.List;

public class Cardapio {
    private String Tipo;
    private List<Comida> comida = new ArrayList<>();

    public Cardapio(String Tipo) {
        this.Tipo = Tipo;
    }

    public void addRefeicao(Comida novo) {
        this.comida.add(novo);
    }

    @Override
    public String toString() {
        String SComidas = "Sabores:\n";
        for (Comida e : this.comida) {
            SComidas += "  " + e.toString() + "\n";
        }

        return "Cardapio de " + Tipo + ": " + SComidas.substring(0, SComidas.length() - 2) + "]";
    }
}
