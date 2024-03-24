/*This program enters the initial number of stars, and the program writes out lines of stars. Each line has one few star than the previous line
 * Written by: Janelie S. Blanco BSCS 1A */
import java.util.Scanner;

public class WedgeOfStars {
    public static void main(String[] args){
        //declaration of int variable
        int numStars, i = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an Initial Integer number of stars : "); //prompts the user for the num of stars
        numStars = scan.nextInt();

        if (numStars <= 0) // if the user inputs negative num
            System.out.println("Invalid. Do not input zero or any negative number. Please Try again.");
        else{
            while (numStars > 0){
                i = numStars;
                while (i > 0){
                    System.out.print("*"); 
                    i--;
                }
            System.out.println(""); //this create a line break between each line of stars
            numStars--; 
            }
        }
        scan.close();
    }  
}