import java.util.*;

public class PineTree {
    private int age;
    private int height;
    private String latinName;
    ArrayList<Squirrel> squirrels = new ArrayList<Squirrel>();
    private Owl owl;
    private int numOfCones;

    public int getHeight() {
        return height;
    }

    public String getLatinName() {
        return latinName;
    }

    public Owl getOwl() {
        return owl;
    }

    public int getNumOfCones() {
        return numOfCones;
    }

    public void setNumOfCones(int numOfCones) {
        this.numOfCones = numOfCones;
    }

    public void setOwl(Owl owl) {
        this.owl = owl;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

public PineTree(int age, int height, String latinName, Owl owl, int numOfCones){

}
}
