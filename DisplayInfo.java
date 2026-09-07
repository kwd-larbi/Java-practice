public class DisplayInfo {
    public static void main(String[] args) {
    
        System.out.println("======\"Welcome to NVCC!\"======");
        
       System.out.printf("%-12s%-15s%-10s%n", "Last Name", "Student ID", "GPA");
       System.out.printf("%-12s%-15d%-10.1f%n", "Smith", 123, 3.2);
       System.out.printf("%-12s%-15d%-10.1f%n", "Jones", 456, 3.5);
   
    }
}