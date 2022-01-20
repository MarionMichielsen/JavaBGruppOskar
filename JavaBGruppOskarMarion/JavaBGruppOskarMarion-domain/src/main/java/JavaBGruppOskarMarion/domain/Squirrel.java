package JavaBGruppOskarMarion.domain;

import java.util.Random;

public class Squirrel extends Animal {

    public Squirrel(int weight, int age, String name, boolean hungry, int numOfConesInNest) {
        super(weight, age, hungry);
        setNumOfConesInNest(numOfConesInNest);
        setName(name);

    }

   public String getName(){
        return name;
   }

    public void setNumOfConesInNest(int numOfConesInNest) {
        this.numOfConesInNest = numOfConesInNest;
    }

    public void setName(String name) {
           this.name = name;
    }
    public int getNumOfConesInNest() {
        return numOfConesInNest;
    }

    public int collectCones(){
        Random rand = new Random();
        int conesCollected = rand.nextInt(10);
        numOfConesInNest += conesCollected;
        return conesCollected;
    }

    @Override
        public boolean eat(Food food){
        Random rand = new Random();
        int hungryOrNot = rand.nextInt(2);
        if (hungryOrNot == 0)
            return true;
        else{
            System.out.println("Not hungry");
            return false;}

    }

    private String name;
    private int numOfConesInNest;


}


