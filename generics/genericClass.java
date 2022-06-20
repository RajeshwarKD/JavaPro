class MyInfo<Data> {
    Data i;

    public Data getData() {
        return i;
    }

    public void setData(Data i) {
        this.i = i;
    }
}
public class genericClass {
    public static void main(String[] args) {
        MyInfo<String> m1 = new MyInfo<String>();
        MyInfo<Integer> m2 = new MyInfo<Integer>();
        m1.setData("Rahul");
        m2.setData(21);

        System.out.println("My name is "+m1.getData()+" and my age is "+m2.getData());
    }
}

//class MyInfo<Data1 , Data2> {
//    Data1 t1;
//    Data2 t2;
//
//    public Data1 getData1() {
//        return t1;
//    }
//
//    public Data2 getData2() {
//        return t2;
//    }
//
//    public void setData1(Data1 t1) {
//        this.t1 = t1;
//    }
//
//    public void setData2(Data2 t2) {
//        this.t2 = t2;
//    }
//}
//    public class genericClass {
//        public static void main(String[] args) {
//            MyInfo<String, Integer> m1 = new MyInfo<String, Integer>();
//            m1.setData1("Rahul");
//            m1.setData2(21);
//            System.out.println("My name is "+m1.getData1()+" and my age is "+m1.getData2());
//        }
//    }

