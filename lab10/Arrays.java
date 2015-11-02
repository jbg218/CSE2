//Jeremy glennon
//CSE 002
//10-31-15
//Lab 10 Arrays

//This program will create an array of strings of names and an array of grades
//and print out midterm grades for each student

import java.util.Scanner;

public class Arrays
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int nameSize = (int)(Math.random()*11);
        while (nameSize<5)
        {
            nameSize = (int)(Math.random()*11);
        }
        String[] name;
        name = new String[nameSize];
        System.out.println("Enter " + nameSize + " Students' names:");
        for(int i = 0;i<nameSize;i++)
        {
            name[i] = scan.next();
        }
        int[] grades;
        grades = new int[nameSize];
        for(int i = 0;i<nameSize;i++)
        {
            grades[i] = (int)(Math.random()*101);
        }
        System.out.println("Here are the Midterm Grades of the 5 Students Above:");
        for(int i = 0;i<nameSize;i++)
        {
            System.out.print(name[i]);
            System.out.print(": ");
            System.out.print(grades[i]);
            System.out.println("");
        }
    }
}