import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CadastroProdutos cadastro = new CadastroProdutos();
        boolean continuarSistema = true;

        try (Scanner scanner = new Scanner(System.in)) {
            while (continuarSistema) {
                mostrarMenu();
                System.out.print("Digite a opção desejada: ");
                String opcaoDigitada = scanner.nextLine();

                int opcao;

                try {
                    opcao = Integer.parseInt(opcaoDigitada);
                } catch (NumberFormatException erro) {
                    System.out.println("A opção precisa ser um número inteiro.");
                    System.out.println();
                    continue;
                }

                switch (opcao) {
                    case 1:
                        cadastrarProduto(scanner, cadastro);
                        break;
                    case 2:
                        cadastro.listarProdutos();
                        break;
                    case 3:
                        buscarProduto(scanner, cadastro);
                        break;
                    case 4:
                        removerProduto(scanner, cadastro);
                        break;
                    case 5:
                        continuarSistema = false;
                        System.out.println("Encerrando o sistema.");
                        break;
                    default:
                        System.out.println("Digite uma opção válida do menu.");
                }

                System.out.println();
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("SISTEMA DE REGISTRO DE PRODUTOS");
        System.out.println("1 - Cadastrar produto");
        System.out.println("2 - Listar produtos");
        System.out.println("3 - Buscar produto por nome");
        System.out.println("4 - Remover produto por nome");
        System.out.println("5 - Sair");
    }

    private static void cadastrarProduto(Scanner scanner, CadastroProdutos cadastro) {
        try {
            System.out.print("Digite o nome do produto: ");
            String nomeDigitado = scanner.nextLine();
            String nomeValidado = ValidadorProduto.validarNome(nomeDigitado);

            System.out.print("Digite o preço do produto: ");
            String precoDigitado = scanner.nextLine();
            double precoValidado = ValidadorProduto.validarPreco(precoDigitado);

            cadastro.cadastrarProduto(nomeValidado, precoValidado);
            System.out.println("Produto cadastrado com sucesso.");
        } catch (IllegalArgumentException erro) {
            System.out.println(erro.getMessage());
        }
    }

    private static void buscarProduto(Scanner scanner, CadastroProdutos cadastro) {
        try {
            System.out.print("Digite o nome do produto que deseja buscar: ");
            String nomeDigitado = scanner.nextLine();
            String nomeValidado = ValidadorProduto.validarNome(nomeDigitado);
            cadastro.buscarProdutoPorNome(nomeValidado);
        } catch (IllegalArgumentException erro) {
            System.out.println(erro.getMessage());
        }
    }

    private static void removerProduto(Scanner scanner, CadastroProdutos cadastro) {
        try {
            System.out.print("Digite o nome do produto que deseja remover: ");
            String nomeDigitado = scanner.nextLine();
            String nomeValidado = ValidadorProduto.validarNome(nomeDigitado);
            cadastro.removerProdutoPorNome(nomeValidado);
        } catch (IllegalArgumentException erro) {
            System.out.println(erro.getMessage());
        }
    }
}
