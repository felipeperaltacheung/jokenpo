public record JokenPo(
        Player user,
        Player IA,
        int rounds
) {

     public void toPlay(){
          System.out.println("\n******* Welcome, " + user.getName() + " *******\n");
     }

     private int choiceUser(){

     }
}
