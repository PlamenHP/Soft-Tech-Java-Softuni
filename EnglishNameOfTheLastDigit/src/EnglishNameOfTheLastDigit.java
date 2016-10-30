import java.util.Scanner;

/**
 * Created by user on 30/10/2016.
 */
public class EnglishNameOfTheLastDigit {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        char lastDigit = input.charAt(input.length()-1);
        if ( lastDigit == '0'){
            System.out.println("zero");
        }
        if ( lastDigit == '1'){
            System.out.println("one");
        }
        if ( lastDigit == '2'){
            System.out.println("two");
        }
        if ( lastDigit == '3'){
            System.out.println("three");
        }
        if ( lastDigit == '4'){
            System.out.println("four");
        }
        if ( lastDigit == '5'){
            System.out.println("five");
        }
        if ( lastDigit == '6'){
            System.out.println("six");
        }
        if ( lastDigit == '7'){
            System.out.println("seven");
        }
        if ( lastDigit == '8'){
            System.out.println("eight");
        }
        if ( lastDigit == '9'){
            System.out.println("nine");
        }
    }
}
