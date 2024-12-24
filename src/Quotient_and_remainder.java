import java.util.Scanner;
public class Quotient_and_remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Dividend : ");
        int N = sc.nextInt();

        System.out.print("Enter a Divisor : ");
        int M = sc.nextInt();

        int quotient = N/M;
        int remainder = N%M;

        System.out.println("The quoteint is " + quotient);
        System.out.println("The remainder is " + remainder);


    }
}
