//Jeremy Glennon
//CSE 002
//11-13-15
//hw 12 transpose
//this program generates a matrix of user inut width and height and prints it out in a rectangle
//then it swaps the columns and rows(transposes) and prints out the transposed array

import java.util.Scanner;

public class Transpose
{
//This method creates a random matrix with height member arrays each containg width members
//each given a value between -10 and 10
    public static int[][] randomMatrix(int width, int height)
    {
        int[][] matrix = new int[height][width];
        for(int i = 0;i<height;i++)
        {
            for(int j = 0;j<width;j++)
            {
                matrix[i][j] = (int)(Math.random()*19)-9;
            }
        }
        return matrix;
    }
//This method prints out the matrix given to it and adds a space to positive values
//to accomodate the - that is given to negative numbers to keep a rectangle shape
    public static void printMatrix(int[][] matrix,int height, int width)
    {
        for(int i = 0;i<height;i++)
        {
            for(int j = 0;j<width;j++)
            {
                if(matrix[i][j]>=0)
                {
                    System.out.print(" " + matrix[i][j] + " ");
                }
                else
                {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println("");
        }
    }
//This method prints out the transposed matrix much like the first
    public static void printMatrix2(int[][] matrix,int height, int width)
    {
        for(int i = 0;i<width;i++)
        {
            for(int j = 0;j<height;j++)
            {
                if(matrix[i][j]>=0)
                {
                    System.out.print(" " + matrix[i][j] + " ");
                }
                else
                {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println("");
        }
    }
//this method transposes the matrix 
    public static int[][] transposeMatrix(int[][] matrix,int height, int width)
    {
//creates a new multi-dimensional array to accomodate taking values from the original
        int[][] transposedMatrix = new int[width][height];
        for(int i = 0;i<width;i++)
        {
            for(int j = 0;j<height;j++)
            {
//adds values from each original row into a column
                transposedMatrix[i][j] = matrix[j][i];
            }
        }
        return transposedMatrix;
    }
    
    public static void main(String[] args)
    {
// declare variables
        String input;
        int width;
        int height;
//ask user for width and height of matrices and then checks input to make sure is positive int
        System.out.print("Enter positive int for width:");
        Scanner scan = new Scanner(System.in);
        boolean integerCheck = scan.hasNextInt();
        while(integerCheck == false)
        {
            System.out.print("Error. Enter an int: ");
            input = scan.next();
            integerCheck = scan.hasNextInt();
        }
        input = scan.next();
        width = Integer.parseInt(input);
        while(width<=0)
        {
            System.out.print("Error. Enter a positive int:");
            integerCheck = scan.hasNextInt();
            while(integerCheck == false)
            {
                System.out.print("Error. Enter an int: ");
                integerCheck = scan.hasNextInt();
            }
            input = scan.next();
            width = Integer.parseInt(input);
        }
        
        System.out.print("Enter positive int for height:");
        integerCheck = scan.hasNextInt();
        while(integerCheck == false)
        {
            System.out.print("Error. Enter an int: ");
            input = scan.next();
            integerCheck = scan.hasNextInt();
        }
        input = scan.next();
        height = Integer.parseInt(input);
        while(height<=0)
        {
            System.out.print("Error. Enter a positive int:");
            integerCheck = scan.hasNextInt();
            while(integerCheck == false)
            {
                System.out.print("Error. Enter an int: ");
                integerCheck = scan.hasNextInt();
            }
            input = scan.next();
            height = Integer.parseInt(input);
        }
//calls the method to create a matrix then prints it
        int[][] matrix = randomMatrix(width,height);
        printMatrix(matrix,height,width);
        System.out.println("Transposed:");
//calls the method to transpose the matrix and then prints it
        int[][] transposedMatrix = transposeMatrix(matrix,height,width);
        printMatrix2(transposedMatrix,height,width);
    }
}