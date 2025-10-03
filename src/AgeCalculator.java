import java.util.Scanner;
public class AgeCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;
        System.out.println("=====Bem vindo a calculdora de idade======");
        System.out.println("Qual o seu nome?");
        nome = sc.nextLine();

        System.out.println("Qual a sua idade? ");
        // hasNextInt() checa se dá para transformar em número.
        // Se sim → nextInt() lê o valor.
        // Se não → o programa mostra mensagem de erro e não quebra.
        // OBS: precisa criar o INT na variavel
        if(sc.hasNextInt()){
            idade = sc.nextInt();
        }
        else{
            System.out.println("Digite um número válido para a idade.");
            return;
        }

        if(idade <= 13 && idade > 0){
            System.out.println("Voce é criança e se chama " + nome + ".");
        }
        else if(idade > 13 && idade <= 19){
            System.out.println("Voce é Adolescente e se chama " + nome + ".");
        }
        else if(idade >= 20 && idade <= 59){
            System.out.println("Você é Adulto e se chama " + nome + ".");
        }
        else if(idade >= 60 && idade <= 110){
            System.out.println("Você é idoso e se chama " + nome + ".");
        }
        else {
            System.out.println("Digite uma idade verdadeira.");
        }

    }
}
