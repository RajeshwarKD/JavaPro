package com.company;

/*Write suitable code to develop a 2D Flip-Flop Array with dimension 5 × 5,
which replaces all input elements with values 0 by 1 and 1 by 0. An example is shown below:
        Note the following points carefully:
        1. Here, the input must contain only 0 and 1.
        2. The input and output array size must be of dimension 5 × 5.
        3. Flip-Flop: If 0 then 1 and vice-versa.*/

//Input Case        00001
//                  00001
//                  00001
//                  00001
//                  00001

//Output Case        11110
//                   11110
//                   11110
//                   11110
//                   11110

import java.util.Scanner;
public class NPTEL_W9_ProAssign5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Declare the 5X5 2D array to store the input
        char act[][]= new char[5][5];
        // Input 2D Array using Scanner Class and check data validity
        for(int L=0;L<5; L++) {
            String input = sc.nextLine();
            char pat[] = input.toCharArray();
            if(pat.length==5){
                for(int i=0;i<5;i++) {
                    if(pat[i]=='0' || pat[i]=='1') {
                        act[L][i]=pat[i];
                        if(L==4 && i==4)
                            flipflop(act);
                    }
                    else {
                        System.out.print("Only 0 and 1 supported.");
                        break;
                    }
                }
            }
            else {
                System.out.print("Invalid length");
                break;
            }
        }
    }
    static void flipflop(char[][] flip) {
        // Perform the Flip-Flop Operation
        for(int i=0; i<5;i++) {
            for(int j=0; j<5;j++) {
                if(flip[i][j]=='1')
                    flip[i][j]='0';
                else
                    flip[i][j]='1';
            }
        }
        // Output the 2D FlipFlopped Array
        for(int i=0; i<5;i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(flip[i][j]);
            }
            System.out.println();
        }
    }// The main() ends here
}// The main class ends here
