package JavaBGruppOskarMarion.domain;

import java.util.Random;

public class Squirrel extends Animal {

    public Squirrel(int weight, int age, String name, boolean hungry, int numOfConesInNest) {
        super(weight, age, hungry);
        setNumOfConesInNest(numOfConesInNest);
     //   setWeight(weight);
     //   setAge(age);
        setName(name);
      //  setHungry(hungry);
    }

   public String getName(){
        return name;
   }

   // public void setWeight(int weight) {
    //    this.weight = weight;
    //}

  //  public void setHungry(boolean hungry) {
   //     this.hungry = hungry;
   // }

    public void setNumOfConesInNest(int numOfConesInNest) {
        this.numOfConesInNest = numOfConesInNest;
    }

    /*public void setAge(int age) {
        this.age = age;
    }*/
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

        /*if (hungry){
            int howManyCones = (rand.nextInt(5))+1;
            numOfConesInNest-= howManyCones;

            System.out.println("After lunch: "+getNumOfConesInNest());
            weight++;
            hungry = false;

        }
        return true;*/
    }


 //   private int age;
    private String name;
   // private boolean hungry;
    private int numOfConesInNest;
 //   private int weight;


}


