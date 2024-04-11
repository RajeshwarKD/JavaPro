package com.company;

/*A program needs to be developed which can mirror reflect any 5 × 5 2D character
array into its side-by-side reflection. Write suitable code to achieve this transformation as shown below:
        Note the following points carefully:
        1. Here, instead of X and O any character may be present.
        2. The input and output array size must be of dimension 5 × 5 and nothing else.
        3. Only side-by-side reflection should be performed i.e. ABC || CBA.*/

//Input Case        OOXOO
//                  OOXOO
//                  XXXOO
//                  OOOOO
//                  XOABC

//Output Case        OOXOO
//                   OOXOO
//                   OOXXX
//                   OOOOO
//                   CBAOX
import java.util.Scanner;
public class NPTEL_W9_ProAssign4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Declaring 5x5 2D char array to store input
        char act[][]= new char[5][5];
        // Declaring 5x5 2D char array to store reflection
        char ref[][]= new char[5][5];
        // Input the 5x5 2D Array using Scanner Class
        for(int L=0;L<5; L++) {
            String input = sc.nextLine();
            char seq[] = input.toCharArray();
            if(seq.length==5) {
                for(int i=0;i<5;i++)
                    act[L][i]=seq[i];
            }
        }
        // Performing the reflection operation
        for(int i=0; i<5;i++) {
            for(int j=0; j<5;j++)
                ref[i][j]=act[i][4-j];
        }
        // Output the 5x5 2D Reflection Array
        for(int i=0; i<5;i++) {
            for(int j=0; j<5;j++) {
                System.out.print(ref[i][j]);
            }
            System.out.println();
        }
    }// The main() method ends here
}// The main class end
