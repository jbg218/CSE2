//Jeremy Glennon
//CSE 002
//11-1-15
//HW 10 Shuffling
//This program randomly shuffles and deals a hand of cards and outputs the deck in order, shuffled and the hand

public class Shuffling
{
//The method randomizeHand gets the 5 cards out of the shuffled deck
    public static String[] randomizeHand(String[] cards)
    {
//Define variables to be used later
        String[] hand;
        hand = new String[52];
        int cardNum;
        int card0=0;
        int card1=0;
        int card2=0;
        int card3=0;
        int card4=0;
        for(int i =0;i<52;i++)
        {
//The first 5 cards go into the hand
            if(i<5)
            {
                cardNum = (int)(Math.random()*52);
//this checks for repeats of the card and runs again
                while(cardNum == card0||cardNum == card1||cardNum == card2||cardNum == card3||cardNum == card4)
                {
                    cardNum = (int)(Math.random()*52);
                }
                hand[i] = cards[cardNum];
                if(i ==0){card0 = cardNum;}
                if(i ==1){card1 = cardNum;}
                if(i ==2){card2 = cardNum;}
                if(i ==3){card3 = cardNum;}
                if(i ==4){card4 = cardNum;}
            }
//after that the array gets filled with spaces
            else
            {
                hand[i] = " ";
            }
        }
//returns the String[] which contains the 5 cards and spaces
        return hand;
    }
//This method shuffles the deck randomly 100 times
    public static void shuffle(String[] cards)
    {
        String temporary = "";
        int card1;
        int card2 = 0;
        for(int i=0;i<100;i++)
        {
//swaps the card at poition card1 with the first card and repeats 100 times
//where card1 is a random int everytime
            card1 = (int)(Math.random()*52);
            temporary = cards[card1];
            cards[card1]  =cards[0];
            cards[0] = temporary;
        }
    }
//This method simply prints the arrays
    public static void printArray(String[] cards)
    {
        for(int i =0; i < 52;i++)
        {
            System.out.print(cards[i] + " ");
        }
    }
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);
    //suits club, heart, spade or diamond
    String[] suitNames={"C","H","S","D"};   
    String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"};
    String[] cards = new String[52];
    String[] hand = new String[5];
    for (int i=0; i<52; i++)
    {
        cards[i]=rankNames[i%13]+suitNames[i/13];
    }
printArray(cards);
System.out.println("");
shuffle(cards);
System.out.println("Shuffled:");
printArray(cards);
hand = randomizeHand(cards);
System.out.println("");
System.out.println("Random Hand:");
printArray(hand);
System.out.println("");
  }
}
