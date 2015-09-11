//Jeremy Glennon
//Lab 03 Check
//9-11-15
//CSE 002
//Program splits the bill between an amount of people
//after calculating tip and adding to total
//First compile program
//  javac Check.java
//The run program
//  java Check
//import the scanner to be used later
import java.util.Scanner;

public class Check
{
    public static void main(String[] args)
    {
        //Declare the scanner to be used later to accept user input
        Scanner myScanner = new Scanner( System.in );
        //Declare variables to be used later
        double totalCost;
        double costPerPerson;
        int dollars;
        int dimes;
        int pennies;
        //propt the user to enter the cost of dinner
        System.out.print("Enter the original cost of the check in the form xx.xx: ");
        //Set up the scanner to accept the next input as a double to be stored in checkCost
        double checkCost = myScanner.nextDouble();
        //Prompt the user to enter the tip percentage
        System.out.print("Enter the percentage tip that you wish to pay in the form xx: ");
        //Set up the scanner to attribute the next input as a double stored in tipPercent
        double tipPercent = myScanner.nextDouble();
        //divide to get the tip percent as a decimal
        tipPercent = tipPercent/100;
        //Prompt the user to enter the amount of people to split the bill with
        System.out.print("Enter the number of people who went out to diner: ");
        //Set up the scanner to attribute the next input as an int stored in numPeople
        int numPeople = myScanner.nextInt();
        //multiply the check cost by 1 plus the tip percent to get the total
        totalCost = checkCost * (1+tipPercent);
        //divide total by numer of poeple for cost per person
        costPerPerson= totalCost / numPeople;
        //convert costPerPerson to an int to give the amount of dollars
        dollars = (int) costPerPerson;
        //multiply by 10 so the first decimal of costPerPerson is the last integer digit
        // the % command devides by the next number (10) and returns the remainder
        // this gives the amount of dimes as an integer
        //Repeat the same thing with multiplying by 100 to get the penny amount
        dimes = (int) (costPerPerson * 10) % 10;
        pennies = (int) (costPerPerson * 100) % 10;
        //Print out the cost per person in dollars dimes and pennies
        System.out.println("Each person in the group owes $" + dollars +"."+dimes+pennies);
    }
}