// import 'MyClass' class from 'names' myPackage 
import myPackage.myClass;

public class testPackage {
   public static void main(String args[]) {  
     
      // Initializing the String variable 
      // with a value 
      String str = "Hello package! manager";
      
      // Creating an instance of class MyClass in 
      // the package.
      myClass obj = new myClass();
      
      obj.getNames(str);
   }
}