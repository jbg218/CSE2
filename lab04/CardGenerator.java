//Jeremy Glennon
//CSE 002
//9-18-15
//Lab 04 Card Generator
//This program randomly generates a number 1-52 and prints it out as a card
//1-13 are diamonds, 14-26 are clubs, 27-39 are hearts, and 40-52 are spades
//First compile the program
//  javac CardGenerator.java
//Then run the program
//  java CardGenerator

//
public class CardGenerator
{
    public static void main(String[] args)
    {
//Declare the variabels to be used alter
        String cardType;
        String cardName;
        int cardNumber;
//randomly produce a number between 1 and 52 inclusive
        cardNumber = (int)(Math.random()*53)+1;
//if the number is lower than 14 these sets are used to show the diamond cards
        if(cardNumber<14)
        {
            cardType = "diamonds";
//between 2 and 10 the number and card type is printed
            if(cardNumber <=10 && cardNumber >=2)
            {
                System.out.println("You pick the "+cardNumber+" of "+ cardType);
            }
//outside of 2 and 10 the cards require names (ace,jack,queen,king)
            else
            {
               switch(cardNumber)
               {
//These switch the number to the corresponding card name and print the card
                    case 1:
                       cardName = "ace";
                       System.out.println("You pick the "+cardName+" of "+ cardType);
                       break;
                    case 11:
                        cardName = "jack";
                        System.out.println("You pick the "+cardName+" of "+ cardType);
                        break;
                    case 12:
                        cardName = "queen";
                        System.out.println("You pick the "+cardName+" of "+ cardType);
                        break;
                    case 13:
                        cardName = "king";
                        System.out.println("You pick the "+cardName+" of "+ cardType);
                        break;
               }
            }
        }
        else if(cardNumber<27)
        {
            cardType = "clubs";
//decrease the number to 1-13 to run the same commands again for this new set of cards
            cardNumber= cardNumber-13;
           if(cardNumber <=10 && cardNumber >=2)
            {
                System.out.println("You pick the "+cardNumber+" of "+ cardType);
            }
            else
            {
               switch(cardNumber)
               {
                    case 1:
                       cardName = "ace";
                       System.out.println("You pick the "+cardName+" of "+ cardType);
                       break;
                    case 11:
                        cardName = "jack";
                        System.out.println("You pick the "+cardName+" of "+ cardType);
                        break;
                    case 12:
                        cardName = "queen";
                        System.out.println("You pick the "+cardName+" of "+ cardType);
                        break;
                    case 13:
                        cardName = "king";
                        System.out.println("You pick the "+cardName+" of "+ cardType);
                        break;
               }
            }
        }
        else if(cardNumber<40)
        {
            cardType = "hearts";
            cardNumber= cardNumber-26;
            if(cardNumber <=10 && cardNumber >=2)
            {
                System.out.println("You pick the "+cardNumber+" of "+ cardType);
            }
            else
            {
               switch(cardNumber)
               {
                    case 1:
                       cardName = "ace";
                       System.out.println("You pick the "+cardName+" of "+ cardType);
                       break;
                    case 11:
                        cardName = "jack";
                        System.out.println("You pick the "+cardName+" of "+ cardType);
                        break;
                    case 12:
                        cardName = "queen";
                        System.out.println("You pick the "+cardName+" of "+ cardType);
                        break;
                    case 13:
                        cardName = "king";
                        System.out.println("You pick the "+cardName+" of "+ cardType);
                        break;
               }
            }
        }
        else if(cardNumber<53)
        {
            cardType = "spades";
            cardNumber=cardNumber-39;
            if(cardNumber <=10 && cardNumber >=2)
            {
                System.out.println("You pick the "+cardNumber+" of "+ cardType);
            }
            else
            {
               switch(cardNumber)
               {
                    case 1:
                       cardName = "ace";
                       System.out.println("You pick the "+cardName+" of "+ cardType);
                       break;
                    case 11:
                        cardName = "jack";
                        System.out.println("You pick the "+cardName+" of "+ cardType);
                        break;
                    case 12:
                        cardName = "queen";
                        System.out.println("You pick the "+cardName+" of "+ cardType);
                        break;
                    case 13:
                        cardName = "king";
                        System.out.println("You pick the "+cardName+" of "+ cardType);
                        break;
               }
            }
        }
    }
}