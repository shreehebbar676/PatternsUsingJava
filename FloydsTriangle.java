package Patterns;

import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args){
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        final int row = scanner.nextInt();
        int num = 1;
               
        for (int i=1; i<=row; i++) {
            
            for(int j=1; j<=i; j++) {
                    System.out.print(num+" ");
                    num++;                  
                }
            System.out.println();    
            }
            
        }
}
