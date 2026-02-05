//4. Pass this as an Argument in a Method Call
//Used to send the current object to a method in a different class.

class EmpDetails {
  void display(Employee4 obj4) {
      System.out.println("Welcome to " + obj4.massage);
  }
}

class Employee4 {
    String massage = "Employee4";
    void show() {
        EmpDetails emp = new EmpDetails();
        emp.display(this); //Pass this as an Argument in a Method Call
    }
    public static void main(String[] args) {
        Employee4 obj4 = new Employee4();
        obj4.show();
    }
}
//sequenceDiagram
//participant M as main() Method
//participant E as Employee4 Object (this)
//participant D as EmpDetails Object
//M->>E: 1. obj4.show()
//activate E
//E->>D: 2. new EmpDetails()
//activate D
//Note right of D: Object created in memory
//E->>D: 3. emp.display(this)
//Note over E,D: 'this' sends the whole Employee4 object
//D->>E: 4. Access obj4.massage
//E-->>D: 5. Returns "Employee4"
//D-->>E: 6. Prints "Welcome to Employee4"
//deactivate D
//E-->>M: 7. Task Finished
//deactivate E