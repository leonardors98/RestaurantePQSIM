public class AppHome {

    public static void main(String[] args) {
        ClienteEntrega Leonardo = new ClienteEntrega("Leonardo Rodrigues de Souza", "rua 15 de abril");
        ClienteEntrega Arlindo = new ClienteEntrega("Arlindo Cruz", "Avenida nobre ");
        ClienteMesa Regina = new ClienteMesa("Regina Kazé", 35);

        Cardapio Pizza = new Cardapio("Pizza");

        Comida PBacon = new Comida("Pizza de bacon", "bacon + queijo");
        Comida PFrango = new Comida("Pizza de Frango", "Frango + queijo");
        Comida PCalabresa = new Comida("Pizza de Calabresa", "Calabresa + queijo");

        Pizza.addRefeicao(PBacon);
        Pizza.addRefeicao(PFrango);
        Pizza.addRefeicao(PCalabresa);

        System.out.println("***Clientes***");
        System.out.println(Leonardo);
        System.out.println(Arlindo);
        System.out.println(Regina);

        System.out.println("\n***Cardapio***");
        System.out.println(Pizza);
    }
}
