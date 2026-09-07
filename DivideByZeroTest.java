public class DivideByZeroTest {
    public static void main(String[] args) {

        // Integer division by zero
        try {
            int a = 10 / 0;
            System.out.println(a);
        } catch (ArithmeticException ex) {
            System.out.println("Integer divide-by-zero error: " + ex);
        }

        // Floating-point division by zero
        float x = 10.0f / 0;
        double y = 20.0 / 0;
        double z = 0.0 / 0.0;

        System.out.println("Float result: " + x);
        System.out.println("Double result: " + y);
        System.out.println("0.0 / 0.0 result: " + z);
    }
}
