import java.util.Scanner;
import java.util.Random;

public class MyRPS {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Rock Paper Scissors Game!");
        System.out.print("Enter your choice (rock, paper, scissors): ");
        String user = sc.next().toLowerCase();

        int compNum = rand.nextInt(3);
        String comp = (compNum == 0) ? "rock" : (compNum == 1) ? "paper" : "scissors";

        System.out.println("Computer chose: " + comp);

        if (user.equals(comp)) {
            System.out.println("It's a tie!");
        } else if (
            (user.equals("rock") && comp.equals("scissors")) ||
            (user.equals("paper") && comp.equals("rock")) ||
            (user.equals("scissors") && comp.equals("paper"))
        ) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }

        sc.close();
    }
}
