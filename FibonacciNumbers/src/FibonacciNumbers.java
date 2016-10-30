import java.util.Scanner;

/**
 * Created by user on 30/10/2016.
 */
public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        int fibNumber = Fib(Integer.parseInt(input));

        System.out.println(fibNumber);
    }

    public static int Fib(int n){
        if ( n == 0 || n==1){
            return 1;
        }
        else{
            return Fib(n-1) + Fib(n-2);
        }
    }
}
