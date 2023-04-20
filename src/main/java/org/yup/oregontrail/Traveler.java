package org.yup.oregontrail;

public class Traveler {

    private String name;
    private int health;
    private boolean isHealthy;
    private int food;

    //constructor is always named after the class
    public Traveler(String name, int health, int food) {
        this.name = name;
        this.health = health;
        this.food = food;
        this.isHealthy = true;

    }

    public String hunt(){

        //user needs to hunt
        //they have a 50% of being successful
        if(Math.random() > .5){
            //if they are successful we add 100 to their food and 0 to their food if not
            this.setFood(this.getFood() + 100);

            return "Congrats, you're not going to die of hunger yet " + this.getName() + ". Food is now at: " + this.getFood();

        }

        return "Plan accordingly, you might die in a few days " + this.getName() + ". The food is still at " + this.getFood();

    }

    public String eat(){

        //Consumes 20 of the traveler's food. If the traveler doesn't have 20 food, the traveler is no longer healthy.
        if(this.getFood() >= 20){
            this.setFood(this.getFood() - 20);
            this.setHealthy(true);
            this.setHealth(100);
            return "That was delicious!";
        }else{
            this.setHealthy(false);
            this.setHealth(0);
            return "I am definitely going to die.";
        }

    }

    //below shows a getter and setter
    public String getName() {
        return name;

    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public boolean isHealthy() {
        return isHealthy;
    }

    public void setHealthy(boolean healthy) {
        isHealthy = healthy;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }
}
