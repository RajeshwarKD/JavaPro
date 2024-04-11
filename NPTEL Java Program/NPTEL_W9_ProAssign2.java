package com.company;

/*Complete the code to develop an ADVANCED CALCULATOR that emulates all the functions of the
GUI Calculator as shown in the image.
        Note the following points carefully:
        1. Use only double datatype to store all numeric values.
        2. Each button on the calculator should be operated by typing the characters from 'a' to 'p'.
        3. To calculate 25-6, User should input fjhkc (where, f for 2, j for 5, h for '-', k for 6 and c for '=' ).
        3. You may use the already defined function gui_map(char).
        4. Without '=', operations won't give output as shown in Input_2 and Output_2 example below.
        5. The calculator should be able to perform required operations on two operands as shown in the below example:*/
//Input Case 1      klgc

//Output Case 1      18.0
import java.util.*;
public class NPTEL_W9_ProAssign2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
// Write code below...
        char pattern[] = input.toCharArray();
        int f = 0;
        for (int i = 0; i < pattern.length; i++) {
            pattern[i] = gui_map(pattern[i]);
        }
        double operand1 = 0.0;
        String o1 = "";
        double operand2 = 0.0;
        String o2 = "";
        double ans = 0.0;
        outerloop:
        for (int i = 0; i < pattern.length; i++) {
            int r = 0;
            if (pattern[i] == '+' || pattern[i] == '-' || pattern
                    [i] == '/' || pattern[i] == 'X' || pattern[i] == '=') {
                for (int j = 0; j < i; j++) {
                    o1 += Character.toString(pattern[j]);
                }
                operand1 = Double.parseDouble(o1);
                for (int k = i + 1; k < pattern.length; k++) {
                    if (pattern[k] == '=') {
                        f = 1;
                        operand2 = Double.parseDouble(o2);
                        if (pattern[i] == '+') {
                            ans = operand1 + operand2;
                        } else if (pattern[i] == '-') {
                            ans = operand1 - operand2;
                        } else if (pattern[i] == '/') {
                            ans = operand1 / operand2;
                        } else if (pattern[i] == 'X') {
                            ans = operand1 * operand2;
                        }
                        break outerloop;
                    } else {
                        o2 += Character.toString(pattern[k]);
                    }
                }
            }
        }
        if (f == 1)
            System.out.print(ans);
    }// The main() method ends here.

    // A method that takes a character as input and returns the corresponding GUI character
    static char gui_map(char in) {
        char out = 'N';// N = Null/Empty
        char gm[][] = {{'a', '.'}
                , {'b', '0'}
                , {'c', '='}
                , {'d', '+'}
                , {'e', '1'}
                , {'f', '2'}
                , {'g', '3'}
                , {'h', '-'}
                , {'i', '4'}
                , {'j', '5'}
                , {'k', '6'}
                , {'l', 'X'}
                , {'m', '7'}
                , {'n', '8'}
                , {'o', '9'}
                , {'p', '/'}};
// Checking for maps
        for (int i = 0; i < gm.length; i++) {
            if (gm[i][0] == in) {
                out = gm[i][1];
                break;
            }
        }
        return out;
    }
}
