package com.company;
//File Handling in Java Insert, Update, Delete, Search, Sort and Display with collection in File
import java.util.*;
import java.io.*;

class Employee2 implements Serializable{
    int empno;
    String ename;
    int salary;

    Employee2(int empno, String ename, int salary){
        this.empno = empno;
        this.ename = ename;
        this.salary =salary;
    }
    public String toString(){
        return empno+" "+ename+" "+salary;
    }
}

public class CURDFileHandling {
    public static void main(String[] args) throws Exception{
        int choice = -1;
        Scanner s = new Scanner(System.in); // s object store the integer value
        Scanner s1 = new Scanner(System.in); // s1 object store the string value
        ArrayList<Employee2> al = new ArrayList<Employee2>(); // creating ArrayList for collecting input information form user

        File textFile = new File("employee2.txt"); // crating textFile for store data information to help of File object
        ObjectOutputStream oos = null; // creating oos object purpose for writing file
        ObjectInputStream ois = null; // creating oos object purpose for reading file

        ListIterator li = null; // creating li object purpose for ArrayList data show proper way on display case

        if(textFile.isFile()){ // if textFile is existing on location
            ois = new ObjectInputStream(new FileInputStream(textFile));
            al = (ArrayList<Employee2>)ois.readObject(); // write File object(textFile) data into ArrayList
            ois.close(); // after writing textFile closed
        }
        do{
            System.out.println("1.INSERT");
            System.out.println("2.DISPLAY");
            System.out.println("3.SEARCH");
            System.out.println("4.DELETE");
            System.out.println("5.UPDATE");
            System.out.println("6.SORT By EmpNo - On Screen");
            System.out.println("7.SORT By EmpNo - In File");
            System.out.println("8.SORT By EmpName - On Screen");
            System.out.println("9.SORT By EmpName - In File");
            System.out.println("10.SORT By Salary - Desc - On Screen");
            System.out.println("11.SORT By Salary Asc - In File");
            System.out.println("0.EXIT");
            System.out.print("Enter Your Choice : ");
            choice = s.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter how many employee you want : ");
                    int n = s.nextInt();

                    for (int i=0; i<n; i++) {
                        System.out.println("Enter Employee No: ");
                        int empno = s.nextInt();

                        System.out.println("Enter Employee Name: ");
                        String ename = s1.nextLine();

                        System.out.println("Enter Employee Salary: ");
                        int salary = s.nextInt();

                        al.add(new Employee2(empno, ename, salary));
                    }
                    oos = new ObjectOutputStream(new FileOutputStream(textFile));
                    oos.writeObject(al); // write ArrayList data into File object(textFile)
                    oos.close(); // after writing textFile closed
                    break;

                case 2:
                    if(textFile.isFile()){
                        ois = new ObjectInputStream(new FileInputStream(textFile));
                        al = (ArrayList<Employee2>)ois.readObject();
                        ois.close();

                        System.out.println("-------------------------------------");
                        li = al.listIterator();
                        while(li.hasNext())
                            System.out.println(li.next());
                        System.out.println("-------------------------------------");
                    }else{
                        System.out.println("File not Exists....!");
                    }
                    break;

                case 3:
                    if(textFile.isFile()){
                        ois = new ObjectInputStream(new FileInputStream(textFile));
                        al = (ArrayList<Employee2>)ois.readObject();
                        ois.close();

                        boolean found = false;
                        System.out.println("Enter empno to Search : ");
                        int empno = s.nextInt();
                        System.out.println("-------------------------------------");
                        li = al.listIterator();
                        while(li.hasNext()){
                            Employee2 e = (Employee2)li.next();
                            if(e.empno == empno){
                                System.out.println(e);
                                found = true;
                            }
                        }
                        if(!found)
                            System.out.println("Record Not Found...!");
                        System.out.println("-------------------------------------");
                    }else{
                        System.out.println("File not Exists....!");
                    }
                    break;
                case 4:
                    if(textFile.isFile()){
                        ois = new ObjectInputStream(new FileInputStream(textFile));
                        al = (ArrayList<Employee2>)ois.readObject();
                        ois.close();

                        boolean found = false;
                        System.out.print("Enter empno to Delete : ");
                        int empno = s.nextInt();
                        System.out.println("-------------------------------------");
                        li = al.listIterator();
                        while(li.hasNext()){
                            Employee2 e = (Employee2)li.next();
                            if(e.empno == empno){
                                li.remove();
                                found = true;
                            }
                        }
                        if(found){
                            oos = new ObjectOutputStream(new FileOutputStream(textFile));
                            oos.writeObject(al);
                            oos.close();
                            System.out.println("Record Deleted Successfully....!");
                        }
                        else{
                            System.out.println("Record Not Found...!");
                        }
                        System.out.println("-------------------------------------");
                    }else{
                        System.out.println("File not Exists....!");
                    }
                    break;
                case 5:
                    if(textFile.isFile()){
                        ois = new ObjectInputStream(new FileInputStream(textFile));
                        al = (ArrayList<Employee2>)ois.readObject();
                        ois.close();

                        boolean found = false;
                        System.out.print("Enter empno to Update : ");
                        int empno = s.nextInt();
                        System.out.println("-------------------------------------");
                        li = al.listIterator();
                        while(li.hasNext()){
                            Employee2 e = (Employee2)li.next();
                            if(e.empno == empno){
                                System.out.print("Enter New EmpName : ");
                                String ename = s1.nextLine();

                                System.out.print("Enter new Salary : ");
                                int sal = s.nextInt();
                                li.set(new Employee2(empno,ename,sal));
                                found = true;
                            }
                        }
                        if(found){
                            oos = new ObjectOutputStream(new FileOutputStream(textFile));
                            oos.writeObject(al);
                            oos.close();
                            System.out.println("Record Updated Successfully....!");
                        }
                        else{
                            System.out.println("Record Not Found...!");
                        }
                        System.out.println("-------------------------------------");
                    }else{
                        System.out.println("File not Exists....!");
                    }
                    break;
                case 6:
                    if(textFile.isFile()){
                        ois = new ObjectInputStream(new FileInputStream(textFile));
                        al = (ArrayList<Employee2>)ois.readObject();
                        ois.close();

                        Collections.sort(al, new Comparator<Employee2>(){
                            public int compare(Employee2 e1, Employee2 e2){
                                return e1.empno - e2.empno;
                            }
                        });

                        System.out.println("-------------------------------------");
                        li = al.listIterator();
                        while(li.hasNext())
                            System.out.println(li.next());
                        System.out.println("-------------------------------------");
                    }else{
                        System.out.println("File not Exists....!");
                    }
                    break;
                case 7:
                    if(textFile.isFile()){
                        ois = new ObjectInputStream(new FileInputStream(textFile));
                        al = (ArrayList<Employee2>)ois.readObject();
                        ois.close();

                        Collections.sort(al, new Comparator<Employee2>(){
                            public int compare(Employee2 e1, Employee2 e2){
                                return e1.empno - e2.empno;
                            }
                        });

                        oos = new ObjectOutputStream(new FileOutputStream(textFile));
                        oos.writeObject(al);
                        oos.close();

                        System.out.println("-------------------------------------");
                        li = al.listIterator();
                        while(li.hasNext())
                            System.out.println(li.next());
                        System.out.println("-------------------------------------");
                    }else{
                        System.out.println("File not Exists....!");
                    }
                    break;
                case 8:
                    if(textFile.isFile()){
                        ois = new ObjectInputStream(new FileInputStream(textFile));
                        al = (ArrayList<Employee2>)ois.readObject();
                        ois.close();

                        Collections.sort(al, new Comparator<Employee2>(){
                            public int compare(Employee2 e1, Employee2 e2){
                                return e1.ename.compareTo(e2.ename);
                            }
                        });

                        System.out.println("-------------------------------------");
                        li = al.listIterator();
                        while(li.hasNext())
                            System.out.println(li.next());
                        System.out.println("-------------------------------------");
                    }else{
                        System.out.println("File not Exists....!");
                    }
                    break;
                case 9:
                    if(textFile.isFile()){
                        ois = new ObjectInputStream(new FileInputStream(textFile));
                        al = (ArrayList<Employee2>)ois.readObject();
                        ois.close();

                        Collections.sort(al, new Comparator<Employee2>(){
                            public int compare(Employee2 e1, Employee2 e2){
                                return e1.ename.compareTo(e2.ename);
                            }
                        });

                        oos = new ObjectOutputStream(new FileOutputStream(textFile));
                        oos.writeObject(al);
                        oos.close();

                        System.out.println("-------------------------------------");
                        li = al.listIterator();
                        while(li.hasNext())
                            System.out.println(li.next());
                        System.out.println("-------------------------------------");
                    }else{
                        System.out.println("File not Exists....!");
                    }
                    break;
                case 10:
                    if(textFile.isFile()){
                        ois = new ObjectInputStream(new FileInputStream(textFile));
                        al = (ArrayList<Employee2>)ois.readObject();
                        ois.close();

                        Collections.sort(al, new Comparator<Employee2>(){
                            public int compare(Employee2 e1, Employee2 e2){
                                return e2.salary - e1.salary;
                            }
                        });

                        System.out.println("-------------------------------------");
                        li = al.listIterator();
                        while(li.hasNext())
                            System.out.println(li.next());
                        System.out.println("-------------------------------------");
                    }else{
                        System.out.println("File not Exists....!");
                    }
                    break;
                case 11:
                    if(textFile.isFile()){
                        ois = new ObjectInputStream(new FileInputStream(textFile));
                        al = (ArrayList<Employee2>)ois.readObject();
                        ois.close();

                        Collections.sort(al, new Comparator<Employee2>(){
                            public int compare(Employee2 e1, Employee2 e2){
                                return e1.salary - e2.salary;
                            }
                        });

                        oos = new ObjectOutputStream(new FileOutputStream(textFile));
                        oos.writeObject(al);
                        oos.close();

                        System.out.println("-------------------------------------");
                        li = al.listIterator();
                        while(li.hasNext())
                            System.out.println(li.next());
                        System.out.println("-------------------------------------");
                    }else{
                        System.out.println("File not Exists....!");
                    }
                    break;
            }
        }while (choice!=0);
    }
}
