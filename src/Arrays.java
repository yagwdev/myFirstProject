import java.sql.SQLOutput;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] produto = new String[3];
        produto[0] = "Arroz";
        produto[1] = "Feijão";
        produto[2] = "Macarrão";

        int[] quantidade = new int[3];
        quantidade[0] = 5;
        quantidade[1] = 8;
        quantidade[2] = 6;

        int opcao = 0;
        //equanto não for digitado o numero 4 (SAIR), o looping vai continuar.
        while (opcao != 4) {
            System.out.println("==== Bem vindo ao Sistema de Estoque ==== ");
            System.out.println("MENU INICIAL");
            System.out.println("1. Lista de Produtos");
            System.out.println("2. Vender Produtos");
            System.out.println("3. Repor Produtos");
            System.out.println("4. Sair");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("Produto 1: " + produto[0] + " - Quantidade: " + quantidade[0] + (quantidade[0] <= 0 ? " (Sem Estoque)" : ""));
                System.out.println("Produto 2: " + produto[1] + " - Quantidade: " + quantidade[1] + (quantidade[1] <= 0 ? " (Sem Estoque)" : ""));
                System.out.println("Produto 3: " + produto[2] + " - Quantidade: " + quantidade[2] + (quantidade[2] <= 0 ? " (Sem Estoque)" : ""));
            } else if (opcao == 2) {
                System.out.println("Produto 1: " + produto[0] + " - Quantidade: " + quantidade[0]);
                System.out.println("Produto 2: " + produto[1] + " - Quantidade: " + quantidade[1]);
                System.out.println("Produto 3: " + produto[2] + " - Quantidade: " + quantidade[2]);

                System.out.println("Digite o numero do produto (1 a 3): ");
                int opcaoProduto = sc.nextInt();

                if (opcaoProduto == 1) {
                    System.out.println("Digite a quantidade de sacos que deseja vender: ");
                    int subtrair = sc.nextInt();
                    sc.nextLine();
                    if (subtrair > quantidade[0]) {
                        System.out.println("No estoque existem apenas " + quantidade[0] + " sacos disponiveis.");
                    } else {
                        quantidade[0] -= subtrair;
                        System.out.println("Venda realizada com sucesso!");
                        System.out.println("Agora a quantidade de sacos de Arroz é: " + quantidade[0]);
                    }
                } else if (opcaoProduto == 2) {
                    System.out.println("Digite a quantidade de sacos que deseja vender: ");
                    int subtrair = sc.nextInt();
                    sc.nextLine();
                    if (subtrair > quantidade[1]) {
                        System.out.println("No estoque existem apenas " + quantidade[1] + " sacos disponiveis.");
                    } else {
                        quantidade[1] -= subtrair;
                        System.out.println("Venda realizada com sucesso!");
                        System.out.println("Agora a quantidade de sacos de Feijão é: " + quantidade[1]);
                    }
                } else if (opcaoProduto == 3) {
                    System.out.println("Digite a quantidade de sacos que deseja vender: ");
                    int subtrair = sc.nextInt();
                    sc.nextLine();
                    if (subtrair > quantidade[2]) {
                        System.out.println("No estoque existem apenas " + quantidade[2] + " sacos disponiveis.");
                    } else{
                        quantidade[2] -= subtrair;
                        System.out.println("Venda realizada com sucesso!");
                        System.out.println("Agora a quantidade de sacos de Macarrão é: " + quantidade[2]);
                    }
                }

            }else if(opcao == 3) {
                    System.out.println("Produto 1: " + produto[0] + " - Quantidade: " + quantidade[0]);
                    System.out.println("Produto 2: " + produto[1] + " - Quantidade: " + quantidade[1]);
                    System.out.println("Produto 3: " + produto[2] + " - Quantidade: " + quantidade[2]);

                    System.out.println("Digite o numero do produto que deseja repor (1 a 3): ");
                    int opcaoProdutoDois = sc.nextInt();

                    if (opcaoProdutoDois == 1) {
                        System.out.println("Digite a quantidade de sacos que deseja repor: ");
                        int adicionar = sc.nextInt();
                        sc.nextLine();
                        quantidade[0] += adicionar;
                        System.out.println("Reposição realizada com sucesso!");
                        System.out.println("Agora a quantidade de sacos de Arroz é: " + quantidade[0]);
                    } else if (opcaoProdutoDois == 2) {
                        System.out.println("Digite a quantidade de sacos que deseja repor: ");
                        int adicionar = sc.nextInt();
                        sc.nextLine();
                        quantidade[1] += adicionar;
                        System.out.println("Reposição realizada com sucesso!");
                        System.out.println("Agora a quantidade de sacos de Feijão é: " + quantidade[1]);
                    } else if (opcaoProdutoDois == 3) {
                        System.out.println("Digite a quantidade de sacos que deseja repor: ");
                        int adicionar = sc.nextInt();
                        sc.nextLine();
                        quantidade[2] += adicionar;
                        System.out.println("Reposição realizada com sucesso!");
                        System.out.println("Agora a quantidade de sacos de Macarrão é: " + quantidade[2]);
                    }
                }
        }
        sc.close();
    }
}

