//Jeremy Glennon
//hw02 Arithmetic
//CSE 002
//Prints the total for a Walmart trip
//Compile the program
//  javac Arithmetic.java
//Then run the program
//  java Arithmetic
public class Arithmetic
{
    public static void main(String[] args)
    {
        int nSocks=3;
        double sockCost$=2.58;
        int nGlasses=6;
        double glassesCost$=2.29;
        int nEnvelopes=1;
        double envelopeCost$=3.25;
        double taxPercent=0.06;
        double totalSockCost$;
        double totalGlassesCost$;
        double totalEnvelopesCost$;
        double preTaxTotal;
        double taxTotal;
        double postTaxTotal;
        totalSockCost$=nSocks*sockCost$;
        totalGlassesCost$=nGlasses*glassesCost$;
        totalEnvelopesCost$=nEnvelopes*envelopeCost$;
        preTaxTotal=totalEnvelopesCost$+totalGlassesCost$+totalSockCost$;    
        postTaxTotal=preTaxTotal*1.06;
        taxTotal= preTaxTotal*0.06;
        preTaxTotal= (int) (preTaxTotal*100);
        postTaxTotal= (int) (postTaxTotal*100);
        taxTotal= (int) (taxTotal*100);
        preTaxTotal= (double) (preTaxTotal/100);
        postTaxTotal= (double) (postTaxTotal/100);
        taxTotal= (double) (taxTotal/100);
        System.out.println("The cost for socks is $"+totalSockCost$+".");
        System.out.println("The cost for glasses is $"+totalGlassesCost$+".");
        System.out.println("The cost for envelopes is $"+totalEnvelopesCost$+".");
        System.out.println("The total before tax is $"+preTaxTotal+".");
        System.out.println("The tax is $"+taxTotal+".");
        System.out.println("The total with tax is $"+postTaxTotal+".");
    }
}