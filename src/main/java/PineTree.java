import java.util.*;

public class PineTree {
    private int age;
    private int height;
    private String latinName;
   private final ArrayList<Squirrel> squirrels = new ArrayList<Squirrel>();
    private final ArrayList<Plant> plants = new ArrayList<Plant>();
    private final ArrayList<Fungus> fungus = new ArrayList<Fungus>();
    private Owl owl;
    private int numOfCones;

    public ArrayList<Squirrel> getSquirrels() {
        return squirrels;
    }
    public ArrayList<Plant> getPlants() {
    return plants;
    }

    public ArrayList<Fungus> getFungus(){
        return fungus;
    }


    public void addSquirrel(Squirrel s){
        squirrels.add(s);
    }

    public void addFungus(Fungus sv){
        fungus.add(sv);
    }

    public void addPlant(Plant v){
        plants.add(v);
    }

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
    setAge(age);
    setHeight(height);
    setLatinName(latinName);
    setOwl(owl);
    setNumOfCones(numOfCones);

}

}
