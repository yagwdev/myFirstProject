import java.util.InputMismatchException;
import java.util.Scanner;

public class Testes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade = 0;
        boolean valido = false;

        while (!valido) {
            try {
                System.out.print("Digite sua idade: ");
                idade = sc.nextInt();
                valido = true; // se chegou aqui, é porque digitou número
            } catch (InputMismatchException e) {
                System.out.println("❌ é pra colocar números! Digite apenas números.");
                sc.nextLine(); // limpa o buffer do scanner
            }
        }

        System.out.println("Sua idade é: " + idade);
        sc.close();
    }
}
