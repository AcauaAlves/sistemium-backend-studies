
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] minhasNotas = new double[4];

        for (int i = 0; i < minhasNotas.length; i++) {
            System.out.print("Digite a sua " + (i + 1) + " nota: ");
            minhasNotas[i] = scanner.nextDouble();
        }

        double soma = 0;
        for (int i = 0; i < minhasNotas.length; i++) {
            soma += minhasNotas[i];
        }

        double media = soma / minhasNotas.length;

        System.out.println("\nNotas digitadas:");
        for (int i = 0; i < minhasNotas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + minhasNotas[i]);
        }

        if (media >= 7) {
            System.out.println("\nSua média foi " + media + " - Aprovado!");
        } else {
            System.out.println("\nSua média foi " + media + " - Reprovado...");
        }

        scanner.close();
    }
}
