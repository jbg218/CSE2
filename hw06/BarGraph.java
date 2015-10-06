//Jeremy Glennon
//CSE 002
//10-3-15
//Hw 06 Bar Graph
//This program will calculate average input weekly spending and represent each days
//spending on a bar graph with symbols. It will also calculate the dailt average
//and estimated spending oevr 4 years with a fluctuaton weekly of +/- 20%
import java.util.Scanner;
public class BarGraph
{
    public static void main(String[] args)
    {
        Scanner myScan = new Scanner(System.in);
        double input;
        double monExpense = 0;
        double tuesExpense = 0;
        double wedExpense = 0;
        double thursExpense = 0;
        double friExpense = 0;
        double satExpense = 0;
        double sunExpense = 0;
        double average = 0;
        int weekNum = 0;
        double weekExpense;
        double total = 0;
        double percent;
        int monday;
        int tuesday;
        int wednesday;
        int thursday;
        int friday;
        int saturday;
        int sunday;
        int symbolNum=0;
        boolean number;
        String trash;
        //Start to accept input expenses
        System.out.print("Expenses for Monday: $");
//checks input for double format, if not acceptable returns false
        number = myScan.hasNextDouble();
//while inut is not a double, repeats asking and holds false input in trash
        while(number == false)
        {
            trash = myScan.nextLine();
            System.out.println("Invalid Entry. Try Again.");
            System.out.print("Expenses for Monday: $");
            number = myScan.hasNextDouble();
        }
//while input is double assigns it to the expense for that day and moves on
        while (number == true)
        {
            monExpense = myScan.nextDouble();
            break;
        }
//Tuesday Entry
        System.out.print("Expenses for Tuesday: $");
        number = myScan.hasNextDouble();
        trash = myScan.next();
        while(number == false)
        {
            trash = myScan.nextLine();
            System.out.println("Invalid Entry. Try Again.");
            System.out.print("Expenses for Tuesday: $");
            number = myScan.hasNextDouble();
        }
        while (number == true)
        {
            tuesExpense = myScan.nextDouble();
            break;
        }      
//Wednesday Entry
        System.out.print("Expenses for Wednesday: $");
        number = myScan.hasNextDouble();
        while(number == false)
        {
            trash = myScan.nextLine();
            System.out.println("Invalid Entry. Try Again.");
            System.out.print("Expenses for Wednesday: $");
            number = myScan.hasNextDouble();
        }
        while (number == true)
        {
            wedExpense = myScan.nextDouble();
            break;
        }
//Thursday entry
        System.out.print("Expenses for Thursday: $");
        number = myScan.hasNextDouble();
        while(number == false)
        {
            trash = myScan.nextLine();
            System.out.println("Invalid Entry. Try Again.");
            System.out.print("Expenses for Thursday: $");
            number = myScan.hasNextDouble();
        }
        while (number == true)
        {
            thursExpense = myScan.nextDouble();
            break;
        }  
//Friday entry
        System.out.print("Expenses for Friday: $");
        number = myScan.hasNextDouble();
        while(number == false)
        {
            trash = myScan.nextLine();
            System.out.println("Invalid Entry. Try Again.");
            System.out.print("Expenses for Friday: $");
            number = myScan.hasNextDouble();
        }
        while (number == true)
        {
            friExpense = myScan.nextDouble();
            break;
        }
//Saturday entry
        System.out.print("Expenses for Saturday: $");
        number = myScan.hasNextDouble();
        while(number == false)
        {
            trash = myScan.nextLine();
            System.out.println("Invalid Entry. Try Again.");
            System.out.print("Expenses for Saturday: $");
            number = myScan.hasNextDouble();
        }
        while (number == true)
        {
            satExpense = myScan.nextDouble();
            break;
        }
//Sunday entry
        System.out.print("Expenses for Sunday: $");
        number = myScan.hasNextDouble();
        while(number == false)
        {
            trash = myScan.nextLine();
            System.out.println("Invalid Entry. Try Again.");
            System.out.print("Expenses for Sunday: $");
            number = myScan.hasNextDouble();
        }
        while (number == true)
        {
            sunExpense = myScan.nextDouble();
            break;
        }
//Rounds expenses by subtracting integer value and checking if decimal is more than .50
        monday = (int) monExpense;
        if(monExpense-monday >= .50)
        {
            monday++;
        }
        tuesday = (int) tuesExpense;
        if(tuesExpense-tuesday >=.50)
        {
            tuesday++;
        }
        wednesday = (int) wedExpense;
        if(wedExpense-wednesday >=.50)
        {
            wednesday++;
        }
        thursday = (int) thursExpense;
        if(thursExpense-thursday >=.50)
        {
            thursday++;
        }
        friday = (int) friExpense;
        if(friExpense-friday >=.50)
        {
            friday++;
        }
        saturday = (int) satExpense;
        if(satExpense-saturday >=.50)
        {
            saturday++;
        }
        sunday = (int) sunExpense;
        if(sunExpense-sunday >=.50)
        {
            sunday++;
        }
        System.out.println("");
//System.out.print so asterisks can go on same line
        System.out.print("Mon:    ");
//use for loop to count up to the integer value of the expense and print that many asterisks
       for(symbolNum = 0; symbolNum<monday; symbolNum++)
        {
            System.out.print("*");
        }
        System.out.println("");
        System.out.print("Tues:   ");
        for(symbolNum = 0; symbolNum<tuesday; symbolNum++)
        {
            System.out.print("*");
        }
        System.out.println("");
        System.out.print("Wed:    ");
        for(symbolNum = 0; symbolNum<wednesday; symbolNum++)
        {
            System.out.print("*");
        }
        System.out.println("");
        System.out.print("Thu:    ");
        for(symbolNum = 0; symbolNum<thursday; symbolNum++)
        {
            System.out.print("*");
        }
        System.out.println("");
        System.out.print("Fri:    ");
        for(symbolNum = 0; symbolNum<friday; symbolNum++)
        {
            System.out.print("*");
        }
        System.out.println("");
        System.out.print("Sat:    ");
        for(symbolNum = 0; symbolNum<saturday; symbolNum++)
        {
            System.out.print("*");
        }
        System.out.println("");
        System.out.print("Sun:    ");
        for(symbolNum = 0; symbolNum<sunday; symbolNum++)
        {
            System.out.print("*");
        }
        System.out.println("");
//average is the expenses divided by 7
        average = monExpense + tuesExpense + wedExpense + thursExpense + friExpense + satExpense + sunExpense;
        average = average/7;
//format to two decimals
        average = (int) (average *100);
        average = (double) (average/100);
        System.out.println("Your average daily expense is: " +  average);
//This portion adds an average for the week give or take 20 percent for 4 years (208 weeks)
        while(weekNum<208)
        {
//the percent range is from -20 to 20 for a total of 40
            percent = (double) (Math.random()*40);
//0-20 are considered the -20 side so subtracting from 1 gives anywhere from 80-100%
            if(percent<20)
            {
                percent = 1-(percent/10);
                weekExpense = average*7*percent;
            }
//if percent = 20 its the average resulting in a 100% and just multiplying, no percentage difference
            else if(percent == 20)
            {
                weekExpense = average * 7;
            }
//percent >20 ranges from 100-120% of the average
//for example percent = 39 means a 19% increase so subtract 20 and then add it to 1 to multiply
            else
            {
                percent = percent-20;
                percent = 1+(percent/10);
                weekExpense = average*7*percent;
            }
//total adds each weekexpense and continually adds to the last amount
            total = total + weekExpense;
            weekNum++;
        }
        total=(int) (total*100);
        total = (double) (total/100);
        System.out.println("Estimated expenditure for 4 years: " + total);
        
    }
}