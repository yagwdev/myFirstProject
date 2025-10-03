import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = 0;
        while (opcao != 3) {
            System.out.println("1 - Converter Celsius para Fahrenheit");
            System.out.println("2 - Converter Fahrenheit para Celsius");
            System.out.println("3 - Sair");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("Digite a temperatura em Celsius");
                double temperatura = sc.nextDouble();
                double tempFahrenheit = (temperatura * 1.8) + 32;
                System.out.println("Temperatura em Fahrenheit: " + tempFahrenheit + "F");
            } else if (opcao == 2) {
                System.out.println("Digite a temperatura em Fahrenheit");
                double temperatura = sc.nextDouble();
                double tempCelsius = (temperatura - 32) * 0.55;
                System.out.println("Temperatura em Celsius: " + tempCelsius + "C°");
            }
        }
        sc.close();
    }
}
