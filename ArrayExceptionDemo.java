public class ArrayExceptionDemo {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};

        try {
            // Intentionally using invalid index
            System.out.println("Accessing index 10: " + nums[10]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Exception caught: Invalid array index!");
            System.out.println("Message: " + ex.getMessage());
        }

        System.out.println("Program continues normally...");
    }
}
