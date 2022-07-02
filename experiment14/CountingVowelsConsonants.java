package com.company;
import java.util.Scanner;
import java.io.*;
public class CountingVowelsConsonants {
    public static void main(String[] args) {

        //Counter variable to store the count of vowels and consonant
        int vCount = 0, cCount = 0;

        try {
            FileReader fileReading = new FileReader("sentence.txt");
            Scanner sc = new Scanner(fileReading);
            while(sc.hasNextLine()){
                //Reading a file declared as string
                String sentence = sc.nextLine();
                System.out.println("The sentence is  :\n" +sentence);

                for (int i=0 ; i<sentence.length(); i++){
                    char ch = sentence.charAt(i);
                    //Checks whether a character is a vowel
                    if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'){
                        //Increments the vowel counter
                        vCount ++;
                    }
                    //Checks whether a character is a consonant
                    else if(ch >= 'a' && ch<='z') {
                        //Increments the consonant counter
                        cCount++;
                    }
                }
            }
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Number of vowels in the given sentence is: "+vCount);
        System.out.println("Number of consonants in the given sentence is: " + cCount);
    }
}
