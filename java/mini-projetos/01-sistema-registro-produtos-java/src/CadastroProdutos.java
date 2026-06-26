import java.util.ArrayList;

public class CadastroProdutos {
    private ArrayList<Produto> produtos;

    public CadastroProdutos() {
        produtos = new ArrayList<>();
        produtos.add(new Produto("Arroz", 22.90));
        produtos.add(new Produto("Feijão", 9.50));
    }

    public void cadastrarProduto(String nome, double preco) {
        produtos.add(new Produto(nome, preco));
    }

    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }

        for (int i = 0; i < produtos.size(); i++) {
            Produto produtoAtual = produtos.get(i);
            System.out.println(
                (i + 1) + ". " + produtoAtual.getNome() + " - R$ " + String.format("%.2f", produtoAtual.getPreco())
            );
        }
    }

    public void buscarProdutoPorNome(String nomeBuscado) {
        boolean encontrouProduto = false;

        for (int i = 0; i < produtos.size(); i++) {
            Produto produtoAtual = produtos.get(i);
            String nomeAtual = produtoAtual.getNome().toLowerCase();

            if (nomeAtual.contains(nomeBuscado.toLowerCase())) {
                System.out.println(
                    "Encontrado: " + produtoAtual.getNome() + " - R$ "
                        + String.format("%.2f", produtoAtual.getPreco())
                );
                encontrouProduto = true;
            }
        }

        if (!encontrouProduto) {
            System.out.println("Nenhum produto foi encontrado com esse nome.");
        }
    }

    public void removerProdutoPorNome(String nomeBuscado) {
        boolean removeuProduto = false;

        for (int i = 0; i < produtos.size(); i++) {
            Produto produtoAtual = produtos.get(i);
            String nomeAtual = produtoAtual.getNome().toLowerCase();

            if (nomeAtual.contains(nomeBuscado.toLowerCase())) {
                produtos.remove(i);
                i--;
                removeuProduto = true;
            }
        }

        if (removeuProduto) {
            System.out.println("Produto removido com sucesso.");
        } else {
            System.out.println("Nenhum produto foi encontrado para remover.");
        }
    }

    public int contarProdutos() {
        return produtos.size();
    }

    public boolean existeProdutoComNome(String nomeBuscado) {
        for (int i = 0; i < produtos.size(); i++) {
            Produto produtoAtual = produtos.get(i);
            if (produtoAtual.getNome().equalsIgnoreCase(nomeBuscado)) {
                return true;
            }
        }

        return false;
    }
}
