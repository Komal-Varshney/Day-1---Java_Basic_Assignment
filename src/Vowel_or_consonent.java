import java.util.Scanner;

public class Vowel_or_consonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character : ");
        char ch = sc.next().charAt(0);

        System.out.println("You entered ch : " + ch);
        if (!Character.isLetter(ch)) {
            System.out.println("Please enter an alphabet");
            return;
        }

        ch = Character.toLowerCase(ch);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("The " + ch + " is a vowel");
        } else {
            System.out.println("The " + ch + " is a consonent");
        }

        sc.close();
    }
}
