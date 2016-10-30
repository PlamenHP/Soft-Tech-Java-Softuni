import java.util.Scanner;

/**
 * Created by user on 30/10/2016.
 */
public class EmployeeData {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String fName = console.nextLine();
        String lName = console.nextLine();
        String ageStr = console.nextLine();
        int age = Integer.parseInt(ageStr);
        String genderStr = console.nextLine();
        char gender = genderStr.charAt(0);
        String pID = console.nextLine();
        String uEN = console.nextLine();

        System.out.println("First name: " + fName);
        System.out.println("Last name: " + lName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Personal ID: " + pID);
        System.out.println("Unique Employee number: " + uEN);
    }
}
