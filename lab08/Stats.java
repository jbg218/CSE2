//Jeremy Glennon
//CSE 002
//10-16-15
//lab 08 Stats
//This program uses methods to calculate and print out 
//the mean and median of a set of 5 doubles

import java.util.Scanner;

public class Stats
{
    public static double findMedian(double num1, double num2, double num3, double num4, double num5)
    {
        return num3;
    }
    public static double findMean(double num1, double num2, double num3, double num4, double num5)
    {
        double mean = (num1 + num2 + num3 + num4 + num5)/5;
        return mean;
    }
    public static void print(double mean, double median)
    {
        System.out.println("The mean is: " + mean);
        System.out.println("the median is: " + median);
    }
    public static void main(String[] args)
    {
        double num1;
        double num2;
        double num3;
        double num4;
        double num5;
        double mean;
        double median;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 5 doubles smallest to largest");
        System.out.print("Enter first double: ");
        num1 = scan.nextDouble();
        System.out.print("Enter second double: ");
        num2 = scan.nextDouble();
        while(num2 <= num1)
        {
            System.out.println("Invalid double.");
            System.out.print("Enter second double: ");
            num2 = scan.nextDouble();
        }
        System.out.print("Enter third double: ");
        num3 = scan.nextDouble();
         while(num3 <= num2 || num3 <= num1)
        {
            System.out.println("Invalid double.");
            System.out.print("Enter third double: ");
            num3 = scan.nextDouble();
        }
        System.out.print("Enter fourth double: ");
        num4 = scan.nextDouble();
         while(num4 <= num3 || num4 <= num2 || num3 <= num1)
        {
            System.out.println("Invalid double.");
            System.out.print("Enter fourth double: ");
            num4 = scan.nextDouble();
        }
        System.out.print("Enter fifth double: ");
        num5 = scan.nextDouble();
         while(num5 <= num4 || num5 <= num3 || num5 <= num2 || num5 <= num1)
        {
            System.out.println("Invalid double.");
            System.out.print("Enter fifth double: ");
            num5 = scan.nextDouble();
        }
        median = findMedian(num1,num2,num3,num4,num5);
        mean = findMean(num1,num2,num3,num4,num5);
        print(mean, median);
    }
}