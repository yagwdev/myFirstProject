
import java.util.Scanner;

public class ConversorMoeda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = 0;
        while (opcao != 3){
            System.out.println("=====Bem vindo ao Conversor de Moedas=====");
            System.out.println("A cotação utilizada é com base no dia de hoje ");
            System.out.println("1 - Converter Real para Dólar");
            System.out.println("2 - Converter Dólar para Real") ;
            System.out.println("3 - Sair");
            opcao = sc.nextInt();

            if(opcao == 1){
                System.out.print("Digite a quantidade em Real: ");
                double realQtd = sc.nextDouble();
                double dolarValor = realQtd * 0.19;
                System.out.printf("Valor em Dólar: $ %.2f%n", dolarValor);
            }
            else if(opcao == 2){
                System.out.print("Digite a quantidade em Dólar: ");
                double dolarQtd = sc.nextDouble();
                double realValor = dolarQtd * 5.34;
                System.out.printf("Valor em Real: R$ %.2f%n", realValor);
            }
        }
    }
}
