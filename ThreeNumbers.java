import java.util.Scanner;

public class ThreeNumbers {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter three integers: ");
        int a = scnr.nextInt();
        int b = scnr.nextInt();
        int c = scnr.nextInt();

        int sum = a + b + c;
        int product = a * b * c;
        double average = sum / 3.0;

        System.out.printf("Sum = %d%n", sum);
        System.out.printf("Product = %d%n", product);
        System.out.printf("Average = %.2f%n", average);
    }
}
