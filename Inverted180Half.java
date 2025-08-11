package Patterns;

import java.util.Scanner;

public class Inverted180Half {
    public static void main(String[] args){
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        final int row = scanner.nextInt();
               
        //Outer loop
        for (int i=1; i<=row; i++) {
            //innerloop for space print
            for(int j=1; j<=row-i; j++) {
                    System.out.print(" ");                  
                }
            //Inner loop for star print
            for(int j=1; j<=i; j++) {
                    System.out.print("*");                  
                }
            System.out.println();    
            }
            
        }
}
