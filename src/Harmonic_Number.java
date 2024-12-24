import java.util.Scanner;

public class Harmonic_Number {
    public static void main(String[] args){
        System.out.println("Enter the harmonic value N : ");
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if(N == 0){
            System.out.println("please enter a valid value of N");
            return;
        }

        double ans = 0.0;
        for(int i = 1; i<=N; i++){
            ans+=1.0 /(double)i;
        }
        System.out.println("The " + N + "th harmonic number is --> " + ans);
    }
}
