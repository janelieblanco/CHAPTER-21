/*This program computes X^N where X is a floating point number and N is a positive integer. The program informs the user that N must be positive if the user enters a negative value. 
 * Written by: Janelie S. Blanco BSCS 1A */
import java.util.Scanner;

public class PowerOfANumber {
    public static void main (String[] args){
        //declaration of variables
        float X, product = 1;
        int N, i = 0;
        Scanner scan = new Scanner(System.in);

        //prompts the user to enter X and N
        System.out.print("Enter a number to be multiplied: ");
        X = scan.nextFloat();
        System.out.print("Enter a power for the number: ");
        N = scan.nextInt();

        if (N <= 0)
            System.out.println("Invalid. Power must be a positive integer.");
        else{
            while (i < N){
                product *= X;
                i++;
            }
            System.out.println("" + X  + " raised to the power of " + N + " is: " + product); //output
        }
        scan.close();
    }
}
