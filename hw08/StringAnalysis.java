//Jeremy Glennon
//CSE 002
//10-17-15
//hw 08 String analysis
//This program analyzes a string in order to check if it contains letters

//Import the scanner to be used later
import java.util.Scanner;

public class StringAnalysis
{
//Creating the method check that will correspond to the selection of string
//the input requires a string and a string containing a number which will be converted to an int
    public static boolean check(String input, String number)
    {
        boolean letters = true;
       boolean charCheck;
       int num;
       int length;
       int i;
       int nonLetter = 0;
       Character letter;
//convert the string containing the number into an int
        num = Integer.parseInt(number);
           length = input.length();
//if the length of the string to be checked is shorter than the number input, 
//shorten the number to equal the length
           if(length<num)
           {
               num = length;
           }
//This for loop checks each position of the string for a character up to the length of the string
           for(i = 0; i<num; i++)
           {
                letter = input.charAt(i);
                charCheck = Character.isLetter(letter);
//If it contains a non-character it sets nonLetter to 1, indicating a string containgin non-characters
                if(charCheck == false)
                {
                    nonLetter = 1;
                }
           }
           if(nonLetter == 0)
           {
               letters = true;
           }
           if(nonLetter != 0)
           {
               letters = false;
           }
           return letters;
    }
//This method called check only requires the string as input so it checks the whole string
    public static boolean check(String input)
    {
        boolean letters = true;
       boolean charCheck;
       int length;
       int i;
       int nonLetter = 0;
       Character letter;
           length = input.length();
           for(i = 0; i<length; i++)
           {
                letter = input.charAt(i);
                charCheck = Character.isLetter(letter);
                if(charCheck == false)
                {
                    nonLetter = 1;
                }
           }
           if(nonLetter == 0)
           {
               letters = true;
           }
           if(nonLetter != 0)
           {
               letters = false;
           }
           return letters;
    }
    public static void main(String[] args)
    {
//declare variables to be used later in the main method
       String input = "";
       String number = "";
       String selection;
       boolean letters;
       boolean charCheck;
       int num;
       int length;
       int i;
       int nonLetter = 0;
       Character letter;
       Scanner scan = new Scanner(System.in);
// prompt the user to enter which type of analysis to use
       System.out.println("would you like to analyze a whole string or just a selection?");
       System.out.print("input WHOLE for whole string or SELECTION for just a selection: ");
       selection = scan.next();
//while the input doesnt match a condition, ask again
       while(selection.equals("WHOLE") == false && selection.equals("SELECTION") == false)
       {
           System.out.println("Invalid Entry.");
           System.out.print("input WHOLE for whole string or SELECTION for just a selection");
           selection = scan.next();
       }
       if(selection.equals("WHOLE"))
       {
           System.out.print("Enter a string to be analyzed: ");
           input = scan.next();
//call the method that erquires only 1 string and perform that method
           letters = check(input);
           if(letters == false)
           {
               System.out.println("The string contains characters other than letters.");
           }
           if(letters == true)
           {
               System.out.println("The string contains only characters.");
           }
       }
       if(selection.equals("SELECTION"))
       {
           
           System.out.print("Enter a string and how many characters you want to analyze Ex. (abcdef 3): ");
           input = scan.next();
           number = scan.next();
//call the method that requires both strings
           letters = check(input, number);
           if(letters == false)
           {
               System.out.println("The selection of the string contains characters other than letters.");
           }
           if(letters == true)
           {
               System.out.println("The selection of the string contains only characters.");
           }
       }
    }
}