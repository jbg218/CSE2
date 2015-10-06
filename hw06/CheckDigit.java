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
        System.out.print("Enter a 10 digit barcode: ");
        int barcode = 0;
        String trash;
        boolean number = true;
        int x = 0;
        int length;
        number = myScan.hasNextInt();
        trash = myScan.nextLine();
        length = trash.length();
        if(length != 10)
        {
            trash = "0X00000000";
        }
        char last = trash.charAt(9);
        if(last == 'X')
        {
            trash = trash.replace("X","0");
            x = 1;
        }
        while((number == false || length != 10) && x == 0)
        {
            System.out.println("Invalid barcode.");
            System.out.print("Enter 10 Digit Barcode: ");
            number = myScan.hasNextDouble();
            if(number ==true)
            {
                trash  =myScan.next();
            }
            if(number == false)
            {
                trash = myScan.next();
            }
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
        while (number == true && length ==10 || x==1)
        {
            barcode = Integer.parseInt(trash);
            break;
        }
        System.out.println("");
        input = barcode;
        ten = input / 1000000000;
        //System.out.println("ten"+ten);
        input = input - (1000000000*ten);
        //System.out.println(input);
        nine = input / 100000000;
        //System.out.println("nine" +nine);
        input = input -(100000000*nine);
        //System.out.println(input);
        eight = input / 10000000;
        //System.out.println("eight" +eight);
        input = input - (10000000*eight);
        //System.out.println(input);
        seven = input / 1000000;
        //System.out.println("seven" +seven);
        input = input - (1000000*seven);
        //System.out.println(input);
        six = input / 100000;
        //System.out.println("six" +six);
        input = input - (100000*six);
        //System.out.println(input);
        five = input /10000;
        //System.out.println("five" +five);
        input  = input - (five *10000);
        //System.out.println(input);
        four = input / 1000;
        //System.out.println("four" +four);
        input = input -(1000*four);
        ///System.out.println(input);
        three = input /100;
        //System.out.println("three" +three);
        input = input - (100*three);
        //System.out.println(input);
        two = input / 10;
        //System.out.println("two" +two);
        input = input - (10*two);
        //System.out.println(input + " " + originalInput);
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