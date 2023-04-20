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


    }

}
