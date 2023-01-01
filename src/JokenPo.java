import javax.security.sasl.SaslClient;
import java.util.Scanner;

public record JokenPo(
        Player user,
        Player IA,
        int rounds
) {

     public void toPlay() {
          System.out.println("\n******* Welcome, " + user.getName() + " *******\n");
          int choiceUser = choiceUser();
          if(choiceUser < 1 || choiceUser >3){
               System.out.println("\n INVALID MOVE! (1, 2 or 3): ");
               System.out.println("\tPOINT TO " + IA.getName() + "\n");
          }


     }
     private int choiceUser(){ //escolha do usuario
          Scanner sc = new Scanner(System.in);

          System.out.println("1 - PEDRA ");
          System.out.println("2 - PAPEL ");
          System.out.println("3 - TESOURA ");

          System.out.print("Informe sua jogada: ");
          
          return sc.nextInt();
     }
}
