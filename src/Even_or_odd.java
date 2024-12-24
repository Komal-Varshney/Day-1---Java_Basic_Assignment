import java.util.Scanner;

public class Even_or_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int N = sc.nextInt();

        if(N%2 == 0){
            System.out.println("The entered number is even");
        }else{
            System.out.println("The Entered number is odd");
        }

        sc.close();
    }
}
