import java.util.Random;

public class Owl {
    private int age;
    private String latinName;
    private boolean hungry;
    private int wingSpan;
    private int heightAboveGround;

    public Owl(int age, int wingSpan, int heightAboveGround, boolean hungry) {
        setAge(age);
        setWingSpan(wingSpan);
        setHeightAboveGround(heightAboveGround);
        setHungry(hungry);
    }

    public void setAge(int age) {
        this.age = age;
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

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public boolean eat(){
        Random rand = new Random();
        int hungryOrNot = rand.nextInt(2);
        if (hungryOrNot == 0){
            heightAboveGround = 0;
            hungry = true;
            return true;
        }
        System.out.println("The owl was hungry, but the squirrels noticed the owl and escaped!");
            return false;
        }



}
