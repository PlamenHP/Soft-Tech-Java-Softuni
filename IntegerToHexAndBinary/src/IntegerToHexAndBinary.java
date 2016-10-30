import java.util.Map;
import java.util.Scanner;

/**
 * Created by user on 30/10/2016.
 */
public class IntegerToHexAndBinary {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String line = console.nextLine();
        int decimalNumber = Integer.parseInt(line);

        System.out.println(Integer.toHexString(decimalNumber).toUpperCase());
        System.out.println(Integer.toBinaryString(decimalNumber));
    }
}
