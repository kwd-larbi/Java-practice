import java.util.Scanner;

public class Five {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a 5-digit number: ");
        int num = input.nextInt();

        int d1 = num / 10000;
        int d2 = (num / 1000) % 10;
        int d3 = (num / 100) % 10;
        int d4 = (num / 10) % 10;
        int d5 = num % 10;
         
        System.out.print("The digits are "); 
        System.out.printf("%d   %d   %d   %d   %d%n", d1, d2, d3, d4, d5);
    }
}
