//Jeremy Glennon
//CSE 002
//11-6-15
//This program gets input of 15 ints for CSE2 final grades
//then asks for an int and searches the array for the number
//then scrambles the array and asks for another int
//and tries to find it again
import java.util.Scanner;

public class CSE2Linear
{
//method to ask for unput and verify that entry is an int
    public static String askInput(int i)
    {
        System.out.print("Enter grade number " + (i+1) + ": ");
        Scanner scan = new Scanner(System.in);
        String input = "";
//check the entry and if it is not an int repeat asking until an int is entered
        boolean containsInt = scan.hasNextInt();
            while(containsInt == false)
            {
                System.out.println("Error. Input was not an int. Enter an Int.");
                System.out.print("Enter grade number " + (i+1) + ": ");
                //System.out.print("QWERTY ");
                input = scan.next();
                containsInt = scan.hasNextInt();
                //System.out.print("THERE ");
            }
            if(containsInt == true)
            {
                input = scan.next();
            }
//returns string input to the main method
            return input;
    }
    
//This method checks to see if the int entered is between 0 and 100
    public static int intCheck(String input, int i)
    {
        
        int number = Integer.parseInt(input);
        if(number < 0 || number > 100)
        {
//if int is outside of 0-100 it prints error message and calls askInput method for new input
//Then checks that int entry again for 0-100
            System.out.println("Error. Enter int between 0-100.");
            input = askInput(i);
            number = intCheck(input,i);
        }
//returns the nuber between 0-100 to main mathod
        return number;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
//create an int array of size 15
        int[] grades = new int[15];
        String input = "";
        System.out.println("Enter 15 ints for final grades(in increasing order) for CSE2 students.");
        for(int i = 0;i<15;i++)
        {
//calls the askInput method and intcheck input to verify input
            input = askInput(i);
            int number = intCheck(input,i);
            grades[i] = number;
//this if statement checks to make sure numbers are increasing, and if int is not
//repeats asking and checking until int between 0-100 and greater than or eaual to last is entered
            if(i>0)
            {
                while(grades[i]<grades[i-1])
                {
                    System.out.println("Error. Int must be greater ot equal to last int entered.");
                    input = askInput(i);
                    number = intCheck(input,i);
                    grades[i] = number;
                }
            }
            grades[i] = number;
        }
//Print the array
        System.out.print("The final grades for CSE are: ");
        for(int i=0;i<15;i++)
        {
            System.out.print(grades[i] + " ");
        }
        System.out.println("");
        System.out.print("Enter a grade to search for: ");
        String search = "";
//Verifies the search entry input 
        boolean containsInt = scan.hasNextInt();
        while(containsInt == false)
        {
            System.out.println("Error. Input was not an int. Enter an Int.");
            search = scan.next();
            containsInt = scan.hasNextInt();
        }
        if(containsInt == true)
        {
            search = scan.next();
        }
        int number = Integer.parseInt(search);
        while(number < 0 || number > 100)
        {
            System.out.println("Error.Enter int between 0-100.");
            containsInt = scan.hasNextInt();
            while(containsInt == false)
            {
                System.out.println("Error. Input was not an int. Enter an Int.");
                search = scan.next();
                containsInt = scan.hasNextInt();
            }
            if(containsInt == true)
            {
                search = scan.next();
            }
            number = Integer.parseInt(search);
        }
        int iterations = 0;
        int found = 0;
        for(int i = 0;i<15;i++)
        {
            iterations++;
            if(number == grades[i])
            {
                found = 1;
                break;
            }
        }
        if(found == 1)
        {
            System.out.println(number + " was found with " + iterations + " iterations.");
        }
        else
        {
            System.out.println(number + " was not found with " + iterations + " iterations.");
        }
//Shuffle
        for(int i = 0;i<50;i++)
        {
            int hold;
            int place = (int)(Math.random()*15);
            hold = grades[0];
            grades[0] = grades[place];
            grades[place] = hold;
        }
        System.out.println("Shuffled: ");
        for(int i=0;i<15;i++)
        {
            System.out.print(grades[i] + " ");
        }
        System.out.println("");
        System.out.print("Enter a grade to search for: ");
        //search = "";
        containsInt = scan.hasNextInt();
        while(containsInt == false)
        {
            System.out.println("Error. Input was not an int. Enter an Int.");
            search = scan.next();
            containsInt = scan.hasNextInt();
        }
        if(containsInt == true)
        {
            search = scan.next();
        }
        number = Integer.parseInt(search);
        while(number < 0 || number > 100)
        {
            System.out.println("Error.Enter int between 0-100.");
            containsInt = scan.hasNextInt();
            while(containsInt == false)
            {
                System.out.println("Error. Input was not an int. Enter an Int.");
                search = scan.next();
                containsInt = scan.hasNextInt();
            }
            if(containsInt == true)
            {
                search = scan.next();
            }
            number = Integer.parseInt(search);
        }
        iterations = 0;
        found = 0;
        for(int i = 0;i<15;i++)
        {
            iterations++;
            if(number == grades[i])
            {
                found = 1;
                break;
            }
        }
        if(found == 1)
        {
            System.out.println(number + " was found with " + iterations + " iterations.");
        }
        else
        {
            System.out.println(number + " was not found with " + iterations + " iterations.");
        }
    }
}