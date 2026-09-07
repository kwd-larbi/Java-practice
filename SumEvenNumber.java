// sum of even numbers from 0 to 50
/* 2 4, 6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,36,38,,40
42,44,46,48,50

 */
public class SumEvenNumber {
    public static void main(String[] args){
        int counter = 0;
        int sum = 0;

        while(counter <= 25){
            sum += 2 * counter;
            counter ++;

        }
        System.out.println("The sum of even numbers from 0 to 50 is: " + sum);
    }
}

