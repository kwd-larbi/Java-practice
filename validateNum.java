import java.util.Scanner;
public class validateNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        do {
            System.out.println("Enter a number between 1 and 10: ");
            number = input.nextInt();

            if (number < 1 || number > 10) {
                System.out.print("Invalid input. Try again.");
            }
        } while (number < 1 || number > 10);

        System.out.println("You entered: " + number);
    }
}
