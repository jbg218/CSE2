//Jeremy Glennon
//hw02 Arithmetic
//CSE 002
//Prints the total for a shopping trip, each item at a time and then in total
//Compile the program
//  javac Arithmetic.java
//Then run the program
//  java Arithmetic
public class Arithmetic
{
    public static void main(String[] args)
    {
//Declare the variables and prices given
        int nSocks=3;
        double sockCost$=2.58;
        int nGlasses=6;
        double glassesCost$=2.29;
        int nEnvelopes=1;
        double envelopeCost$=3.25;
        double taxPercent=0.06;
//Declare variables to be used later
        double totalSockCost$;
        double totalGlassesCost$;
        double totalEnvelopesCost$;
        double preTaxTotal;
        double taxTotal;
        double postTaxTotal;
//Multiply the price by the amount to get the cost of each item
        totalSockCost$=nSocks*sockCost$;
        totalGlassesCost$=nGlasses*glassesCost$;
        totalEnvelopesCost$=nEnvelopes*envelopeCost$;
//add all the costs to get the total before taxes
        preTaxTotal=totalEnvelopesCost$+totalGlassesCost$+totalSockCost$; 
//multiply the total by 1 plus the tax rate to get the total with tax
        postTaxTotal=preTaxTotal*1.06;
//multiply the total by the tax rate to get the total tax
        taxTotal= preTaxTotal*0.06;
//multiply the doubles by 100 then convert to int
//convert back to double then divide by 100
//this gives a better decimal value than leaving the double
        preTaxTotal= (int) (preTaxTotal*100);
        postTaxTotal= (int) (postTaxTotal*100);
        taxTotal= (int) (taxTotal*100);
        preTaxTotal= (double) (preTaxTotal/100);
        postTaxTotal= (double) (postTaxTotal/100);
        taxTotal= (double) (taxTotal/100);
//Print out the total for each item as well as the total before and after tax and the tax itself
        System.out.println("The cost for socks is $"+totalSockCost$+".");
        System.out.println("The cost for glasses is $"+totalGlassesCost$+".");
        System.out.println("The cost for envelopes is $"+totalEnvelopesCost$+".");
        System.out.println("The total before tax is $"+preTaxTotal+".");
        System.out.println("The tax is $"+taxTotal+".");
        System.out.println("The total with tax is $"+postTaxTotal+".");
    }
}