// Write a Java program that uses a do‑while loop to calculate the sum of all even numbers from 1 to 20.
/*
2,4,6,8,10,12,14,16,18,20
 */
public class doWhileCal {
    public static void main(String[] args){
        int count = 1;
        int sum = 0;

        do {
            if (count % 2 == 0){
                sum += count;
            }
            count ++;

        }
        while (count <= 20);

        System.out.println("The sum of even numbers from 1 to 20 is: " + sum);


    }
}
