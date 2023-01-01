import java.util.Scanner;

public class Main {

    public static JokenPo startGame(){
        System.out.println("******* Jo-Ken-Po  *******\n"); // \n -> pular linha
        Scanner sc = new Scanner(System.in);

        System.out.println("type you name");
        String playerName = sc.next().toUpperCase();

        Player user = new Player(playerName); // instanciado o objeto capturado do sc.next
        Player IA = new Player("IA");

        System.out.print(playerName + ", informe quantos rounds você deseja jogar: ");
        int rounds = sc.nextInt();

        return new JokenPo(user, IA, rounds);

    }

    public static void main(String[] args) {
        JokenPo jokenPo = startGame();
        jokenPo.toPlay();
    }
}
