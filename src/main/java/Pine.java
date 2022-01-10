import java.lang.reflect.Array;
import java.util.ArrayList;

public class Pine {

    private String latinName;
    private int height;
    private int age;
    private final ArrayList<Squirrel> squirrels = new ArrayList<>();
    private final ArrayList<Plant> plants = new ArrayList<Växt>();
    private final ArrayList<Fungus> fungus = new ArrayList<fungus>();
    private Owl owl;
    private int numOfCones;
    private double windMpS;
    private boolean forestFireTrueOrFalse;

    public Pine(String latinName, int height  ht, int age, Owl owl, int numOfCones, double windMpS, boolean forestFireTrueOrFalse) {
        super();
        this.latinName = latinName;
        this.age = age;
        this.owl = owl;
        this.numOfCones = numOfCones;
        this.windMpS = windMpS;
        this.forestFireTrueOrFalse = forestFireTrueOrFalse;
    }

    public boolean willPineFall(int age, double windMpS, boolean forestFireTrueOrFalse) {
        if (age >= 100 && windMpS >= 10 || forestFireTrueOrFalse == true){
            return true;
        }
        else
            return false;
    }

    public void remainingSquirrels(boolean forestFireTrueOrFalse){
        if (forestFireTrueOrFalse == true){
            squirrels.clear();
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Owl getOwl() {
        return owl;
    }

    public void setOwl(Owl owl) {
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