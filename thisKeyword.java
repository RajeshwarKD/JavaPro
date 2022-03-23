package com.company;

class thisKeyword{
    int x;

    // getter method of x
    public int getX(){
        return  x;
    }

    // display method of x
    public void display(){
        System.out.println(x);
    }
    // Constructor with a parameter
    thisKeyword(int x) {
        this.x = x; //this is a reference variable that refers to the current object.
    }
    // Call the constructor
    public static void main(String[] args) {
        thisKeyword obj = new thisKeyword(65);
        System.out.println(obj.getX());
        obj.display();
    }
}
