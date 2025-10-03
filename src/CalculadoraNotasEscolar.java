import java.util.Scanner;

public class CalculadoraNotasEscolar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual seu nome?");
        String nome = sc.nextLine();

        System.out.println("Qual matéria deseja calcular a média?");
        String materia = sc.nextLine();

        System.out.println("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();

        double NotaTotal = (nota1 + nota2 + nota3) / 3;
        System.out.println(nome + ", sua nota média na matéria de " + materia + " é " + String.format("%.2f", NotaTotal) + " Pontos.");
        if(NotaTotal >= 7){
            System.out.println("Então você foi aprovado!");
        }
        else  if(NotaTotal < 7 && NotaTotal >= 5) {
            System.out.println("Então voce está de Recuperação!");
        }
        else if(NotaTotal < 5){
            System.out.println("Então você está reprovado!");
        }


    }
}

