import java.util.Scanner;

public class MultiplaEscolha {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int acertos = 0;

        System.out.println("Digite Seu Nome");
        String nome = sc.nextLine();

        System.out.println("Olá " + nome + ", aqui estão 3 perguntas, acha que consegue acerta-lás?");
        System.out.println("Responda com 1, 2 ou 3");
        System.out.println("Quem descobriu o Brasil? ");
        System.out.println("1) Os Angolanos");
        System.out.println("2) Os Indígenas");
        System.out.println("3) Os Portugueses");

        String a = "2";
        String b = sc.nextLine();

        if(b.equals(a)) {
            System.out.println("Resposta Correta, Os indígenas ja se encontravam aqui!");
            acertos++;
        }
        else {
            System.out.println("Resposta errada, resposta correta: 2!");
        }

        System.out.println("Qual é a cor do céu em um dia claro?");
        System.out.println("1) Azul");
        System.out.println("2) Rosa");
        System.out.println("3) Preto");

        a = "1";
        b = sc.nextLine();

        if(b.equals(a)) {
            System.out.println("Resposta Certa");
            acertos++;
        }
        else {
            System.out.println("Resposta errada, resposta correta: 1!");
        }

        System.out.println("Quanto ficou o jogo do Brasil x Bolivia?");
        System.out.println("1) 1x2 Brasil");
        System.out.println("2) 0x1 Brasil");
        System.out.println("3) 0x1 Bolivia");

        a = "3";
        b = sc.nextLine();

        if(b.equals(a)) {
            System.out.println("Resposta Certa");
            acertos++;
        }
        else {
            System.out.println("Resposta errada, resposta correta: 3!");
        }

        System.out.println("=================================");
        System.out.println("Quiz finalizado, " + nome + "!");
        System.out.println("Sua pontuação foi: " + acertos + " de 3");

        if(acertos == 3){
            System.out.println("Você se saiu muito bem e acertou todas as questões, meus parabéns!!!");
        }
        else if(acertos == 2){
            System.out.println("Você foi bem, mas pode melhorar!!");
        }
        else if(acertos == 1){
            System.out.println("Você acertou apenas uma questão, tente novamente!");
        }
        else { // aqui só sobra o caso acertos == 0
            System.out.println("Você não acertou nenhuma questão, tente novamente!");
        }

        sc.close(); // fecha o scanner

    }
}
