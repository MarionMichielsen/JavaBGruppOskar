import java.sql.SQLOutput;
import java.util.Random;

public class Squirrel {
    public String getName(){
        return name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public void setNumOfConesInNest(int numOfConesInNest) {
        this.numOfConesInNest = numOfConesInNest;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getNumOfConesInNest() {
        return numOfConesInNest;
    }

    public void eat(){
        Random rand = new Random();
        int hungryOrNot = rand.nextInt(2);
        if (hungryOrNot == 0)
            hungry = true;
        else{
            System.out.println("Not hungry");
            hungry = false;}

        if (hungry){
            int howManyCones = (rand.nextInt(5))+1;
            numOfConesInNest-= howManyCones;
            weight++;
            hungry = false;
            System.out.println("After lunch: "+getNumOfConesInNest());
        }
    }

    private int age;
    private String name;
    private boolean hungry;
    private int numOfConesInNest;
    private int weight;



    public Squirrel(int weight, int age, String name, boolean hungry, int numOfConesInNest) {
    setNumOfConesInNest(numOfConesInNest);
    setWeight(weight);
    setAge(age);
    setName(name);
    setHungry(hungry);

    }


}


