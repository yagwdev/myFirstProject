import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = "Yágo";

        System.out.println("Olá " + nome + " Você é meu criador, né?");

        System.out.print("Sua resposta: "); // prompt para o usuário digitar a resposta

        String resposta = sc.nextLine(); // lê a resposta do usuário. A proxima linha.

        System.out.println("Você respondeu: " + resposta);

        sc.close();





    }
}
