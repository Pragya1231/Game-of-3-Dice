import java.util.Scanner;
import java.util.Random;
public class Game {
    int numDice,trials;
    Random rand;
    Scanner scan; // for Enter key
    public Game(int numDice,int trials){
        this.numDice = numDice;
        this.trials = trials;
        rand = new Random();
        scan = new Scanner(System.in);

    }
    public int play(String player,int target){
        int[] dice = new int[numDice];
        int points = 0;
        for(int i=0;i<trials;i++){
            System.out.println("Press Enter: ");
            scan.nextLine();
            for(int j = 0;j<numDice;j++){
                dice[j] = rand.nextInt(6)+1;
                System.out.print(dice[j]+" ");
                if(dice[j]==target){
                    points++;
                }

            }
            System.out.println();
        }
        System.out.println(player +" got points = "+points);
        return points;
    }
}
