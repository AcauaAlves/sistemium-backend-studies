public class TestesBasicos {
    public static void main(String[] args) {
        testarValidacaoDeNome();
        testarValidacaoDePreco();
        testarCadastroDeProdutos();
        testarRemocaoDeProduto();

        System.out.println("Todos os testes básicos passaram.");
    }

    private static void testarValidacaoDeNome() {
        String nome = ValidadorProduto.validarNome("  Arroz  ");
        verificar("Arroz".equals(nome), "O nome deveria ser tratado com trim.");
    }

    private static void testarValidacaoDePreco() {
        double preco = ValidadorProduto.validarPreco("10,50");
        verificar(preco == 10.50, "O preço deveria aceitar vírgula.");

        boolean lancouErro = false;

        try {
            ValidadorProduto.validarPreco("-1");
        } catch (IllegalArgumentException erro) {
            lancouErro = true;
        }

        verificar(lancouErro, "Preço negativo deveria gerar erro.");
    }

    private static void testarCadastroDeProdutos() {
        CadastroProdutos cadastro = new CadastroProdutos();
        int quantidadeInicial = cadastro.contarProdutos();

        cadastro.cadastrarProduto("Cafe", 15.90);

        verificar(
            cadastro.contarProdutos() == quantidadeInicial + 1,
            "O cadastro deveria aumentar a quantidade de produtos."
        );
        verificar(cadastro.existeProdutoComNome("Cafe"), "O produto cadastrado deveria existir na lista.");
    }

    private static void testarRemocaoDeProduto() {
        CadastroProdutos cadastro = new CadastroProdutos();
        cadastro.cadastrarProduto("Macarrao", 8.90);
        cadastro.removerProdutoPorNome("Macarrao");

        verificar(!cadastro.existeProdutoComNome("Macarrao"), "O produto deveria ser removido da lista.");
    }

    private static void verificar(boolean condicao, String mensagem) {
        if (!condicao) {
            throw new IllegalStateException(mensagem);
        }
    }
}
