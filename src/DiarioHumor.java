import java.util.Scanner;

public class DiarioHumor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = 1;
        while(opcao != 2) {

            System.out.print("Digite seu nome: ");
            String nome = sc.nextLine();

            System.out.print("Como você se sentiu hoje? ");
            String sentimento = sc.nextLine();

            System.out.print("E o que fez de bom hoje? ");
            String fezDeBom = sc.nextLine();

            System.out.println("Hoje voce se sentiu: " + sentimento);
            System.out.println("e fez isso de bom: " + fezDeBom);
            System.out.println("Deseja anotar novamente? ");
            System.out.println("1 - Anotar novamente");
            System.out.println("2 - Sair do Aplicativo");
            opcao = sc.nextInt();
            sc.nextLine(); // limpa o buffer e faz voltar pro digite seu nome
        }
        sc.close();
    }
}
