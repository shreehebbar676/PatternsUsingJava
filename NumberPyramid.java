package Patterns;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args){
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        final int n = scanner.nextInt();
               
        for (int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                    System.out.print(" ");                  
                }
            
            for(int j=1; j<=i; j++) {
                    System.out.print(i + " ");                  
                }
            System.out.println();    
            }
            
        }
    
}
