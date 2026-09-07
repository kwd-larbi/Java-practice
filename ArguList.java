import java.util.Random;

public class ArguList {

    public static void main(String[] args) {

        int size;
        int min = 0, max = 0;
        int[] arr;

        // Case 1: No arguments → default size 10
        if (args.length == 0) {
            size = 10;
            arr = new int[size];

            System.out.println("No arguments supplied. Default array of size 10:");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        // Case 2: Must have exactly 3 arguments
        if (args.length != 3) {
            System.out.println("Error: You must supply exactly 3 arguments: size min max");
            return;
        }

        try {
            size = Integer.parseInt(args[0]);
            min = Integer.parseInt(args[1]);
            max = Integer.parseInt(args[2]);
        } catch (NumberFormatException e) {
            System.out.println("Error: All arguments must be integers.");
            return;
        }

        if (size <= 0 || min > max) {
            System.out.println("Error: Invalid size or min/max range.");
            return;
        }

        arr = new int[size];
        Random rand = new Random();

        // Fill array with random numbers
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(max - min + 1) + min;
        }

        // Print array
        System.out.println("Array of size " + size + " with random values from " + min + " to " + max + ":");
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
