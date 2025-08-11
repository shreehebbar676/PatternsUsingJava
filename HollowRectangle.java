package Patterns;

import java.util.Scanner;

public class HollowRectangle {
    public static void main (final String[] args){
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        final int row = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        final int column = scanner.nextInt();
       
        for (int i=1; i<=row; i++) {
            
            for(int j=1; j<=column; j++) {
                if(i==1 || j == 1 || i==row || j==column){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }

    }
}

