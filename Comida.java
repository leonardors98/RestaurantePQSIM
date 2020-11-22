public class Comida {
    private String Ingredientes;
    private String Nome;

    public Comida(String Nome, String Ingredientes) {
        this.Ingredientes = Ingredientes;
        this.Nome = Nome;
    }

    @Override
    public String toString() {
        return "[" + Nome + " | Ingredientes: " + Ingredientes + "]";
    }
}
