import java.util.Scanner;

public class aFriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("====== Welcome to yagwDev's RPG ======");
        System.out.println(" This RPG was created to help somepeople that think about suicide.");
        System.out.println(" You will have a friend here, to make the things better.");
        System.out.println("- Then bro, tell me, What´s your name???");
        String name = sc.nextLine();

        System.out.println("-" + name + "? OMG, its a beautiful name");
        System.out.println("-" + name + ", Tell me, how it´s going the things?");

        // ESCOLHA 1
        System.out.println("A) Good bro, nothing more.");
        System.out.println("B) Very good, I wanna tell you about!!");
        System.out.println("C) So bad :(, Can you help me?");
        String task1 = sc.nextLine();

        if(task1.equalsIgnoreCase("A")) {
            System.out.println("- I'm happy to know you’re feeling good, bro.");
            System.out.println("- But sometimes even when we say 'nothing more,' we still carry things inside. Wanna share?");

            // ESCOLHA 1.1
              System.out.println("A) No bro, I really dont wanna talk about");
              System.out.println("B) You are correct, I wanna talk about it");
              String task1Escolha1 = sc.nextLine();

              if(task1Escolha1.equalsIgnoreCase("A")) {
                  System.out.println("- Ok, I respect your decision, but I will tell you some things, Ok?");
                  System.out.println("- Don’t worry if you feel pressured, take your time to do your things, my bro.");
                  System.out.println("- I believe in you, everything will be alright...");

                  System.out.println("======You have reached the end of the RPG======");
                  System.out.println("This program is still in beta, so there aren’t many conversations yet.");
                  System.out.println("Thanks for trying it out! I’ll keep improving it");
                  System.out.println("Remember, you can message me anytime on Instagram: @yagwthekid");
                  System.out.println("I’m always here, bro. Don’t hesitate to reach out!");
                  System.out.println("Take care, and see you soon!");
              }

              else if(task1Escolha1.equalsIgnoreCase("B")) {
                  System.out.println("- You can trust me, bro. Let it out.");
                  System.out.println("- Then, what do you wanna talk about?");
                 //ESCOLHA 1.2
                  System.out.println("A) I wanna talk about my family");
                  System.out.println("B) I wanna talk about school/work");
                  System.out.println("C) I just wanna talk about life in general");
                  String task1Escolha2 = sc.nextLine();

              if(task1Escolha2.equalsIgnoreCase("A")) {
                  System.out.println("- I know family issues can hurt a lot, but remember you don’t face it alone.");
                  System.out.println("- What’s been happening with your family?");

                  System.out.println("A) I feel misunderstood by them.");
                  System.out.println("B) We argue a lot, and it makes me sad.");
                  System.out.println("C) I feel distant and alone even when I’m with them.");
                  String task1Escolha3 = sc.nextLine();

                  if(task1Escolha3.equalsIgnoreCase("A")) {
                      System.out.println("- That’s hard, bro… being misunderstood by the people we love hurts deeply.");
                      System.out.println("- But don’t forget: your feelings are valid, even if they don’t get it right now.");

                      System.out.println("======You have reached the end of the RPG======");
                      System.out.println("This program is still in beta, so there aren’t many conversations yet.");
                      System.out.println("Thanks for trying it out! I’ll keep improving it");
                      System.out.println("Remember, you can message me anytime on Instagram: @yagwthekid");
                      System.out.println("I’m always here, bro. Don’t hesitate to reach out!");
                      System.out.println("Take care, and see you soon!");
                  }
                  else if(task1Escolha3.equalsIgnoreCase("B")) {
                      System.out.println("Arguments can be painful, bro.");
                      System.out.println("But remember, fighting doesn’t erase love — it often shows both sides are struggling to be heard.");

                      System.out.println("======You have reached the end of the RPG======");
                      System.out.println("This program is still in beta, so there aren’t many conversations yet.");
                      System.out.println("Thanks for trying it out! I’ll keep improving it");
                      System.out.println("Remember, you can message me anytime on Instagram: @yagwthekid");
                      System.out.println("I’m always here, bro. Don’t hesitate to reach out!");
                      System.out.println("Take care, and see you soon!");
                  }
                  else if(task1Escolha3.equalsIgnoreCase("C")) {
                      System.out.println("That loneliness inside a full house… I get it, bro.");
                      System.out.println("Sometimes the distance isn’t physical, it’s emotional. But trust me, you still matter to them.");

                      System.out.println("======You have reached the end of the RPG======");
                      System.out.println("This program is still in beta, so there aren’t many conversations yet.");
                      System.out.println("Thanks for trying it out! I’ll keep improving it");
                      System.out.println("Remember, you can message me anytime on Instagram: @yagwthekid");
                      System.out.println("I’m always here, bro. Don’t hesitate to reach out!");
                      System.out.println("Take care, and see you soon!");
                  }
                  // ENCERROU AQUI.
              }

              else if(task1Escolha2.equalsIgnoreCase("B")) {
                  System.out.println("- School and work can be stressful, bro. I understand, sometimes the pressure feels too much,");
                  System.out.println("- What’s the hardest part for you right now?");

                  System.out.println("A) Too much pressure and deadlines.");
                  System.out.println("B) I feel lost and don’t know what to do.");
                  System.out.println("C) I don’t enjoy what I’m doing.");
                  String task1Escolha4 = sc.nextLine();

                  if(task1Escolha4.equalsIgnoreCase("A")) {
                      System.out.println("I know the pressure can be heavy, bro.");
                      System.out.println("Deadlines can feel overwhelming, but you’re capable of handling it.");
                      System.out.println("Remember to breathe and take short breaks.");

                      System.out.println("======You have reached the end of the RPG======");
                      System.out.println("This program is still in beta, so there aren’t many conversations yet.");
                      System.out.println("Thanks for trying it out! I’ll keep improving it");
                      System.out.println("Remember, you can message me anytime on Instagram: @yagwthekid");
                      System.out.println("I’m always here, bro. Don’t hesitate to reach out!");
                      System.out.println("Take care, and see you soon!");
                  }
                  else if(task1Escolha4.equalsIgnoreCase("B")) {
                      System.out.println("Feeling lost happens to everyone sometimes. You’re not alone.");
                      System.out.println("Even if you’re unsure, every small step you take matters.");
                      System.out.println("I believe you!!");

                      System.out.println("======You have reached the end of the RPG======");
                      System.out.println("This program is still in beta, so there aren’t many conversations yet.");
                      System.out.println("Thanks for trying it out! I’ll keep improving it");
                      System.out.println("Remember, you can message me anytime on Instagram: @yagwthekid");
                      System.out.println("I’m always here, bro. Don’t hesitate to reach out!");
                      System.out.println("Take care, and see you soon!");
                  }
                  else if(task1Escolha4.equalsIgnoreCase("C")) {
                      System.out.println("It’s tough to work on something you don’t enjoy, bro. But maybe there’s a lesson in it.");
                      System.out.println("Try to focus on what you can control, and don’t forget your passions.");
                      System.out.println("Remember, bro, this doesn’t define your whole future. You can explore new paths.");

                      System.out.println("======You have reached the end of the RPG======");
                      System.out.println("This program is still in beta, so there aren’t many conversations yet.");
                      System.out.println("Thanks for trying it out! I’ll keep improving it");
                      System.out.println("Remember, you can message me anytime on Instagram: @yagwthekid");
                      System.out.println("I’m always here, bro. Don’t hesitate to reach out!");
                      System.out.println("Take care, and see you soon!");
                  }
              }
              else if(task1Escolha2.equalsIgnoreCase("C")) {
                  System.out.println("- I get it… sometimes it’s not one thing, it’s everything together.");
                  System.out.println("- Life can feel heavy, bro. What’s making you feel this way?");

                  System.out.println("A) I feel empty and unmotivated.");
                  System.out.println("B) I feel anxious and stressed.");
                  System.out.println("C) I don’t know what to do with my future.");
                  String task1Escolha5 = sc.nextLine();

                  if(task1Escolha5.equalsIgnoreCase("A")) {
                      System.out.println("I understand, bro. Feeling empty can be tough, but it’s okay to feel this way sometimes.");
                      System.out.println("Try to do small things you enjoy. Even tiny steps can lift your mood.");
                      System.out.println("Remember, bro, these feelings don’t define you. Better days are ahead.");

                      System.out.println("======You have reached the end of the RPG======");
                      System.out.println("This program is still in beta, so there aren’t many conversations yet.");
                      System.out.println("Thanks for trying it out! I’ll keep improving it");
                      System.out.println("Remember, you can message me anytime on Instagram: @yagwthekid");
                      System.out.println("I’m always here, bro. Don’t hesitate to reach out!");
                      System.out.println("Take care, and see you soon!");
                  }
                  else if(task1Escolha5.equalsIgnoreCase("B")) {
                      System.out.println("It’s normal to feel anxious sometimes, bro. Take deep breaths and try to calm your mind.");
                      System.out.println("Maybe write down what’s worrying you. Seeing it on paper can help.");
                      System.out.println("Remember, bro, anxiety is temporary. You’ll get through it.");

                      System.out.println("======You have reached the end of the RPG======");
                      System.out.println("This program is still in beta, so there aren’t many conversations yet.");
                      System.out.println("Thanks for trying it out! I’ll keep improving it");
                      System.out.println("Remember, you can message me anytime on Instagram: @yagwthekid");
                      System.out.println("I’m always here, bro. Don’t hesitate to reach out!");
                      System.out.println("Take care, and see you soon!");
                  }
                  else if(task1Escolha5.equalsIgnoreCase("C")) {
                      System.out.println("Feeling uncertain about the future is normal, bro. Take one step at a time.");
                      System.out.println("It’s okay to explore different paths. Every experience teaches you something.");
                      System.out.println("Remember, bro, it’s your journey. No one has all the answers right now.");

                      System.out.println("======You have reached the end of the RPG======");
                      System.out.println("This program is still in beta, so there aren’t many conversations yet.");
                      System.out.println("Thanks for trying it out! I’ll keep improving it");
                      System.out.println("Remember, you can message me anytime on Instagram: @yagwthekid");
                      System.out.println("I’m always here, bro. Don’t hesitate to reach out!");
                      System.out.println("Take care, and see you soon!");
                      //ENCERROU AQUI
                  }
              }
                }
        }


        else if(task1.equalsIgnoreCase("B")) {
            System.out.println("- Cool, Haha! I wanna hear about all things!!!");
            System.out.println("- Then, what do you wanna talk about?");

            System.out.println("A) decidir");
            System.out.println("B) decidir");
            System.out.println("C) decidir");
        }





        else if(task1.equalsIgnoreCase("C")) {
            System.out.println("- Sureee bro. Don´t Worry, I can talk with you.");
            System.out.println("- Tell me, What are happening?");

            System.out.println("A) decidir");
            System.out.println("B) decidir");
            System.out.println("C) decidir");
        }

        sc.close();

    }
}
