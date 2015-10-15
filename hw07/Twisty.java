//Jeremy Glennon
//CSE 002
//10-10-15
//hw 07 Twisty
//This program prints out a pattern of crossed #'s and /'s in a grid of size
//specified by input from user

import java.util.Scanner;

public class Twisty
{
    public static void main(String[] args)
    {
//Declare variables to be used later
        Scanner scan = new Scanner(System.in);
        int length;
        int width;
        int i;
        int j;
        int a;
        int b;
        int c;
        int d;
        int same1;
        int same2;
        String trash;
        boolean accept;
        int print;
//Prompt user for input and check to make sure input is integer less than or equal to 80
        System.out.print("Enter desired length: ");
        accept = scan.hasNextInt();
        trash = scan.next();
        while(accept == false)
        {
            System.out.println("Invalid Entry.");
            System.out.print("Enter Desired Length: ");
            accept = scan.hasNextInt();
            trash = scan.next();
        }
        length = Integer.parseInt(trash);
        while(length > 80)
        {
            System.out.println("Invalid Entry. Length must be less than or equal to 80.");
            System.out.print("Enter Desired Length: ");
            accept = scan.hasNextInt();
            trash = scan.next();
            length = Integer.parseInt(trash);
        }
        System.out.print("Enter Desired Width: ");
        accept = scan.hasNextInt();
        trash = scan.next();
        while(accept == false)
        {
            System.out.println("Invalid Entry.");
            System.out.print("Enter Desired Width: ");
            accept = scan.hasNextInt();
            trash = scan.next();
        }
        width = Integer.parseInt(trash);
        while(width>length)
        {
            System.out.println("Invalid Entry. Width must be smaller than Length.");
            System.out.print("Enter Desired Width: ");
            accept = scan.hasNextInt();
            trash = scan.next();
            width = Integer.parseInt(trash);
        }
//Start the printing according to the dimesions given
//i corresponds to the line number or width
        for(i = 1; i <= width; i++)
        {
//a, b , c , and d increase to account for patterns longer than one loop of two x patterns
//restart for each line
            a = 2;
            b = 1;
            c = 1;
            d = 1;
//j corresponds to length of the line
            for(j = 1;j<=length; j++)
            {
                print = 0;
                same1 = 0;
                same2 = 0;
//to get the x pattern, when j = i print out a symbol
                while( j == i)
                {
                    System.out.print("#");
                    print = 1;
                    same2 = 1;
                    break;
                }
//print out a symbol one width away from the first symbol
                while(j == i+width*a)
                {
                    System.out.print("#");
                    a++;
                    a++;
                    same2 = 1;
                    print = 1;
                    break;
                }
//print out a symbol next to the last symbol
                while(j == i+(width*b))
                {
                    System.out.print("\\");
                    b++;
                    b++;
                    print = 1;
                    same1 = 1;
                    break;
                }
//print out the decreasing side of the x pattern
                while(j == (1+(width*c))-i)
                {
                    if(same2 == 0)
                    {
                        System.out.print("/");
                    }
                    c++;
                    c++;
                    print = 1;
                    break;
                }
//print out the decreasing side of the second x pattern
                while(j == (1+(2*(width*d))-i))
                {
                    if(same1 == 0)
                    {
                        System.out.print("#");
                    }
                    d++;
                    print = 1;
                    break;
                }
//add spaces where symbols arent printed
                if(print == 0)
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}