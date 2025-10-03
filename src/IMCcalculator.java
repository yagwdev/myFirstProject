import java.util.Scanner;

public class IMCcalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("======Bem vindo a caculadora de Indice de Massa Corporal======");
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.print("Digite sua altura (em metros): ");
        double altura = sc.nextDouble();
        System.out.print("Digite sua peso (em kg): ");
        double peso = sc.nextDouble();

        double imc = peso / (altura * altura);
        System.out.printf(nome + " com base nos dados, foi concluído que seu IMC é: %.2f%n", imc);

        if (imc < 18.5) {
            System.out.print("Você está abaixo do peso.");
        }
        else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Seu peso está normal.");
        }
        else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Você está acima do peso (Grau I)");
        }
        else if (imc >= 30 && imc <= 39.9) {
            System.out.println("Você está com obesidade (Grau II).");
        }
        else if (imc >= 40) {
            System.out.println("Você está com obesidade grave (Grau III).");
        }
        sc.close();
    }
}
