public class ClienteEntrega extends Cliente {
    private String Endereco;

    public ClienteEntrega(String nome, String Endereco) {
        super(nome);
        this.Endereco = Endereco;
    }

    public String getEndereco() {
        return Endereco;
    }

    @Override
    public String toString() {

        return "Cliente = " + super.getNome() + " | Endereço = " + getEndereco();
    }
}
