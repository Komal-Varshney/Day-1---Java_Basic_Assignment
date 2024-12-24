import java.util.Scanner;

public class find_power {
    public static void main(String[] args) {
        // Check if the user has provided a command-line argument
        if (args.length == 0) {
            System.out.println("Please provide a power value N as a command-line argument.");
            return;
        }

        int N = Integer.parseInt(args[0]);

        if (N < 0 || N >= 31) {
            System.out.println("Please enter a value of N such that 0 <= N < 31");
            return;
        }

        System.out.println("Table of Powers of 2 up to 2^" + N + ":");

        for (int i = 0; i <= N; i++) {
            System.out.println("2^" + i + " = " + (int)Math.pow(2, i));
        }
    }
}
