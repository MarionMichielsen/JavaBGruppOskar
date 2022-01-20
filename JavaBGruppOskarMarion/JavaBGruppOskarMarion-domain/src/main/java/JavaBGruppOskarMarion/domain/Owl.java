package JavaBGruppOskarMarion.domain;

import java.util.Random;

public class Owl extends Animal{

    private String latinName;

    private int wingSpan;
    private int heightAboveGround;



    /*public Owl(int age, int weight, int wingSpan, int heightAboveGround, boolean hungry) {
        super(weight, age, hungry);
        setWingSpan(wingSpan);
        setHeightAboveGround(heightAboveGround);

    }*/

    public Owl(String latinName, int wingSpan, int heightAboveGround) {
        super();

    }


    public void setWingSpan(int wingSpan) {
        this.wingSpan = wingSpan;
    }

    public void setHeightAboveGround(int heightAboveGround) {
        this.heightAboveGround = heightAboveGround;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }



     @Override
        public boolean eat(Food food){
        Random rand = new Random();
        int runOrNot = rand.nextInt(2);
        if (runOrNot == 0){
            heightAboveGround = 0;
            weight ++;
            hungry = true;
            return true;
        }
        System.out.println("The owl wanted to eat the little animal, but they ran away!");
            return false;
        }



}
