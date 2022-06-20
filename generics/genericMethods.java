public class genericMethods {
//    public void array(String[] s){
//        for (int i=0; i<s.length; i++)
//            System.out.println(s[i]);
//    }
//    public void array(Integer[] n){
//        for (int i=0; i<n.length; i++)
//            System.out.println(n[i]);
//    }

    public <Data> void array(Data[] s){
        for (int i=0; i<s.length; i++)
            System.out.println(s[i]);
    }

    public static void main(String[] args) {
        genericMethods print = new genericMethods();
        String countries[] = {"India", "Nepal", "Bhutan"};
        Integer numbers[] = {12,35,55,77};
        print.array(countries);
        print.array(numbers);
    }
}
