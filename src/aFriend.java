import java.util.Scanner;

public class aFriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("====== Bem-vindo ao RPG do yagwDev ======");
        System.out.println(" Este RPG foi criado para ajudar algumas pessoas que pensam em suicídio.");
        System.out.println(" Você terá um amigo aqui, para deixar as coisas melhores.");
        System.out.println("- Então mano, me diz, qual é o seu nome???");
        String name = sc.nextLine();

        System.out.println("- " + name + "? OMG, é um nome lindo");
        System.out.println("- " + name + ", me conta, como estão as coisas?");

        // ESCOLHA 1
        System.out.println("A) Bem mano, nada demais.");
        System.out.println("B) Muito bem, quero te contar!!");
        System.out.println("C) Muito mal :(, pode me ajudar?");
        String task1 = sc.nextLine();

        if(task1.equalsIgnoreCase("A")) {
            System.out.println("- Fico feliz em saber que você está bem, mano.");
            System.out.println("- Mas às vezes, mesmo quando dizemos 'nada demais', ainda carregamos coisas por dentro. Quer compartilhar?");

            // ESCOLHA 1.1
            System.out.println("A) Não mano, eu realmente não quero falar sobre isso");
            System.out.println("B) Você tem razão, eu quero falar sobre isso");
            String task1Escolha1 = sc.nextLine();

            if(task1Escolha1.equalsIgnoreCase("A")) {
                System.out.println("- Ok, eu respeito sua decisão, mas vou te dizer algumas coisas, beleza?");
                System.out.println("- Não se preocupe se sentir pressão, faça as coisas no seu tempo, meu mano.");
                System.out.println("- Eu acredito em você, tudo vai ficar bem...");

                System.out.println("======Você chegou ao fim do RPG======");
                System.out.println("Este programa ainda está em beta, então não há muitas conversas ainda.");
                System.out.println("Obrigado por testar! Vou continuar melhorando");
                System.out.println("Lembre-se, pode me chamar no Instagram: @yagwthekid");
                System.out.println("Eu sempre estarei aqui, mano. Não hesite em me procurar!");
                System.out.println("Se cuida, até logo!");
            }

            else if(task1Escolha1.equalsIgnoreCase("B")) {
                System.out.println("- Você pode confiar em mim, mano. Desabafa.");
                System.out.println("- Então, sobre o que você quer falar?");
                //ESCOLHA 1.2
                System.out.println("A) Quero falar sobre minha família");
                System.out.println("B) Quero falar sobre escola/trabalho");
                System.out.println("C) Só quero falar sobre a vida em geral");
                String task1Escolha2 = sc.nextLine();

                if(task1Escolha2.equalsIgnoreCase("A")) {
                    System.out.println("- Eu sei que problemas de família podem doer muito, mas lembre-se que você não enfrenta isso sozinho.");
                    System.out.println("- O que tem acontecido com sua família?");

                    System.out.println("A) Eu me sinto incompreendido por eles.");
                    System.out.println("B) Nós brigamos muito, e isso me deixa triste.");
                    System.out.println("C) Me sinto distante e sozinho mesmo quando estou com eles.");
                    String task1Escolha3 = sc.nextLine();

                    if(task1Escolha3.equalsIgnoreCase("A")) {
                        System.out.println("- Isso é difícil, mano… ser incompreendido por quem amamos dói demais.");
                        System.out.println("- Mas não esqueça: seus sentimentos são válidos, mesmo que eles não entendam agora.");

                        System.out.println("======Você chegou ao fim do RPG======");
                        System.out.println("Este programa ainda está em beta, então não há muitas conversas ainda.");
                        System.out.println("Obrigado por testar! Vou continuar melhorando");
                        System.out.println("Lembre-se, pode me chamar no Instagram: @yagwthekid");
                        System.out.println("Eu sempre estarei aqui, mano. Não hesite em me procurar!");
                        System.out.println("Se cuida, até logo!");
                    }
                    else if(task1Escolha3.equalsIgnoreCase("B")) {
                        System.out.println("Discussões podem ser dolorosas, mano.");
                        System.out.println("Mas lembre-se, brigar não apaga o amor — muitas vezes mostra que os dois lados estão lutando para serem ouvidos.");

                        System.out.println("======Você chegou ao fim do RPG======");
                        System.out.println("Este programa ainda está em beta, então não há muitas conversas ainda.");
                        System.out.println("Obrigado por testar! Vou continuar melhorando");
                        System.out.println("Lembre-se, pode me chamar no Instagram: @yagwthekid");
                        System.out.println("Eu sempre estarei aqui, mano. Não hesite em me procurar!");
                        System.out.println("Se cuida, até logo!");
                    }
                    else if(task1Escolha3.equalsIgnoreCase("C")) {
                        System.out.println("Essa solidão dentro de uma casa cheia… eu entendo, mano.");
                        System.out.println("Às vezes a distância não é física, é emocional. Mas confia em mim, você ainda é importante para eles.");

                        System.out.println("======Você chegou ao fim do RPG======");
                        System.out.println("Este programa ainda está em beta, então não há muitas conversas ainda.");
                        System.out.println("Obrigado por testar! Vou continuar melhorando");
                        System.out.println("Lembre-se, pode me chamar no Instagram: @yagwthekid");
                        System.out.println("Eu sempre estarei aqui, mano. Não hesite em me procurar!");
                        System.out.println("Se cuida, até logo!");
                    }
                    // ENCERROU AQUI.
                }

                else if(task1Escolha2.equalsIgnoreCase("B")) {
                    System.out.println("- Escola e trabalho podem ser estressantes, mano. Eu entendo, às vezes a pressão é demais,");
                    System.out.println("- O que está sendo mais difícil pra você agora?");

                    System.out.println("A) Pressão e prazos demais.");
                    System.out.println("B) Me sinto perdido e não sei o que fazer.");
                    System.out.println("C) Eu não gosto do que estou fazendo.");
                    String task1Escolha4 = sc.nextLine();

                    if(task1Escolha4.equalsIgnoreCase("A")) {
                        System.out.println("Eu sei que a pressão pode ser pesada, mano.");
                        System.out.println("Os prazos podem parecer sufocantes, mas você é capaz de lidar com isso.");
                        System.out.println("Lembre-se de respirar e fazer pequenas pausas.");

                        System.out.println("======Você chegou ao fim do RPG======");
                        System.out.println("Este programa ainda está em beta, então não há muitas conversas ainda.");
                        System.out.println("Obrigado por testar! Vou continuar melhorando");
                        System.out.println("Lembre-se, pode me chamar no Instagram: @yagwthekid");
                        System.out.println("Eu sempre estarei aqui, mano. Não hesite em me procurar!");
                        System.out.println("Se cuida, até logo!");
                    }
                    else if(task1Escolha4.equalsIgnoreCase("B")) {
                        System.out.println("Se sentir perdido acontece com todo mundo às vezes. Você não está sozinho.");
                        System.out.println("Mesmo que não tenha certeza, cada pequeno passo que você dá importa.");
                        System.out.println("Eu acredito em você!!");

                        System.out.println("======Você chegou ao fim do RPG======");
                        System.out.println("Este programa ainda está em beta, então não há muitas conversas ainda.");
                        System.out.println("Obrigado por testar! Vou continuar melhorando");
                        System.out.println("Lembre-se, pode me chamar no Instagram: @yagwthekid");
                        System.out.println("Eu sempre estarei aqui, mano. Não hesite em me procurar!");
                        System.out.println("Se cuida, até logo!");
                    }
                    else if(task1Escolha4.equalsIgnoreCase("C")) {
                        System.out.println("É difícil trabalhar em algo que você não gosta, mano. Mas talvez haja uma lição nisso.");
                        System.out.println("Tente focar no que você pode controlar e não esqueça de suas paixões.");
                        System.out.println("Lembre-se, mano, isso não define todo o seu futuro. Você pode explorar novos caminhos.");

                        System.out.println("======Você chegou ao fim do RPG======");
                        System.out.println("Este programa ainda está em beta, então não há muitas conversas ainda.");
                        System.out.println("Obrigado por testar! Vou continuar melhorando");
                        System.out.println("Lembre-se, pode me chamar no Instagram: @yagwthekid");
                        System.out.println("Eu sempre estarei aqui, mano. Não hesite em me procurar!");
                        System.out.println("Se cuida, até logo!");
                    }
                }
                else if(task1Escolha2.equalsIgnoreCase("C")) {
                    System.out.println("- Eu entendo… às vezes não é uma coisa só, é tudo junto.");
                    System.out.println("- A vida pode parecer pesada, mano. O que está te fazendo sentir assim?");

                    System.out.println("A) Me sinto vazio e sem motivação.");
                    System.out.println("B) Me sinto ansioso e estressado.");
                    System.out.println("C) Não sei o que fazer com meu futuro.");
                    String task1Escolha5 = sc.nextLine();

                    if(task1Escolha5.equalsIgnoreCase("A")) {
                        System.out.println("Eu entendo, mano. Se sentir vazio pode ser difícil, mas está tudo bem se sentir assim às vezes.");
                        System.out.println("Tente fazer pequenas coisas que você gosta. Mesmo passos pequenos podem melhorar seu dia.");
                        System.out.println("Lembre-se, mano, esses sentimentos não definem quem você é. Dias melhores virão.");

                        System.out.println("======Você chegou ao fim do RPG======");
                        System.out.println("Este programa ainda está em beta, então não há muitas conversas ainda.");
                        System.out.println("Obrigado por testar! Vou continuar melhorando");
                        System.out.println("Lembre-se, pode me chamar no Instagram: @yagwthekid");
                        System.out.println("Eu sempre estarei aqui, mano. Não hesite em me procurar!");
                        System.out.println("Se cuida, até logo!");
                    }
                    else if(task1Escolha5.equalsIgnoreCase("B")) {
                        System.out.println("É normal sentir ansiedade às vezes, mano. Respire fundo e tente acalmar sua mente.");
                        System.out.println("Talvez escrever o que está te preocupando ajude. Ver no papel pode clarear as coisas.");
                        System.out.println("Lembre-se, mano, a ansiedade é temporária. Você vai superar isso.");

                        System.out.println("======Você chegou ao fim do RPG======");
                        System.out.println("Este programa ainda está em beta, então não há muitas conversas ainda.");
                        System.out.println("Obrigado por testar! Vou continuar melhorando");
                        System.out.println("Lembre-se, pode me chamar no Instagram: @yagwthekid");
                        System.out.println("Eu sempre estarei aqui, mano. Não hesite em me procurar!");
                        System.out.println("Se cuida, até logo!");
                    }
                    else if(task1Escolha5.equalsIgnoreCase("C")) {
                        System.out.println("Sentir incerteza sobre o futuro é normal, mano. Vá com calma, um passo de cada vez.");
                        System.out.println("Está tudo bem explorar diferentes caminhos. Cada experiência ensina algo.");
                        System.out.println("Lembre-se, mano, essa é a sua jornada. Ninguém tem todas as respostas agora.");

                        System.out.println("======Você chegou ao fim do RPG======");
                        System.out.println("Este programa ainda está em beta, então não há muitas conversas ainda.");
                        System.out.println("Obrigado por testar! Vou continuar melhorando");
                        System.out.println("Lembre-se, pode me chamar no Instagram: @yagwthekid");
                        System.out.println("Eu sempre estarei aqui, mano. Não hesite em me procurar!");
                        System.out.println("Se cuida, até logo!");
                        //ENCERROU AQUI
                    }
                }
            }
        }


        else if(task1.equalsIgnoreCase("B")) {
            System.out.println("- Daora, Haha! Quero ouvir sobre tudo!!!");
            System.out.println("- Então, sobre o que você quer falar?");

            System.out.println("A) decidir");
            System.out.println("B) decidir");
            System.out.println("C) decidir");
        }





        else if(task1.equalsIgnoreCase("C")) {
            System.out.println("- Claro mano. Não se preocupa, eu posso conversar com você.");
            System.out.println("- Me conta, o que está acontecendo?");

            System.out.println("A) decidir");
            System.out.println("B) decidir");
            System.out.println("C) decidir");
        }

        sc.close();

    }
}
