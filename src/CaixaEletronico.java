import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String login;
        String senha;

        double saldoAtual = 1000.00;
        double valorDeposito;
        double valorSaque;
        String opcao = "";

        String usuarioCorreto = "admin";
        String senhaCorreta = "1234";

        System.out.println("Digite o nome de usuario: ");
        login = sc.nextLine();

        if(!login.equals(usuarioCorreto)){
            System.out.println("Usuario não encontrado ");
            return;
        }
        System.out.println("Digite a senha: ");
        senha = sc.nextLine();
        if(senha.equals(senhaCorreta)){
            System.out.println("Usuario Logado com sucesso!");
        }
        else {
            System.out.println("Senha incorreta!");
        }


        // enquanto a opção não for "4", o menu vai se repetir
        while (!opcao.equals("4")) {
            System.out.println("======== Bem vindo ao Sistema de Caixa Eletronico ========");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar dinheiro");
            System.out.println("3 - Sacar dinheiro");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextLine();

            if (opcao.equals("1")) {
                System.out.println("Esse é o seu saldo atual: R$" + saldoAtual);
            }
            else if (opcao.equals("2")) {
                System.out.print("Digite o valor que deseja depositar: ");
                valorDeposito = sc.nextDouble();
                saldoAtual = saldoAtual + valorDeposito;
                System.out.println("Agora o saldo atual da sua conta é: R$" + saldoAtual);
                sc.nextLine(); // limpa buffer
            }
            else if (opcao.equals("3")) {
                System.out.println("Seu saldo atual: R$" + saldoAtual);
                System.out.print("Digite o valor que deseja sacar: ");
                valorSaque = sc.nextDouble();

                if (valorSaque <= saldoAtual) {
                    saldoAtual -= valorSaque;
                    System.out.println("Você sacou: R$" + valorSaque);
                    System.out.println("Agora seu saldo atual é: R$" + saldoAtual);
                } else {
                    System.out.println("Saldo insuficiente!");
                }
                sc.nextLine(); // limpa buffer
            }
            else if (opcao.equals("4")) {
                System.out.println("Você saiu do banco.");
            }
            else {
                System.out.println("Opção inválida, tente novamente.");
            }
        }
        sc.close();
    }
}
