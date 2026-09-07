import java.util.Scanner;

public class SquareTest {

    public static void squareOfAsterisks(int side) {
        for (int i = 0; i < side; i++) {          // rows
            for (int j = 0; j < side; j++) {      // columns
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side length of the square: ");
        int side = sc.nextInt();

        squareOfAsterisks(side);

        sc.close();
    }
}
