import java.util.Scanner;

public class SistemaLoginSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String login;
        String senha;

        String usuarioCorreto = "admin";
        String senhaCorreta = "1234";

        int senhaErrada = 0;


        System.out.println("Digite o nome de usuario: ");
        login = sc.nextLine();


        if(!login.equals(usuarioCorreto)){
            System.out.println("Usuario não encontrado ");
            return;
        }
        while(senhaErrada < 3){
            System.out.println("Digite a senha: ");
            senha = sc.nextLine();
            if(senha.equals(senhaCorreta)){
                System.out.println("Usuario Logado com sucesso!");
                break;
            }
            else {
                System.out.println("Senha incorreta!");
                senhaErrada++;
            }
        }

        sc.close();
    }
}
