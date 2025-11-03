package org.ruchiraLakshan;
import java.util.*;

 class Logger {

     //declare private static variable for instance
     public static Logger instance;

     //private constructor
     private Logger () {}

     public static Logger getInstance(){
         if (instance == null){
             instance = new Logger();
         }
         return instance;
     }

     //Method to print timestamped message
     public void display(){
         Date date = new Date();
         System.out.println("This is a Logger Instance :" + date);
     }
}


public class SingletonDemo {
    public static void main(String[] args) {
        // Try to get multiple instances
        Logger log1 = Logger.getInstance();
        Logger log2 = Logger.getInstance();

        log1.display();

        // Demonstrate that multiple calls return the same instance.
        if (log1 == log2) {
            System.out.println("Both log1 and log2 are return the same instance.");
        } else {
            System.out.println("Different instances exist!");
        }
    }
}


