import java.util.Scanner;

public class CalculadoraInteligente{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

          while(true) {

            double num1;
            double num2;

            System.out.println("=======DIGITE SAIR PARA FECHAR A CALCULADORA=======");
            System.out.println("Bem vindo a Calculadora Inteligente by yagwDev, diga o primeiro número que deseja fazer a operação.");

            // a string entrada foi feita so pra diminuir o codigo, toUpperCase faz entender a entrada como maiuscula.
            // a entrada é igual a proxima linha digitada...

            String entrada = sc.nextLine().toUpperCase();

            // se a entrada for igual a SAIR, o comando BREAK faz o while ser quebrado.
            if(entrada.equals("SAIR")){
                 System.out.println("=====Calculadora finalizada com sucesso!=====");
                 break;
            }
           // o comando try e catch faz ver o erro e escolher uma mensagem pra aparecer no console, continue faz voltar a calculadora.
           // esse comando Double.parseDouble transforma string em numero decimal.
            try{
                 num1 = Double.parseDouble(entrada);
           } catch (NumberFormatException e) {
                 System.out.println("Digite um número válido");
                 continue;
           }


            System.out.println("Agora o outro numero");
            // o comando try e catch faz ver o erro e escolher uma mensagem pra aparecer no console.
            // esse comando double.doubleparse converte string em numero decimal.
            try {
                 num2 = Double.parseDouble(sc.nextLine());
            }
            catch (NumberFormatException e) {
                 System.out.println("Digite um número válido");
                 continue;
            }


            System.out.println("Agora me diga qual operação eu devo fazer");
            System.out.println("SOMA");
            System.out.println("VEZES");
            System.out.println("MENOS");
            System.out.println("DIVISAO");
            String operacao = sc.nextLine().toUpperCase();

            if(operacao.equals("SOMA")) {
                System.out.println("Aqui está o resultado da sua Adição: ");
                System.out.println(num1 + " + " + num2);
                System.out.println(num1 + num2);
            } else if (operacao.equals("VEZES")) {
                System.out.println("Aqui está o resultado da sua Multiplicação: ");
                System.out.println(num1 + " x " + num2);
                System.out.println(num1 * num2);
            } else if (operacao.equals("MENOS")) {
                System.out.println("Aqui está o resultado da sua Subtração: ");
                System.out.println(num1 + " - " + num2);
                System.out.println(num1 - num2);
            } else if (operacao.equals("DIVISAO")) {
                System.out.println("Aqui está o resultado da sua Divisão: ");
                System.out.println(num1 + " / " + num2);
                System.out.println(num1 / num2);
            } else {
                  System.out.println("Erro! Digite o nome da operação CORRETAMENTE!!!");
              }

        }
        sc.close();
    }
}
