//Jeremy Glennon
//CSE 002
//10-9-15
//lab 07 encrypted x
//This program prints out an X pattern in a series of *'s in a grid
//that is sized to a number input by user
import java.util.Scanner;

public class encrypted_x
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int input = 0;
        int i;
        int j;
        int line;
        int position;
        boolean accept;
        String trash = "";
        String star = "*";
        String space = " ";
        System.out.print("Input an integer between 0-100: ");
        accept = scan.hasNextInt();
        trash = scan.next();
        if(accept == true)
        {
           input = Integer.parseInt(trash); 
        }
        if(accept == false || input > 100)
        {
            while(accept == false || input > 100)
            {
                System.out.println("Invalid Entry");
                System.out.print("Input an integer between 0-100: ");
                accept = scan.hasNextInt();
                trash = scan.next();
                input = Integer.parseInt(trash);
            }
            input = Integer.parseInt(trash);
        }
        //System.out.println(input);
        for(i = 0; i <= input; i++)
        {
            for(j = 0; j <= input; j++)
            {
                if(j == i)
                {
                    System.out.print(space);
                }
                else if (j == input - i )
                {
                    System.out.print(space);
                }
                else
                {
                    System.out.print(star);
                }
            }
            System.out.println("");
        }
    }
}