import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first Number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second Number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter the third Number: ");
        int num3 = sc.nextInt();

        int largest = num1;

        if(num2>largest){
            largest = num2;
        }

        if(num3 > largest){
            largest = num3;
        }
        System.out.println("The largest among three number is: " + largest);
    }
}
