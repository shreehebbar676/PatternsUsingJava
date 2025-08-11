package Patterns;

import java.util.Scanner;

public class InvertedHalfPyramid {
    public static void main(String[] args){
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        final int row = scanner.nextInt();
               
        for (int i=row; i>=1; i--) {
            
            for(int j=1; j<=i; j++) {
                    System.out.print("*");                  
                }
            System.out.println();    
            }
            
        }

    }
