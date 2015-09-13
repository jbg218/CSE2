//Jeremy Glennon
//CSE 002
//9-12-15
//Hw 03 Block
//This program computes the volume and surface area of a block
//when the length,width,and height of the block are input by the user
//First compile the program
//  javac Block.java
//Then run the program
//  java Block

//import the scanner so the program can accept input
import java.util.Scanner;
public class Block
{
    public static void main(String[] args)
    {
//Declare the scanner to be used in the program
        Scanner myScanner = new Scanner(System.in);
//Declare the variables to be used later
        double width;
        double height;
        double length;
        double volume;
        double surfaceArea;
//Prompt the user to input the height of the block
        System.out.print("Enter the height of the block:");
//Store the input as a double assigned to height
        height = myScanner.nextDouble();
//Prompt the user to enter the length of the block
        System.out.print("Enter the length of the block:");
//Store the input as a double assigned to length
        length = myScanner.nextDouble();
//Prompt the user to enter the width of the block
        System.out.print("Enter the width of the block:");
//Store the input as a double assigned to width
        width = myScanner.nextDouble();
//Multiply the three variables to calculate the volume as a double
        volume = length*width*height;
//Calculate surface area by adding 2 of each of the combinations:
//length*width, length*height, and width*height
        surfaceArea=(2*length*width)+(2*length*height)+(2*width*height);
//Print out the results
        System.out.println("The volume of the block is "+ volume);
        System.out.println("The surface area of the block is "+ surfaceArea);
    }
}