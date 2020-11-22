public class ClienteMesa extends Cliente {
    private int mesa;

    public ClienteMesa(String nome, int mesa) {
        super(nome);
        this.mesa = mesa;
    }

    public String getMesa() {
        return String.valueOf(mesa);
    }

    @Override
    public String toString() {

        return "Mesa = " + getMesa() + " | Cliente = " + super.getNome();
    }
}
