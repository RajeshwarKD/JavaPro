package com.company;

class bookTheaterSeats{
    int totalSeats = 10;

    synchronized void bookSeats (int seats){
        if(totalSeats >= seats){
            System.out.println(seats + " Seats booked successfully");
            totalSeats = totalSeats-seats;
            System.out.println("Seats left : "+ totalSeats);
        }
        else {
            System.out.println("Sorry seats cannot be booked....!!!");
            System.out.println("Seats left : "+ totalSeats);
        }
    }
}
public class movieBookApp extends Thread {

    static bookTheaterSeats bookTicket;

    int seats;
    public void run(){
        bookTicket.bookSeats(seats);
    }

    public static void main(String[] args) {
        bookTicket =new bookTheaterSeats();

        movieBookApp deepak = new movieBookApp();
        deepak.seats =7;
        deepak.start();

        movieBookApp amit = new movieBookApp();
        amit.seats =6;
        amit.start();
    }
}
