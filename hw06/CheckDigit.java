//Jeremy Glennon
//CSE 002
//10-3-15
//Hw 06 Check Digit
//This program checks a 10 digit barcode for accuracy and validity
//if it is not valid, returns a check digit that would make it valid
import java.util.Scanner;

public class CheckDigit
{
    public static void main(String[] args)
    {
//Declare the variables to be used later
        Scanner myScan = new Scanner(System.in);
        int originalInput;
        int input;
        int ten;
        int nine;
        int eight;
        int seven;
        int six;
        int five;
        int four;
        int three;
        int two;
        int remainder = 0;
        int value;
        int checkDigit;
        int barcode = 0;
        String trash;
        boolean number = true;
        int x = 0;
        int length;
//Prompt the user for input
        System.out.print("Enter a 10 digit barcode: ");
//Check that the input is a number and return true or false in number
        number = myScan.hasNextInt();
//assign the input to the string trash
        trash = myScan.nextLine();
// check the length of the string to see if it is 10 characters
        length = trash.length();
//if it is too short, replace it with a string that will fail the number check but will
//provide a character for the last digit check later (char last = trash.charAt(9))
        if(length != 10)
        {
            trash = "0X00000000";
        }
        char last = trash.charAt(9);
//Since the last digit can be X for 10, have to replace it with a number so it passes the number check
        if(last == 'X')
        {
            trash = trash.replace("X","0");
            x = 1;
        }
//If the digit fails the checks for number, length, or last digit is X it repeats and asks for input
        while((number == false || length != 10) && x == 0)
        {
            System.out.println("Invalid barcode.");
            System.out.print("Enter 10 Digit Barcode: ");
            number = myScan.hasNextDouble();
            trash = myScan.next();
            length = trash.length();
            if(length != 10)
            {
                trash = "0X00000000";
            }
            last = trash.charAt(9);
            if(last == 'X')
            {
                trash = trash.replace("X","0");
                x = 1;
            }
        }
//If the barcode passes the checks, convert the string to a integer
        while (number == true && length ==10 || x==1)
        {
            barcode = Integer.parseInt(trash);
            break;
        }
        System.out.println("");
        input = barcode;
//divides the barcode to get an integer at each digit and then subtracts from input to go to next digit
        ten = input / 1000000000;
        input = input - (1000000000*ten);
        nine = input / 100000000;
        input = input -(100000000*nine);
        eight = input / 10000000;
        input = input - (10000000*eight);
        seven = input / 1000000;
        input = input - (1000000*seven);
        six = input / 100000;
        input = input - (100000*six);
        five = input /10000;
        input  = input - (five *10000);
        four = input / 1000;
        input = input -(1000*four);
        three = input /100;
        input = input - (100*three);
        two = input / 10;
        input = input - (10*two);
//If the last digit was X (x ==1), it was changed to 0 so remainder has to be changed to 10
        if(x == 0)
        {
            remainder = input;
        }
        if(x ==  1)
        {
            remainder = 10;
        }
        value = (ten*10) + (nine*9) + (eight*8) + (seven*7) + (six*6) + (five*5) + (four*4) + (three*3) + (two*2);
        checkDigit = value%11;
        String digit = "X";
        if(checkDigit == remainder)
        {
            System.out.println("Valid ISBN.");
        }
         if(checkDigit != remainder && checkDigit != 10)
        {
            System.out.println("Not a valid ISBN.");
            System.out.println("Check Digit should be "+ checkDigit);
        }
        if(checkDigit != remainder && checkDigit == 10)
        {
            System.out.println("Not a valid ISBN.");
            System.out.println("Check Digit should be "+ digit);
        }
    }
}