// Java Collection - CRUD Operation (INSERT, UPDATE, DELETE, SEARCH and DISPLAY of Employee Collection)
package com.company;

import java.util.*;

class Employee1{
    private int empno;
    private String ename;
    private int salary;

    Employee1(int empno, String ename, int salary){
        this.empno = empno;
        this.ename = ename;
        this.salary =salary;
    }

    public int getEmpno(){
        return empno;
    }
    public int getSalary(){
        return salary;
    }
    public String getEname(){
        return ename;
    }

    public String toString(){
        return empno+" "+ename+" "+salary;
    }
}
public class CURDapplication {
    public static void main(String[] args) {

        List<Employee1> c = new ArrayList<Employee1>();

        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
         int choice;
         do{
             System.out.println("1.INSERT");
             System.out.println("2.DISPLAY");
             System.out.println("3.SEARCH");
             System.out.println("4.DELETE");
             System.out.println("5.UPDATE");
             System.out.println("Enter Your Choice : ");
             choice = s.nextInt();

             switch (choice){
                 case 1:
                     System.out.print("Enter EmpNo : ");
                     int eno = s.nextInt();
                     System.out.print("Enter EmpName : ");
                     String ename = s1.nextLine();
                     System.out.print("Enter EmpSalary : ");
                     int salary = s.nextInt();

                     c.add(new Employee1(eno,ename,salary));
                     break;

                 case 2:
                     System.out.println("----------------------------");
                     Iterator<Employee1> i = c.iterator();
                     while(i.hasNext()){
                         Employee1 e = i.next();
                         System.out.println(e);
                     }
                     System.out.println("----------------------------");
                     break;

                 case 3:
                     boolean found = false;
                     System.out.print("Enter Empno to Search :");
                     int empno = s.nextInt();
                     System.out.println("----------------------------");
                     i = c.iterator();
                     while(i.hasNext()){
                         Employee1 e = i.next();
                         if(e.getEmpno() == empno)  {
                             System.out.println(e);
                             found = true;
                         }
                     }

                     if(!found){
                         System.out.println("Record Not Found");
                     }
                     System.out.println("----------------------------");
                     break;

                 case 4:
                     found = false;
                     System.out.print("Enter Empno to Delete :");
                     empno = s.nextInt();
                     System.out.println("----------------------------");
                     i = c.iterator();
                     while(i.hasNext()){
                         Employee1 e = i.next();
                         if(e.getEmpno() == empno)  {
                             i.remove();
                             found = true;
                         }
                     }

                     if(!found){
                         System.out.println("Record Not Found");
                     }else{
                         System.out.println("Record is Deleted Successfully...!");
                     }

                     System.out.println("----------------------------");
                     break;

                 case 5:
                     found = false;
                     System.out.print("Enter Empno to Update :");
                     empno = s.nextInt();

                     ListIterator<Employee1>li = c.listIterator();
                     while(li.hasNext()){
                         Employee1 e = li.next();
                         if(e.getEmpno() == empno)  {
                             System.out.print("Enter new Name : ");
                             ename = s1.nextLine();

                             System.out.print("Enter new Salary : ");
                             salary = s.nextInt();
                             li.set(new Employee1(empno,ename,salary));
                             found = true;
                         }
                     }

                     if(!found){
                         System.out.println("Record Not Found");
                     }else{
                         System.out.println("Record is Updated Successfully...!");
                     }


                     break;
             }
         }while (choice!=0);
    }
}
