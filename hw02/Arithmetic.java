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
        double taxSocks$;
        double taxGlasses$;
        double taxEnvelopes$;
        double preTaxTotal$;
        double taxTotal$;
        double postTaxTotal$;
//Multiply the price by the amount to get the cost and tax of each item
        totalSockCost$=nSocks*sockCost$;
        totalGlassesCost$=nGlasses*glassesCost$;
        totalEnvelopesCost$=nEnvelopes*envelopeCost$;
        taxEnvelopes$=envelopeCost$*taxPercent*nEnvelopes;
        taxGlasses$=glassesCost$*taxPercent*nGlasses;
        taxSocks$=sockCost$*taxPercent*nSocks;
        //add all the item costs to get the total before taxes
        preTaxTotal$=totalEnvelopesCost$+totalGlassesCost$+totalSockCost$; 
//Add the total for each item plus its tax to get total cost
        postTaxTotal$=totalSockCost$+totalGlassesCost$+totalEnvelopesCost$+taxEnvelopes$+taxGlasses$+taxSocks$;
//Add all the taxes together to get the total tax
        taxTotal$= taxEnvelopes$+taxGlasses$+taxSocks$;
//multiply the doubles by 100 then convert to int
//convert back to double after dividing by 100
//this gives a less precise but more user friendly decimal value than leaving the double
        preTaxTotal$= (int) (preTaxTotal$*100);
        postTaxTotal$= (int) (postTaxTotal$*100);
        taxTotal$= (int) (taxTotal$*100);
        taxSocks$= (int) (taxSocks$*100);
        taxGlasses$= (int) (taxGlasses$*100);
        taxEnvelopes$= (int) (taxEnvelopes$*100);
        preTaxTotal$= (double) (preTaxTotal$/100);
        postTaxTotal$= (double) (postTaxTotal$/100);
        taxTotal$= (double) (taxTotal$/100);
        taxSocks$= (double) (taxSocks$/100);
        taxGlasses$= (double) (taxGlasses$/100);
        taxEnvelopes$= (double) (taxEnvelopes$/100);
//Print out the number of each item being bought and its price
//Also print out the total for each item 
//Print out the tax for each item
//as well as the total before and after tax and the total tax itself
        System.out.println(nSocks+" packs of socks are being bought at "+sockCost$+" per pack.");
        System.out.println(nGlasses+" glasses are being bought at $"+glassesCost$+" per glass.");
        System.out.println(+nEnvelopes+" envelope is being bought at $"+envelopeCost$+" per envelope.");
        System.out.println("The cost for "+nSocks+" packs of socks is $"+totalSockCost$+".");
        System.out.println("The cost for "+nGlasses+" glasses is $"+totalGlassesCost$+".");
        System.out.println("The cost for "+nEnvelopes+" envelope is $"+totalEnvelopesCost$+".");
        System.out.println("The tax for the socks is $"+(taxSocks$)+".");
        System.out.println("The tax for the glasses is $"+(taxGlasses$)+".");
        System.out.println("The tax for the envelope is $"+(taxEnvelopes$)+".");
        System.out.println("The total before tax is $"+preTaxTotal$+".");
        System.out.println("The total tax is $"+taxTotal$+".");
        System.out.println("The total with tax is $"+postTaxTotal$+".");
    }
}