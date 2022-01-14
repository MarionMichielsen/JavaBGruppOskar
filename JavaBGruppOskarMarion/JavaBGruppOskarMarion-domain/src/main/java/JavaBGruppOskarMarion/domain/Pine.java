package JavaBGruppOskarMarion.domain;

import java.util.ArrayList;

public class Pine {

    private String latinName;
    private int height;
    private int age;
    private final ArrayList<Animal> squirrels = new ArrayList<>();
    private final ArrayList<Food> plants = new ArrayList<>();
    private final ArrayList<Fungus> fungus = new ArrayList<>();
    private Animal owl;
    private int numOfCones;
    private double windMpS;
    private boolean forestFireTrueOrFalse;

    public Pine(String latinName, int height, int age, Animal owl, double windMpS, boolean forestFireTrueOrFalse) {
        super();
        setLatinName(latinName);
        setAge(age);
        setOwl(owl);
        setNumOfCones(numOfCones);
        setWindMpS(windMpS);
        setForestFireTrueOrFalse(forestFireTrueOrFalse);
    }

    public boolean willPineFall(int age, double windMpS, boolean forestFireTrueOrFalse) {
        if (age >= 100 && windMpS >= 10 || forestFireTrueOrFalse){
            remainingSquirrels();
            return true;
        }
        else
            return false;
    }

    public void remainingSquirrels(){
            squirrels.clear();
    }

    public ArrayList<Animal> getSquirrels() {
        return squirrels;
    }
    public ArrayList<Food> getPlants() {
        return plants;
    }

    public ArrayList<Fungus> getFungus(){
        return fungus;
    }


    public void addSquirrel(Animal s){
        squirrels.add(s);
    }

    public void addFungus(Fungus sv){
        fungus.add(sv);
    }

    public void addPlant(Food v) {
        plants.add(v);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Animal getOwl() {
        return owl;
    }

    public void setOwl(Animal owl) {
        this.owl = owl;
    }

    public String getLatinName() {
        return latinName;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWindMpS() {
        return windMpS;
    }

    public void setWindMpS(double windMpS) {
        this.windMpS = windMpS;
    }

    public boolean isForestFireTrueOrFalse() {
        return forestFireTrueOrFalse;
    }

    public void setForestFireTrueOrFalse(boolean forestFireTrueOrFalse) {
        this.forestFireTrueOrFalse = forestFireTrueOrFalse;
    }

    public int getNumOfCones() {
        return numOfCones;
    }

    public void setNumOfCones(int numOfCones) {
        this.numOfCones = numOfCones;
    }
}