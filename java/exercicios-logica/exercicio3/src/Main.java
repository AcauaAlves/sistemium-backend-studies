import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] valoresCompras = new double[5];

        for (int i = 0; i < valoresCompras.length; i++) {
            System.out.print("Digite o valor da " + (i + 1) + "a compra: ");
            valoresCompras[i] = scanner.nextDouble();
        }

        double total = 0;
        double maiorValor = valoresCompras[0];
        double menorValor = valoresCompras[0];

        for (int i = 0; i < valoresCompras.length; i++) {
            total += valoresCompras[i];

            if (valoresCompras[i] > maiorValor) {
                maiorValor = valoresCompras[i];
            }

            if (valoresCompras[i] < menorValor) {
                menorValor = valoresCompras[i];
            }
        }

        double media = total / valoresCompras.length;

        System.out.println("\nResumo das compras:");
        for (int i = 0; i < valoresCompras.length; i++) {
            System.out.println("Compra " + (i + 1) + ": R$" + valoresCompras[i]);
        }

        System.out.println("\nValor total: R$" + total);
        System.out.println("Media das compras: R$" + media);
        System.out.println("Maior valor: R$" + maiorValor);
        System.out.println("Menor valor: R$" + menorValor);

        if (total > 300) {
            System.out.println("Voce teve um gasto alto nas compras.");
        } else {
            System.out.println("Voce manteve os gastos sob controle.");
        }

        scanner.close();
    }
}
