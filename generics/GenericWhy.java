// 1) Type-safety: We can hold only a single type of objects in generics.
// It does not allow to store other objects. Without Generics, we can store any type of objects.
// 2) Type casting is not required: There is no need to typecast the object.
// 3) Compile-Time Checking: It is checked at compile time so problem will not occur at runtime.
// The good programming strategy says it is far better to handle the problem at compile time than runtime.

// Java program to demonstrate that NOT using generics can cause run time exceptions.
// Using Java Generics converts run time exceptions into compile time exception.
// We don't need to typecast individual members of ArrayList
import java.util.*;

class GenericsWhy {
    public static void main(String[] args) {
        // Creatinga an ArrayList without any type specified
        ArrayList list = new ArrayList();

        list.add("Sachin");
        list.add("Rahul");
//      list.add(10); // Compiler allows this without checking

//      Before Generics, we need to type cast.
        String s1 = (String)list.get(0);
        String s2 = (String)list.get(1);
        System.out.println(s1);
        System.out.println(s2);
        // Causes Runtime Exception
//        String s3 = (String)list.get(2);

//      1) Type-safety: We can hold only a single type of objects in generics.
        // To create an instance of generic class
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Jai");
        list1.add("Veeru");
//        list1.add(420); // 3) Compile-Time Checking: Now Compiler doesn't allow this

        // 2) Type casting is not required:
        String s3 = list1.get(0);
        String s4 = list1.get(1);
        System.out.println(s3);
        System.out.println(s4);
    }
}
