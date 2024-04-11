package com.company;

import static com.company.ExtraLarge.extra;

/*The program in this assignment is attempted to print the following output:

-----------------OUTPUT-------------------
This is large
This is medium
This is small
This is extra-large
------------------------------------------------- */
interface ExtraLarge{
    static String extra = "This is extra-large";
    void display();
}

class Large {
    public void Print() {
        System.out.println("This is large");
    }
}

class Medium extends Large {
    public void Print() {
        super.Print();
        System.out.println("This is medium");
    }
}
class Small extends Medium {
    public void Print() {
        super.Print();
        System.out.println("This is small");
    }
}
public class NPTEL_W4_ProAssign3 {
    public static void main(String[] args) {
        Small s = new Small();
        s.Print();
        NPTEL_W4_ProAssign3 q = new NPTEL_W4_ProAssign3();
        q.display();
    }
    public void display(){
        System.out.println(extra);
    }
}
