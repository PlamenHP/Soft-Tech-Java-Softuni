import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by user on 30/10/2016.
 */
public class PrimeChecker {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();

        boolean isPrime = IsPrime(Long.parseLong(input));
        if (isPrime) {
System.out.println("True");
        } else {
System.out.println("False");
        }

    }

    public static boolean IsPrime(long n) {
        boolean isPrime = true;

        if (n == 0 || n == 1)
            return false;
        if (n == 2 || n == 3)
            return true;

        long j = 2;

        long nm = (long)Math.sqrt(n);
        while (j <= nm) {
            if (n % j++ == 0) {
                isPrime = false;
            }
        }

        return isPrime;
    }
}
