// The generic class, we can create a generic method that can accept any type of arguments.
// Here, the scope of arguments is limited to the method where it is declared.
// It allows static as well as non-static methods.

public class GenericMethod{
//    public void array(Integer[] n){
//        for (int i=0; i<n.length; i++)
//            System.out.println(n[i]);
//    }
//    public void array(String[] s){
//        for (int i=0; i<s.length; i++)
//            System.out.println(s[i]);
//    }
    public <Data> void array(Data[] d){
        for (int i=0; i<d.length; i++)
            System.out.println(d[i]);
    }

    public static void main(String[] args) {
        GenericMethod print = new GenericMethod();
        Integer[] intArray = {91, 92, 93, 94, 95};
        String[] strArray = {"India", "Pakistan", "Afghanistan", "Sri-Lanka", "Myanmar"};
        print.array(intArray);
        print.array(strArray);
    }
}