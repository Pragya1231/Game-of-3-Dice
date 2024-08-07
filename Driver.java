import java.util.Scanner;
import java.util.Random;
public class Driver {
    public static void main(String[] args) {
        int numDice =3, trials =5;
        int playerPoints = 0,computerPoints = 0;
        Random choice = new  Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose your target number between 1 to 6 = ");
        int playerTarget = scan.nextInt();
        Game player = new Game(numDice,trials);
        playerPoints = player.play("Player",playerTarget);
        int computerTarget = choice.nextInt(6) + 1;   // 1 to 6
        System.out.println("Computer Target = "+computerTarget);
        Game Computer = new Game(numDice,trials);
        computerPoints = Computer.play("Computer",computerTarget);
        if (playerPoints > computerPoints) {
            System.out.println("YOU WIN");
        }else if(playerPoints < computerPoints){
            System.out.println("COMPUTER WIN");
        }else{
            System.out.println("DRAW");
        }
    }
}
