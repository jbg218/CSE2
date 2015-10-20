//Jeremy Glennon
//CSE 002
//10-16-15
//hw 08 Area
//This program takes input from a user and find ands prints the area of
//either a circle, triangle, or rectangle
import java.util.Scanner;

public class Area
{
//This method is used to check that input is a double and is called for each number input
    public static double checkInput(boolean okay, String trash)
    {
        String shape = "";
        Scanner scan = new Scanner(System.in);
        double variable;
        while(okay == false)
        {
            System.out.print("Invalid. Enter double measurement: ");
            okay = scan.hasNextDouble();
            trash = scan.next();
        }
        return variable = Double.parseDouble(trash);
    }
//This method calculates the area of a circle with an input radius
    public static double circArea(boolean okay)
    {
        Scanner scan = new Scanner(System.in);
        double circRadius;
        double variable;
        double area;
        String trash = "";
        String shape = "";
        System.out.print("Enter radius of circle: ");
        okay = scan.hasNextDouble();
        trash = scan.next();
//calls the checkInput method to check that input is a double
        variable = checkInput(okay, trash);
        circRadius = variable;
        return area = (circRadius*circRadius)*3.14;
    }
//This method calculates the area of a triable given the dimensions
    public static double triArea(boolean okay)
    {
        Scanner scan = new Scanner(System.in);
        double triBase;
        double triHeight;
        double variable;
        double area;
        String trash = "";
        String shape = "";
        System.out.print("Enter base of triangle: ");
        okay = scan.hasNextDouble();
        trash = scan.next();
        variable = checkInput(okay, trash);
        triBase = variable;
        System.out.print("Enter height of triangle: ");
        okay = scan.hasNextDouble();
        trash = scan.next();
        variable = checkInput(okay, trash);
        triHeight = variable;
        return area = triHeight*triBase*0.5;
    }
//this method calculates the area of a rectangle given the dimensions
    public static double rectArea(boolean okay)
    {
        Scanner scan = new Scanner(System.in);
        double rectLength;
        double rectWidth;
        double variable;
        double area;
        String trash = "";
        String shape = "";
        System.out.print("Enter length of rectangle: ");
        okay = scan.hasNextDouble();
        trash = scan.next();
        variable = checkInput(okay, trash);
        rectLength = variable;
        System.out.print("Enter width of rectangle: ");
        okay = scan.hasNextDouble();
        trash = scan.next();
        variable = checkInput(okay, trash);
        rectWidth = variable;
        return area = rectWidth*rectLength;
    }
    public static void main(String[] args)
    {
//declare variables to be used later
        Scanner scan = new Scanner(System.in);
        String trash = "";
        String shape = "";
        String trash2 = "";
        double triBase;
        double triHeight;
        double rectLength;
        double rectWidth;
        double circRadius;
        double area = 0;
        double variable = 0;
        int acceptShape = 0; 
//prompt user to enter the shape desired
        System.out.print("Enter shape; circle, triangle, or rectangle: ");
        shape = scan.next();
//while the input doesnt match any shape ask again
        while(shape.equals("circle") == false && shape.equals("triangle") == false && shape.equals("rectangle") == false)
        {
            System.out.println("Invalid Entry.");
            System.out.print("Enter shape; circle, triangle, or rectangle: ");
            shape = scan.next();
        }
//calls the method circArea to calculate area of a circle
        if(shape.equals("circle"))
        {
            boolean okay = false;
            area = circArea(okay);
        }
//calls the method triArea to calculate the area of a triangle
        if(shape.equals("triangle"))
        {
            boolean okay = false;
            area = triArea(okay);
        }
//calls the method rectArea to calculate the area of a rectangle
        if(shape.equals("rectangle"))
        {
            boolean okay = false;
            area = rectArea(okay);
        }
//print out the results
        System.out.println("the area of the " + shape + " is: " + area);
    }
}