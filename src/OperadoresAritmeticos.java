
public class OperadoresAritmeticos {

    public static void main(String[] args) {
        // compras
        double pao = 4.50;
        double chiclete = 0.50;
        double cocaCola = 3.50;

        // calculandoDiasDoMes
        int totalDiasDoMes = 30;

        // desconto
        double desconto = 10.00;

        // valores
        double valorBruto = pao + chiclete + cocaCola;
        double valorComDesconto = valorBruto - (valorBruto * desconto / 100 );
        double valorTotalMensal = valorComDesconto * totalDiasDoMes;

        System.out.printf("Valor total = R$ %.2f%n", valorComDesconto);
        System.out.printf("Valor total Mensal (Utilizando 30 dias como base) = R$ %.2f%n", valorTotalMensal );




    }

}
