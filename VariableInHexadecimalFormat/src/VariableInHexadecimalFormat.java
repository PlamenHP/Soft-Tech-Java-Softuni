import java.util.Scanner;

/**
 * Created by user on 30/10/2016.
 */
public class VariableInHexadecimalFormat {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String input = console.nextLine().substring(2);
        int decimalNumber = Integer.parseInt(input,16);
        System.out.println(decimalNumber);
    }
}
