package com.company;
/*Complete the code to develop an extended version of the ADVANCED CALCULATOR with
added special functions that emulates all the functions of the GUI Calculator.*/
/*  Note the following points carefully:
          1. Use only double datatype to store all numeric values.
          2. Each button on the calculator should be operated by typing the characters form 'a' to 't'.
          3. You may use the already defined function gui_map(char).
          4. Use predefined method from java.lang.Math class wherever application.
          5. Without '=' binary operations won't give output as shown in Input_3 and Output_3 example below.
          6. The calculator should be able to perform required operations on one or two operands as shown in the below example:*/
//Input_1       okhid
//Input_2       ia
//Input_3       okhi

//Output_1      100.0
//Output_1      2.0
//Output_1      (Null/Empty)

import java.util.Scanner;
public class NPTEL_W12_ProAssign1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        // Write code below
        char seq[] = input.toCharArray();
        int outflag=0;

        for(int i=0; i<seq.length; i++){
            seq[i]=gui_map(seq[i]);
            if (seq[i]=='R' || seq[i]=='S' || seq[i]=='F' ||seq[i]=='C')
                break;
        }
        //Print Mapped GUI (remove comment to see the mapped sequence input)
		/*
		for(int i=0; i<seq.length; i++){
			System.out.print(seq[i]);
		}
		*/
        // Use double type of values for entire calculation
        double operand1=0.0;
        String o1="";
        double operand2=0.0;
        String o2="";
        double output=0.0;
        // Perform calculaton operations
        outerloop:
        for(int i=0; i<seq.length; i++){
            if(seq[i]=='C'){				//Clear
                operand1=0.0;
                operand2=0.0;
                output=0.0;
                outflag=0;
                break outerloop;
            }else if(seq[i]=='R'){			//Square Root
                for(int j=0; j<i; j++){
                    o1+=Character.toString(seq[j]);
                }
                operand1=Double.parseDouble(o1);
                output=Math.sqrt(operand1);
                outflag=1;
                break outerloop;
            }
            else if(seq[i]=='S'){			//Square
                for(int j=0; j<i; j++){
                    o1+=Character.toString(seq[j]);
                }
                operand1=Double.parseDouble(o1);
                output=Math.pow(operand1,2);
                outflag=1;
                break outerloop;
            }else if(seq[i]=='F'){			//Inverse
                for(int j=0; j<i; j++){
                    o1+=Character.toString(seq[j]);
                }
                operand1=Double.parseDouble(o1);
                output=Math.pow(operand1,-1);
                outflag=1;
                break outerloop;
            }else{
                int r=0;
                if(seq[i]=='+'||seq[i]=='-'||seq[i]=='/'||seq[i]=='*'||seq[i]=='='){
                    for(int j=0; j<i; j++){
                        o1+=Character.toString(seq[j]);
                    }
                    operand1=Double.parseDouble(o1);
                    for(int k=i+1; k<seq.length; k++){
                        if(seq[k]=='='){
                            outflag=1;
                            operand2=Double.parseDouble(o2);
                            if(seq[i]=='+'){
                                output=operand1+operand2;
                            }else if(seq[i]=='-'){
                                output=operand1-operand2;
                            }else if(seq[i]=='/'){
                                output=operand1/operand2;
                            }else if(seq[i]=='*'){
                                output=operand1*operand2;
                            }
                            break outerloop;
                        }else{
                            o2+=Character.toString(seq[k]);
                        }
                    }
                }
            }
        }
        // Check if output is available and print the output
        if(outflag==1)
            System.out.print(output);

    }// The main() method ends here.

    // A method that takes a character as input and returns the corresponding GUI character
    static char gui_map(char in){
        char out = 'N';// N = Null/Empty
        char gm[][]={{'a','R'}
                ,{'b','0'}
                ,{'c','.'}
                ,{'d','='}
                ,{'e','1'}
                ,{'f','2'}
                ,{'g','3'}
                ,{'h','+'}
                ,{'i','4'}
                ,{'j','5'}
                ,{'k','6'}
                ,{'l','-'}
                ,{'m','7'}
                ,{'n','8'}
                ,{'o','9'}
                ,{'p','*'}
                ,{'q','S'}
                ,{'r','F'}
                ,{'s','C'}
                ,{'t','/'}};
                    /* R = Square root
					C = Clear/Restart
					F = Fraction
					S = Square */

        // Checking for maps
        for(int i=0; i<gm.length; i++){
            if(gm[i][0]==in){
                out=gm[i][1];
                break;
            }
        }
        return out;
    }
}
