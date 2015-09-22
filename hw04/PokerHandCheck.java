//Jeremy Glennon
//CSE 002
//9-20-15
//Homework 04 poker hand check
//This program analyzes a random set of 5 cards for pairs, two pairs, three of kind,
//or high card hands.
//First compile the program
//  javac PokerHandCheck.java
//Then run the program
//  java PokerHandCheck

public class PokerHandCheck
{
    public static void main(String[] args)
    {
        //Declare variables to be used later
        int card1;
        int card2;
        int card3;
        int card4;
        int card5;
        int pairNum = 0;
        int threeKindNum = 0;
        boolean pair;
        boolean twoPair;
        boolean threeKind;
        boolean highCardHand;
        String card1Name;
        String card2Name;
        String card3Name;
        String card4Name;
        String card5Name;
        String card1Type;
        String card2Type;
        String card3Type;
        String card4Type;
        String card5Type;
//Use math.random to get a random integer between 0 and 52, not inclusive
//Add 1 so the actual range goes from 1 to 52 inclusive to cover all cards
        card1 = (int)(Math.random()*52)+1;
        card2 = (int)(Math.random()*52)+1;
        card3 = (int)(Math.random()*52)+1;
        card4 = (int)(Math.random()*52)+1;
        card5 = (int)(Math.random()*52)+1;
//Start of renaming cards and printing
//Set limits for each suit, 13 cards each
        if(card1<14)
        {
            card1Type = "diamonds";
//cards between 2 and 10 inclusive print out the card result
            if(card1 <=10 && card1 >=2)
            {
                System.out.println("You pick the "+card1+" of "+ card1Type);
            }
//Outside of 2 and 10 you use a switch to name the cards
            switch(card1)
            {
                case 1:
                    card1Name = "ace";
                     System.out.println("You pick the "+card1Name+" of "+ card1Type);
                       break;
                    case 11:
                        card1Name = "jack";
                         System.out.println("You pick the "+card1Name+" of "+ card1Type);
                        break;
                    case 12:
                        card1Name = "queen";
                         System.out.println("You pick the "+card1Name+" of "+ card1Type);
                        break;
                    case 13:
                        card1Name = "king";
                         System.out.println("You pick the "+card1Name+" of "+ card1Type);
                        break;
            }
        }
//The same thing happens for clubs as diamonds
        else if(card1<27)
        {
            card1Type = "clubs";
//Decrease the cards to 1-13 so they can be paired later
            card1= card1-13;
            if(card1 <=10 && card1 >=2)
            {
                System.out.println("You pick the "+card1+" of "+ card1Type);
            }
           switch(card1)
            {
                case 1:
                    card1Name = "ace";
                     System.out.println("You pick the "+card1Name+" of "+ card1Type);
                       break;
                    case 11:
                        card1Name = "jack";
                         System.out.println("You pick the "+card1Name+" of "+ card1Type);
                        break;
                    case 12:
                        card1Name = "queen";
                         System.out.println("You pick the "+card1Name+" of "+ card1Type);
                        break;
                    case 13:
                        card1Name = "king";
                         System.out.println("You pick the "+card1Name+" of "+ card1Type);
                        break;
            }
        }
//Same as diamonds and clubs
        else if(card1<40)
        {
            card1Type = "hearts";
            card1= card1-26;
            if(card1 <=10 && card1 >=2)
            {
                System.out.println("You pick the "+card1+" of "+ card1Type);
            }
            switch(card1)
            {
                case 1:
                    card1Name = "ace";
                     System.out.println("You pick the "+card1Name+" of "+ card1Type);
                       break;
                    case 11:
                        card1Name = "jack";
                         System.out.println("You pick the "+card1Name+" of "+ card1Type);
                        break;
                    case 12:
                        card1Name = "queen";
                         System.out.println("You pick the "+card1Name+" of "+ card1Type);
                        break;
                    case 13:
                        card1Name = "king";
                         System.out.println("You pick the "+card1Name+" of "+ card1Type);
                        break;
            }
        }
//Same as diamonds, clubs, and hearts
        else if(card1<53)
        {
            card1Type = "spades";
            card1=card1-39;
            if(card1 <=10 && card1 >=2)
            {
                System.out.println("You pick the "+card1+" of "+ card1Type);
            }
            switch(card1)
            {
                case 1:
                    card1Name = "ace";
                     System.out.println("You pick the "+card1Name+" of "+ card1Type);
                       break;
                    case 11:
                        card1Name = "jack";
                         System.out.println("You pick the "+card1Name+" of "+ card1Type);
                        break;
                    case 12:
                        card1Name = "queen";
                         System.out.println("You pick the "+card1Name+" of "+ card1Type);
                        break;
                    case 13:
                        card1Name = "king";
                        System.out.println("You pick the "+card1Name+" of "+ card1Type);
                        break;
            }
        }
//Repeat steps from card 1 for card 2
        if(card2<14)
        {
            card2Type = "diamonds";
            if(card2 <=10 && card2 >=2)
            {
                System.out.println("You pick the "+card2+" of "+ card2Type);
            }
            switch(card2)
            {
                case 1:
                    card2Name = "ace";
                     System.out.println("You pick the "+card2Name+" of "+ card2Type);
                       break;
                    case 11:
                        card2Name = "jack";
                         System.out.println("You pick the "+card2Name+" of "+ card2Type);
                        break;
                    case 12:
                        card2Name = "queen";
                         System.out.println("You pick the "+card2Name+" of "+ card2Type);
                        break;
                    case 13:
                        card2Name = "king";
                         System.out.println("You pick the "+card2Name+" of "+ card2Type);
                        break;
            }
        }
        else if(card2<27)
        {
            card2Type = "clubs";
            card2= card2-13;
            if(card2 <=10 && card2 >=2)
            {
                System.out.println("You pick the "+card2+" of "+ card2Type);
            }
           switch(card2)
            {
                case 1:
                    card2Name = "ace";
                     System.out.println("You pick the "+card2Name+" of "+ card2Type);
                       break;
                    case 11:
                        card2Name = "jack";
                         System.out.println("You pick the "+card2Name+" of "+ card2Type);
                        break;
                    case 12:
                        card2Name = "queen";
                         System.out.println("You pick the "+card2Name+" of "+ card2Type);
                        break;
                    case 13:
                        card2Name = "king";
                         System.out.println("You pick the "+card2Name+" of "+ card2Type);
                        break;
            }
        }
        else if(card2<40)
        {
            card2Type = "hearts";
            card2= card2-26;
            if(card2 <=10 && card2 >=2)
            {
                System.out.println("You pick the "+card2+" of "+ card2Type);
            }
            switch(card2)
            {
                case 1:
                    card2Name = "ace";
                     System.out.println("You pick the "+card2Name+" of "+ card2Type);
                       break;
                    case 11:
                        card2Name = "jack";
                         System.out.println("You pick the "+card2Name+" of "+ card2Type);
                        break;
                    case 12:
                        card2Name = "queen";
                         System.out.println("You pick the "+card2Name+" of "+ card2Type);
                        break;
                    case 13:
                        card2Name = "king";
                         System.out.println("You pick the "+card2Name+" of "+ card2Type);
                        break;
            }
        }
        else if(card2<53)
        {
            card2Type = "spades";
            card2=card2-39;
            if(card2 <=10 && card2 >=2)
            {
                System.out.println("You pick the "+card2+" of "+ card2Type);
            }
            switch(card2)
            {
                case 1:
                    card2Name = "ace";
                     System.out.println("You pick the "+card2Name+" of "+ card2Type);
                       break;
                    case 11:
                        card2Name = "jack";
                         System.out.println("You pick the "+card2Name+" of "+ card2Type);
                        break;
                    case 12:
                        card2Name = "queen";
                         System.out.println("You pick the "+card2Name+" of "+ card2Type);
                        break;
                    case 13:
                        card2Name = "king";
                         System.out.println("You pick the "+card2Name+" of "+ card2Type);
                        break;
            }
        }
//Repeat for card 3
        if(card3<14)
        {
            card3Type = "diamonds";
            if(card3 <=10 && card3 >=2)
            {
                System.out.println("You pick the "+card3+" of "+ card3Type);
            }
            switch(card3)
            {
                case 1:
                    card3Name = "ace";
                     System.out.println("You pick the "+card3Name+" of "+ card3Type);
                       break;
                    case 11:
                        card3Name = "jack";
                         System.out.println("You pick the "+card3Name+" of "+ card3Type);
                        break;
                    case 12:
                        card3Name = "queen";
                         System.out.println("You pick the "+card3Name+" of "+ card3Type);
                        break;
                    case 13:
                        card3Name = "king";
                         System.out.println("You pick the "+card3Name+" of "+ card3Type);
                        break;
            }
        }
        else if(card3<27)
        {
            card3Type = "clubs";
            card3= card3-13;
            if(card3 <=10 && card3 >=2)
            {
                System.out.println("You pick the "+card3+" of "+ card3Type);
            }
           switch(card3)
            {
                case 1:
                    card3Name = "ace";
                     System.out.println("You pick the "+card3Name+" of "+ card3Type);
                       break;
                    case 11:
                        card3Name = "jack";
                         System.out.println("You pick the "+card3Name+" of "+ card3Type);
                        break;
                    case 12:
                        card3Name = "queen";
                         System.out.println("You pick the "+card3Name+" of "+ card3Type);
                        break;
                    case 13:
                        card3Name = "king";
                         System.out.println("You pick the "+card3Name+" of "+ card3Type);
                        break;
            }
        }
        else if(card3<40)
        {
            card3Type = "hearts";
            card3= card3-26;
            if(card3 <=10 && card3 >=2)
            {
                System.out.println("You pick the "+card3+" of "+ card3Type);
            }
            switch(card3)
            {
                case 1:
                    card3Name = "ace";
                     System.out.println("You pick the "+card3Name+" of "+ card3Type);
                       break;
                    case 11:
                        card3Name = "jack";
                         System.out.println("You pick the "+card3Name+" of "+ card3Type);
                        break;
                    case 12:
                        card3Name = "queen";
                         System.out.println("You pick the "+card3Name+" of "+ card3Type);
                        break;
                    case 13:
                        card3Name = "king";
                         System.out.println("You pick the "+card3Name+" of "+ card3Type);
                        break;
            }
        }
        else if(card3<53)
        {
            card3Type = "spades";
            card3=card3-39;
            if(card3 <=10 && card3 >=2)
            {
                System.out.println("You pick the "+card3+" of "+ card3Type);
            }
            switch(card3)
            {
                case 1:
                    card3Name = "ace";
                     System.out.println("You pick the "+card3Name+" of "+ card3Type);
                       break;
                    case 11:
                        card3Name = "jack";
                         System.out.println("You pick the "+card3Name+" of "+ card3Type);
                        break;
                    case 12:
                        card3Name = "queen";
                         System.out.println("You pick the "+card3Name+" of "+ card3Type);
                        break;
                    case 13:
                        card3Name = "king";
                         System.out.println("You pick the "+card3Name+" of "+ card3Type);
                        break;
            }
        }
//Repeat for card 4
        if(card4<14)
        {
            card4Type = "diamonds";
            if(card4 <=10 && card4 >=2)
            {
                System.out.println("You pick the "+card4+" of "+ card4Type);
            }
            switch(card4)
            {
                case 1:
                    card4Name = "ace";
                     System.out.println("You pick the "+card4Name+" of "+ card4Type);
                       break;
                    case 11:
                        card4Name = "jack";
                         System.out.println("You pick the "+card4Name+" of "+ card4Type);
                        break;
                    case 12:
                        card4Name = "queen";
                         System.out.println("You pick the "+card4Name+" of "+ card4Type);
                        break;
                    case 13:
                        card4Name = "king";
                         System.out.println("You pick the "+card4Name+" of "+ card4Type);
                        break;
            }
        }
        else if(card4<27)
        {
            card4Type = "clubs";
            card4= card4-13;
            if(card4 <=10 && card4 >=2)
            {
                System.out.println("You pick the "+card4+" of "+ card4Type);
            }
           switch(card4)
            {
                case 1:
                    card4Name = "ace";
                     System.out.println("You pick the "+card4Name+" of "+ card4Type);
                       break;
                    case 11:
                        card4Name = "jack";
                         System.out.println("You pick the "+card4Name+" of "+ card4Type);
                        break;
                    case 12:
                        card4Name = "queen";
                         System.out.println("You pick the "+card4Name+" of "+ card4Type);
                        break;
                    case 13:
                        card4Name = "king";
                         System.out.println("You pick the "+card4Name+" of "+ card4Type);
                        break;
            }
        }
        else if(card4<40)
        {
            card4Type = "hearts";
            card4= card4-26;
            if(card4 <=10 && card4 >=2)
            {
                System.out.println("You pick the "+card4+" of "+ card4Type);
            }
            switch(card4)
            {
                case 1:
                    card4Name = "ace";
                     System.out.println("You pick the "+card4Name+" of "+ card4Type);
                       break;
                    case 11:
                        card4Name = "jack";
                         System.out.println("You pick the "+card4Name+" of "+ card4Type);
                        break;
                    case 12:
                        card4Name = "queen";
                         System.out.println("You pick the "+card4Name+" of "+ card4Type);
                        break;
                    case 13:
                        card4Name = "king";
                         System.out.println("You pick the "+card4Name+" of "+ card4Type);
                        break;
            }
        }
        else if(card4<53)
        {
            card4Type = "spades";
            card4=card4-39;
            if(card4 <=10 && card4 >=2)
            {
                System.out.println("You pick the "+card4+" of "+ card4Type);
            }
            switch(card4)
            {
                case 1:
                    card4Name = "ace";
                     System.out.println("You pick the "+card4Name+" of "+ card4Type);
                       break;
                    case 11:
                        card4Name = "jack";
                         System.out.println("You pick the "+card4Name+" of "+ card4Type);
                        break;
                    case 12:
                        card4Name = "queen";
                         System.out.println("You pick the "+card4Name+" of "+ card4Type);
                        break;
                    case 13:
                        card4Name = "king";
                         System.out.println("You pick the "+card4Name+" of "+ card4Type);
                        break;
            }
        }
//Repeat for card 5
        if(card5<14)
        {
            card5Type = "diamonds";
            if(card5 <=10 && card5 >=2)
            {
                System.out.println("You pick the "+card5+" of "+ card5Type);
            }
            switch(card5)
            {
                case 1:
                    card5Name = "ace";
                     System.out.println("You pick the "+card5Name+" of "+ card5Type);
                       break;
                    case 11:
                        card5Name = "jack";
                         System.out.println("You pick the "+card5Name+" of "+ card5Type);
                        break;
                    case 12:
                        card5Name = "queen";
                         System.out.println("You pick the "+card5Name+" of "+ card5Type);
                        break;
                    case 13:
                        card5Name = "king";
                         System.out.println("You pick the "+card5Name+" of "+ card5Type);
                        break;
            }
        }
        else if(card5<27)
        {
            card5Type = "clubs";
            card5= card5-13;
            if(card5 <=10 && card5 >=2)
            {
                System.out.println("You pick the "+card5+" of "+ card5Type);
            }
            switch(card5)
            {
                case 1:
                    card5Name = "ace";
                     System.out.println("You pick the "+card5Name+" of "+ card5Type);
                       break;
                    case 11:
                        card5Name = "jack";
                         System.out.println("You pick the "+card5Name+" of "+ card5Type);
                        break;
                    case 12:
                        card5Name = "queen";
                         System.out.println("You pick the "+card5Name+" of "+ card5Type);
                        break;
                    case 13:
                        card5Name = "king";
                         System.out.println("You pick the "+card5Name+" of "+ card5Type);
                        break;
            }
        }
        else if(card5<40)
        {
            card5Type = "hearts";
            card5= card5-26;
            if(card5 <=10 && card5 >=2)
            {
                System.out.println("You pick the "+card5+" of "+ card5Type);
            }
            switch(card5)
            {
                case 1:
                    card5Name = "ace";
                     System.out.println("You pick the "+card5Name+" of "+ card5Type);
                       break;
                    case 11:
                        card5Name = "jack";
                         System.out.println("You pick the "+card5Name+" of "+ card5Type);
                        break;
                    case 12:
                        card5Name = "queen";
                         System.out.println("You pick the "+card5Name+" of "+ card5Type);
                        break;
                    case 13:
                        card5Name = "king";
                         System.out.println("You pick the "+card5Name+" of "+ card5Type);
                        break;
            }
        }
        else if(card5<53)
        {
            card5Type = "spades";
            card5=card5-39;
            if(card5 <=10 && card5 >=2)
            {
                System.out.println("You pick the "+card5+" of "+ card5Type);
            }
            switch(card5)
            {
                case 1:
                    card5Name = "ace";
                     System.out.println("You pick the "+card5Name+" of "+ card5Type);
                       break;
                    case 11:
                        card5Name = "jack";
                         System.out.println("You pick the "+card5Name+" of "+ card5Type);
                        break;
                    case 12:
                        card5Name = "queen";
                         System.out.println("You pick the "+card5Name+" of "+ card5Type);
                        break;
                    case 13:
                        card5Name = "king";
                         System.out.println("You pick the "+card5Name+" of "+ card5Type);
                        break;
            }
        }
//Add a blank line between the results and the pair output
        System.out.println();
//Start of pairing
//Check the cards for pairs by equating all the possible combinations
        if(card1==card2||card1==card3||card1==card4||card1==card5)
        {
            pair=true;
            pairNum=pairNum+1;
        }
        if(card2==card3||card2==card4||card2==card5)
        {
            pair = true;
            pairNum=pairNum+1;
        }
        if(card3==card4||card3==card5)
        {
            pair = true;
            pairNum=pairNum+1;
        }
        if(card4==card5)
        {
            pair = true;
            pairNum=pairNum+1;
        }
//Check for three of a kind by equating three cards
        if(card1==card2&&card2==card3)
        {
            threeKind=true;
//In the case of a three of a kind, there will be two pairs noticed by the code above
//pairNum=pairNum-2 gets rid of the pairs 
//so it does not print that there are pairs and three of a kind
            pairNum=pairNum-2;
            threeKindNum = threeKindNum+1;
        }
        if(card1==card2&&card2==card4)
        {
            threeKind=true;
            pairNum=pairNum-2;
            threeKindNum = threeKindNum+1;
        }
        if(card1==card2&&card2==card5)
        {
            threeKind=true;
            pairNum=pairNum-2;
            threeKindNum = threeKindNum+1;
        }
        if(card1==card3&&card3==card4)
        {
            threeKind=true;
            pairNum=pairNum-2;
            threeKindNum = threeKindNum+1;
        }
        if(card1==card3&&card3==card5)
        {
            threeKind=true;
            pairNum=pairNum-2;
            threeKindNum = threeKindNum+1;
        }
        if(card1==card4&&card4==card5)
        {
            threeKind=true;
            pairNum=pairNum-2;
            threeKindNum = threeKindNum+1;
        }
        if(card2==card3&&card3==card4)
        {
            threeKind=true;
            pairNum=pairNum-2;
            threeKindNum = threeKindNum+1;
        }
        if(card2==card3&&card3==card5)
        {
            threeKind=true;
            pairNum=pairNum-2;
            threeKindNum = threeKindNum+1;
        }
        if(card2==card4&&card4==card5)
        {
            threeKind=true;
            pairNum=pairNum-2;
            threeKindNum = threeKindNum+1;
        }
        if(card3==card4&&card4==card5)
        {
            threeKind=true;
            pairNum=pairNum-2;
            threeKindNum = threeKindNum+1;
        }
//If there are no pairs of three of a kind print out high card hand
        if(pairNum==0&&threeKindNum==0)
        {
            System.out.println("You have a high card hand.");
        }
//when pairNum=1 that means there is one pair
        if(pairNum==1)
        {
            System.out.println("You have "+ pairNum +" pair.");
        }
//When pairNum=2 there are two pairs
        if(pairNum==2)
        {
            System.out.println("You have "+ pairNum +" pairs.");
        }
//threeKind=1 means there is one three of a kind
        if(threeKindNum==1)
        {
            System.out.println("You have "+ threeKindNum +" three of a kind.");
        }
    }
}