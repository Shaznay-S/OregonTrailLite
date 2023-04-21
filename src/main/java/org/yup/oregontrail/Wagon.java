package org.yup.oregontrail;

import java.util.ArrayList;
public class Wagon {

    private ArrayList<Traveler> passengers = new ArrayList();
    private int capacity;

    public Wagon(int capacity){

        this.capacity = capacity;

    }

    public String join(Traveler theTraveler){

        if(this.capacity > this.passengers.size()){
            this.passengers.add(theTraveler);
            return theTraveler.getName() + " has joined the wagon!";
        }

        return "Tough luck " + theTraveler.getName() + ", try a different wagon.";

    }

    public String getTotalFood(){

        int totalFood = 0;

        for(int i = 0; i < this.getPassengers().size(); i++) {
            totalFood += this.getPassengers().get(i).getFood();
        }

        return "The wagon has a total amount of food: " + totalFood;

    }

    public ArrayList<Traveler> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Traveler> passengers) {
        this.passengers = passengers;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
