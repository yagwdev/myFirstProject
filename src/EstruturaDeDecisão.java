import java.util.Scanner;
public class EstruturaDeDecisão {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        Integer numero = sc.nextInt();

        /* esse caracter é chamado "MOD" que da o resultado do resto da divisao, nesse caso se o resto da divisao
        do numero por 2 for igual a 0, quer dizer que o numero é par. Do contrario, o numero é impar! */
        if (numero % 2 == 0) {
            System.out.println("Esse numero e par");
        } else {
            System.out.println("Esse numero e Impar");
        }
    }
}
