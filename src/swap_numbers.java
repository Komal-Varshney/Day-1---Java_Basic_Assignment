import java.util.Scanner;

public class swap_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a first number: ");
        int num1 = sc.nextInt();
        System.out.println("The first number is : " + num1 );

        System.out.print("Enter a second number: ");
        int num2 = sc.nextInt();
        System.out.println("The second number is : " + num2);

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("The numbers after swap are  --> ");
        System.out.println("The first number is : " + num1);
        System.out.println("The second number is : " + num2);

        sc.close();
    }
}
