package com.company;

 // This class represents a theater seat booking system.
 // It manages the total number of available seats and provides a synchronized method to book seats.

class bookTheaterSeats {
    int totalSeats = 10; // Total number of seats available in the theater
   
     // Synchronized method to book seats. Ensures that only one thread can access this method at a time, preventing race conditions.    
    synchronized void bookSeats(int seats) {
        if (totalSeats >= seats) {
            System.out.println(seats + " Seats booked successfully");
            totalSeats = totalSeats - seats; // Update the number of available seats
            System.out.println("Seats left : " + totalSeats);
        } else {
            System.out.println("Sorry, seats cannot be booked....!!!");
            System.out.println("Seats left : " + totalSeats);
        }
    }
}

 // This class represents a user (thread) trying to book seats in the theater. It extends the Thread class to enable multithreading.
public class movieBookApp extends Thread {

    static bookTheaterSeats bookTicket; // Shared instance of the seat booking system
    int seats; // Number of seats the user wants to book    
    
    // Overrides the run() method of the Thread class. This method is executed when the thread starts.
    public void run() {
        bookTicket.bookSeats(seats); // Attempt to book seats
    } 
    // Main method to test the seat booking system.  
    public static void main(String[] args) {
        bookTicket = new bookTheaterSeats(); // Initialize the seat booking system

        // Create a thread for user "Deepak" who wants to book 7 seats
        movieBookApp deepak = new movieBookApp();
        deepak.seats = 7;
        deepak.start(); // Start the thread

        // Create a thread for user "Amit" who wants to book 6 seats
        movieBookApp amit = new movieBookApp();
        amit.seats = 6;
        amit.start(); // Start the thread
    }
}
