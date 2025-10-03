import java.util.Scanner;

public class MinutesCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("====Welcome to Time Conversor====");
        System.out.print("Digite os minutos: ");
        int minutos = sc.nextInt();

        int horas = minutos / 60;
        int dias = horas / 24;
        int horasRestante = horas % 24;

        System.out.print("Isso equivale a: " + horas + " horas ou " + dias + " dia(s) e " + horasRestante + " horas.");

        sc.close();
    }
}
