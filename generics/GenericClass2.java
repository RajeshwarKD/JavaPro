class MyGen<T>{
    T obj;
    void add(T obj){
        this.obj=obj;
    }
    T get(){
        return obj;
    }
}
public class GenericClass2 {
    public static void main(String[] args) {
        MyGen<Integer> num = new MyGen<Integer>();
        num.add(2);
//        num.add("vivek");//Compile time error
        System.out.println(num.get());
    }
}
