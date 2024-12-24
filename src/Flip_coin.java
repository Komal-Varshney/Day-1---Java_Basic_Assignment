import java.util.Scanner;

public class Flip_coin {
    public static void main(String[] args){
        System.out.println("Enter the number of times to flip coin");

        Scanner sc = new Scanner(System.in);
        int flips = sc.nextInt();

        if(flips<=0){
            System.out.println("Please enter a valid number");
            return;
        }

        int heads = 0, tails = 0;
        for(int i=0; i<flips; i++){
            double value = Math.random();
            if(value<0.5){
                tails++;
            }else{
                heads++;
            }
        }

        double tailsPercentage = (double) tails/flips * 100;
        double headsPercentage = (double) heads/flips * 100;

        System.out.println("Total flips" + flips);
        System.out.println("tails--> " + tails + " --> Tails percentage --> " + tailsPercentage);
        System.out.println("heads--> " + heads + " --> heads percentage --> " + headsPercentage);

        sc.close();
    }
}
