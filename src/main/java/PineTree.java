import java.util.*;

public class PineTree {
    private int age;
    private int height;
    private String latinName;
   private final ArrayList<Squirrel> squirrels = new ArrayList<Squirrel>();
    private final ArrayList<Växt> plants = new ArrayList<Växt>();
    private final ArrayList<Svamp> svampar = new ArrayList<Svamp>();
    private Owl owl;
    private int numOfCones;

    public ArrayList<Squirrel> getSquirrels() {
        return squirrels;
    }
    public ArrayList<Växt> getPlants() {
    return plants;
    }

    public ArrayList<Svamp> getSvampar(){
        return svampar;
    }


    public void addSquirrel(Squirrel s){
        squirrels.add(s);
    }

    public void addSvamp(Svamp sv){
        svampar.add(sv);
    }

    public void addVäxt(Växt v){
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
