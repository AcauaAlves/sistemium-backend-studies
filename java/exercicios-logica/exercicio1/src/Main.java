
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        System.out.print("Digite a quantidade de nomes que você quer colocar na lista: ");
        int opcao = scanner.nextInt();
        System.out.println();
        scanner.nextLine();
        for (int i = 0; i < opcao; i++) {
            System.out.print("Digite o " + (i + 1) + "º nome: ");
            String nome = scanner.nextLine();
            nomes.add(nome);
        }

        System.out.println("\nOs nomes digitados na lista são: ");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        
        }
        scanner.close();
    }

}
