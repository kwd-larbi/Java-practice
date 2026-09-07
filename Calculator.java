import java.util.Scanner;

public class Calculator {

    public static double sum(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nCalculator Menu");
            System.out.println("1. Sum");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Quit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                double x = sc.nextDouble();
                System.out.print("Enter second number: ");
                double y = sc.nextDouble();

                switch (choice) {
                    case 1: System.out.println("Sum = " + sum(x, y)); break;
                    case 2: System.out.println("Difference = " + subtract(x, y)); break;
                    case 3: System.out.println("Product = " + multiply(x, y)); break;
                    case 4: 
                        if (y == 0) System.out.println("Cannot divide by zero.");
                        else System.out.println("Quotient = " + divide(x, y));
                        break;
                }
            }

        } while (choice != 5);

        System.out.println("Goodbye!");
        sc.close();
    }
}
