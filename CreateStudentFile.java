import java.io.PrintWriter;
import java.io.IOException;

public class CreateStudentFile {
    public static void main(String[] args) throws IOException {
        PrintWriter writer = new PrintWriter("student.txt");

        // firstName   lastName   age   major   GPA
        writer.println("Edan Barrett 20 ComputerScience 3.4");
        writer.println("Reagan Bradshaw 19 InformationTechnology 3.8");
        writer.println("Caius Charlton 21 CyberSecurity 3.2");

        writer.close();
        System.out.println("student.txt created.");
    }
}
