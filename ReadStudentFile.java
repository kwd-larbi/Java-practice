import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadStudentFile {
    public static void main(String[] args) throws IOException {
        File file = new File("student.txt");
        Scanner scnr = new Scanner(file);

        while (scnr.hasNext()) {
            String firstName = scnr.next();
            String lastName = scnr.next();
            int age = scnr.nextInt();
            String major = scnr.next();
            double gpa = scnr.nextDouble();

            System.out.println("----------------------------");
            System.out.println("# Student full name: " + firstName + " " + lastName);
            System.out.println("# Student age: " + age);
            System.out.println("# Student major: " + major);
            System.out.println("# GPA: " + gpa);
        }

        System.out.println("----------------------------");
        scnr.close();
    }
}
