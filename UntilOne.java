import java.util.Scanner;

public class UntilOne {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int number;
        int counter = 0;

        System.out.println("Enter a number (-1 to stop): ");
        number = scnr.nextInt();

        while (number != -1) {
            if (number >  0)
                counter++;
            System.out.println("Enter a number (-1 to stop): ");
            number = scnr.nextInt();
        }
        System.out.println("You entered " + counter + " positive numbers.");
    }
}
