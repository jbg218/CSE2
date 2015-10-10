/*Jeremy Glennon
CSE 002
lab 06
GettingLoopy
10-2-15
This program will use loops in order to print out series of numbers
the first series will go up to 7 and repeat 7
then different loops will be used to print prime numbers
from 10-100
*/
public class GettingLoopy
{
    public static void main(String[] args)
    {
        int sevenNum = 1;
        int sevenNum2 = (int)(Math.random()*11);
        System.out.println("STEP 1:");
        
        while(sevenNum < 7)
        {
            System.out.print(sevenNum);
            ++sevenNum;
        }
        while(sevenNum2 <= 10)
        {
            System.out.print(sevenNum);
            ++sevenNum2;
        }
        System.out.println("");
        //End of sevens
        System.out.println("STEP 2:");
        int primeNum = 10;
        int factor = 1;
        int factorNum = 0;
        System.out.print("While: ");
        while(primeNum < 100)
        {
            factorNum = 0;
            factor = 1;
            while(factor <= primeNum)
            {
                while(primeNum%factor == 0)
                {
                factorNum++;
                //System.out.println(factorNum + "FACOTRNUM");
                break;
                }
                factor++;
                //System.out.println(factor + "factor");
            }
            //System.out.println(primeNum + "number");
            while(factorNum ==2)
            {
                //System.out.println("");
                System.out.print(primeNum + " ");
                //System.out.println("");
                break;
            }
            primeNum++;
        }
        System.out.println("");
//do while loop
        primeNum = 10;
        //factor = 1;
        //factorNum = 0;
        System.out.print("Do While: ");
        do
        {
            factorNum = 0;
            factor = 1;
            if(factor <= primeNum)
            {
                //System.out.print(" A ");
                do
                {
                    if(primeNum%factor ==0)
                    {
                        //System.out.print(" B ");
                        do
                        {
                            factorNum++;
                            break;
                        }while(primeNum%factor == 0);
                    }
                    //System.out.print(" C ");
                    factor++;
                }while(factor <= primeNum);
            }
            if(factorNum ==2)
            {
                //System.out.print(" D ");
                do
                {
                    //System.out.print(" E ");
                    System.out.print(primeNum + " ");
                    break;
                }while( factorNum == 2);
            }
            primeNum++;
        }while( primeNum<100);
//For loop
        System.out.println("");
        System.out.print("For: ");
        int number;
        factorNum = 0;
        for(number = 10;number<=100;number++)
        {
            factorNum = 0;
            for(factor=1;factor<=number;factor++)
            {
                for(factorNum=factorNum;number%factor==0;factorNum++)
                {
                    factorNum++;
                    break;
                }
            }
            for(factorNum=factorNum;factorNum==2;factorNum++)
            {
                System.out.print(number + " ");
                break;
            }
        }
        System.out.println("");
        //Step 3
        System.out.println("STEP 3:");
        int symbolNum = (int)(Math.random()*196)+5;
        int lineNum = 0;
        //System.out.println(symbolNum);
        while(symbolNum>0)
        {
            System.out.print("~");
            --symbolNum;
            ++lineNum;
            while(lineNum==20)
            {
                System.out.println("");
                lineNum = 0;
            }
        }
        System.out.println("");
    }
}