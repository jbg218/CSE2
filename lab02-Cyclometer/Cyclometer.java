//Jeremy Glennon
//September 4th 2015
//CSE002
//Lab 02 Cyclometer
//Measures and prints out speed, distance, and cycles for a bicycle trip
//Compile the program
//  javac Cyclometer.java
//Then run the program
//  java Cyclometer


public class Cyclometer
{
    //main method required for every java program
    public static void main(String[] args)
    {
//Declare variables for input data and their values
        int secsTrip1=480; //the length of trip 1 in seconds
        int secsTrip2=3220; //the length of trip 2 in seconds
        int countsTrip1=1561; //the cycles during trips 1
        int countsTrip2=9037; //the cycles during trips 2
//Declare intermediate variables and output data
        double wheelDiameter=27.0; //diameter of the bike wheel in inches
        double pi=3.14159; //value of pi for calculations
        double feetPerMile=5280; //feet to mile exchange
        double inchesPerFoot=12; //inch to foot exxchange
        double secondsPerMinute=60; //seconds to minute exchange
        double distanceTrip1; //variable for distance of 1st trip
        double distanceTrip2; //variable for distance of 2nd trip
        double totalDistance; //variable for total distance
//next print the stored variables
        System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+"minutes and had "+countsTrip1+" counts.");
        System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+"minutes and had "+countsTrip2+" counts.");
//next calculate the distance of the trips in inches
//counts times the diameter times pi gives distance
        distanceTrip1=countsTrip1*wheelDiameter*pi;
        distanceTrip2=countsTrip2*wheelDiameter*pi;
//and convert to miles
        distanceTrip1=distanceTrip1/inchesPerFoot/feetPerMile;
        distanceTrip2=distanceTrip2/inchesPerFoot/feetPerMile;
//add both trips for total distance        
        totalDistance=distanceTrip1+distanceTrip2;
//Print out distances
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
    } // end of main method
} // end of class