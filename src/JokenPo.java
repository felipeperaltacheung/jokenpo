import javax.security.sasl.SaslClient;
import java.util.Random;
import java.util.Scanner;

public record JokenPo(
        Player user,
        Player IA,
        int rounds
) {

     public void toPlay() {
          System.out.println("\n******* Welcome, " + user.getName() + " *******\n");

          for (int i = 1;  i < rounds; i++){
               int choiceUser = choiceUser();
               if(choiceUser < 1 || choiceUser >3){
                    System.out.println("\n INVALID MOVE! (1, 2 or 3): ");
                    System.out.println("\tPOINT TO " + IA.getName() + "\n");
                    IA.incrementScore();
                    //continue
               }
               int choiceIA = choiceIA();
               System.out.println("\n" + choiceUser + " x " + choiceIA);

               int result = choiceUser - choiceIA;

               winnerRound(result);
          }
     }


     public void showFinalResult(){
          System.out.println("\n**********************************************88\n");

          Integer finalScoreUser = user.getScore();
          Integer finalScoreIA = IA.getScore();

          System.out.println("\n\tPLACAR FINAL: " + user.getName() + " " + user.getScore() + " X " + IA.getScore() + " " + IA.getName());

          if (finalScoreUser == finalScoreIA) {
               System.out.println("\t\t\tEMPATE!");
          } else {
               String finalWinner = (finalScoreIA > finalScoreUser) ?  user.getName() : IA.getName();

               System.out.println("\t\tVENCEDOR = " + finalWinner.toUpperCase());
          }

          System.out.println("\n**********************************************88\n");

     }
     private void winnerRound(int result){
          String winnerRound;
          if(result == 0){
               winnerRound = "EMPATE";
          } else {
               if (result == -1 || result ==2){
                    IA.incrementScore();
                    winnerRound = IA().getName();
               } else {
                    user.incrementScore();
                    winnerRound = user.getName();
               }
          }
     }

     private int choiceIA(){
          Random r = new Random();
          return r.nextInt(3) +1;
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
