// sum of odd numbers from 1 to 49
/*
1,3,5,7,9,
11,13,15,17,19,
21,23,25,27,29,
31,33,35,37,39,
41,43,45,47,49
 */
public class SumOddNumber {
    public static void main(String[] args){
        int counter = 0;
        int sum = 0;


        while(counter <= 24){
            sum += 2 * counter +1;
            counter++;
        }
        System.out.println("Sum of odd numbers from 0 to 49 is: " + sum);
    }
}
