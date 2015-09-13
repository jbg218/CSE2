//Jeremy Glennon
//CSE 002
//9-12-15
//Hw 03 Timer
//Program has user input current time and time of dinner reservation
//outputs amount of time unitl dinner
//first compile the program
//  javac Timer.java
//then run the program
//  java Timer

//import the scanner for use in the program
import java.util.Scanner;

public class Timer
{
    public static void main(String[] args)
    {
//Declare the scanner so the program can accept input from the user
        Scanner myScanner = new Scanner(System.in);
//Declare the variables to be used later in the program
//Ints are used so we get only integer values and not decimals
        int currentTime;
        int dinnerTime;
        int hours;
        int minutes;
        int difference;
//Prompt the user to enter the current time
        System.out.print("Enter the current time:");
//Store their input as an int assigned to currentTime
        currentTime = myScanner.nextInt();
//Prompt the user to enter the dinner time
        System.out.print("Enter the time that you will be eating dinner:");
//Store their input as an int assigned to dinnerTime
        dinnerTime = myScanner.nextInt();
//Subtract the current time from the dinner time in order to get the time difference
        difference = dinnerTime - currentTime;
//Dividing the difference by 100 leaves an integer for the amount of hours left
        hours = difference/100;
//Using the % command we divide the hours out and are left with the remainder
//the remainder will be the integer value for the minutes left
        minutes = difference % 100;
//Print out the results of how long they have to wait
        System.out.println("You have "+hours+ " hours and "+minutes+" minutes until dinner.");
    }
}