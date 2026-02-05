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
