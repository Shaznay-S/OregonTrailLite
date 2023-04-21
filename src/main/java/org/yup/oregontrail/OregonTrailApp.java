package org.yup.oregontrail;

public class OregonTrailApp {

    public static void main(String [] args){

        Traveler shaznay = new Traveler("Shaznay", 100, 100);

        System.out.println("Before the hunt: " + shaznay.getFood());
        System.out.println(shaznay.hunt());
        System.out.println("After the hunt: " + shaznay.getFood());
        System.out.println(shaznay.eat());
        System.out.println(shaznay.eat());
        System.out.println(shaznay.getFood());

        Traveler justin = new Traveler("Justin", 100, 100);

        Wagon theWagon = new Wagon(7);

        //this line is asking the wagon to give us the passenger list and we are checking the size(no. of passengers)
        System.out.println("Passengers: " + theWagon.getPassengers().size());
        //this line attempts to put any traveler we want into the wagon if there is room
        System.out.println(theWagon.join(shaznay));
        System.out.println("Passengers: " + theWagon.getPassengers().size());

        System.out.println(theWagon.join(justin));

        System.out.println(theWagon.getTotalFood());

    }

}
