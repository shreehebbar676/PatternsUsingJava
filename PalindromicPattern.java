package Patterns;

import java.util.Scanner;

public class PalindromicPattern {
        public static void main(String[] args){
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        final int n = scanner.nextInt();
               
        for (int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                    System.out.print(" ");                  
                }
            
            for(int j=i; j>=1; j--) {
                    System.out.print(j );                  
                }
            for(int j=2; j<=i; j++) {
                    System.out.print(j );                  
                }
            System.out.println();    
            }
            
        }
}
