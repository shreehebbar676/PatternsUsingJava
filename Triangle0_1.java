package Patterns;

import java.util.Scanner;

public class Triangle0_1 {
    public static void main (final String[] args){
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        final int row = scanner.nextInt();
       
        for (int i=1; i<=row; i++) {
            
            for(int j=1; j<=i; j++) {
                if((i+j)%2==0){
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
                
            }
            System.out.println();
        }

    }
}
