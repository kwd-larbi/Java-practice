import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSumMax {

    // 1. Method to return the maximum value in an ArrayList
    // Returns null if list is null or empty
    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.size() == 0) {
            return null;
        }

        int max = list.get(0);
        for (int n : list) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }

    // 2. Method to return the sum of all values in an ArrayList
    public static double sum(ArrayList<Integer> list) {
        if (list == null || list.size() == 0) {
            return 0;
        }

        double total = 0;
        for (int n : list) {
            total += n;
        }
        return total;
    }

    // 3. Test program
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter numbers (0 to stop):");

        while (true) {
            int value = sc.nextInt();
            if (value == 0) {
                break;
            }
            numbers.add(value);
        }

        double total = sum(numbers);
        Integer largest = max(numbers);

        System.out.println("Sum = " + total);
        System.out.println("Max = " + largest);

        sc.close();
    }
}
