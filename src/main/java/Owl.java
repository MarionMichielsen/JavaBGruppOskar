import java.util.Random;

public class Owl extends Animal{
   // private int age;
    private String latinName;
   // private boolean hungry;
    private int wingSpan;
    private int heightAboveGround;
  //  private int weight;
/*
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }*/

    public Owl(int age, int weight, int wingSpan, int heightAboveGround, boolean hungry) {
        super(weight, age, hungry);
       // setAge(age);
        setWingSpan(wingSpan);
        setHeightAboveGround(heightAboveGround);
      //  setHungry(hungry);
      //  setWeight(weight);
    }
/*
    public void setAge(int age) {
        this.age = age;
    }*/

    public void setWingSpan(int wingSpan) {
        this.wingSpan = wingSpan;
    }

    public void setHeightAboveGround(int heightAboveGround) {
        this.heightAboveGround = heightAboveGround;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }/*
    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }*/



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
