package Patterns;

import java.util.*;
public class SolidRectangle {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int column = scanner.nextInt();
       
        for (int i=1; i<=row; i++) {
            
            for(int j=1; j<=column; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
