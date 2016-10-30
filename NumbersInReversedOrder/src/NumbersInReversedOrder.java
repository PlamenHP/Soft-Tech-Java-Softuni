import java.util.Scanner;

/**
 * Created by user on 30/10/2016.
 */
public class NumbersInReversedOrder {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String input = console.nextLine();
        String reversed = new StringBuilder(input).reverse().toString();

        System.out.print(reversed);
    }
}

