import java.util.ArrayList;

class MyGeneric<T1, T2>{
    private T1 t1;
    private T2 t2;

    public MyGeneric(T1 t1, T2 t2) {
        this.t1 = t1;
        this.t2= t2;
    }
    public T1 getT1() {
        return t1;
    }
    public void setT1(T1 t1) {
        this.t1 = t1;
    }
    public T2 getT2() {
        return t2;
    }
    public void setT2(T2 t2) {
        this.t2 = t2;
    }

}
public class generics {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
//        ArrayList<int> arrayList = new ArrayList(); -- this will produce an error
//        arrayList.add("str1");
        arrayList.add(54);
        arrayList.add(643);
        int a = (int) arrayList.get(1);
        System.out.println(a);

        MyGeneric<String, Integer> g1 = new MyGeneric("MyString is my string ", 45);
        String str = g1.getT1();
        Integer int1 = g1.getT2();
        System.out.println(str + int1);
    }
}
