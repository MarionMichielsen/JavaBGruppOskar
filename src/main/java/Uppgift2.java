import java.util.Random;

public class Uppgift2 {
    public static void run(){
        Animal o1 = new Owl(3, 5, 180, 230, true);
        Animal s1 = new Squirrel(1, 2, "Orre", false, 23);
        Animal s2 = new Squirrel(2, 4, "Korre", true, 56);
        Animal s3 = new Squirrel(1, 5, "Kurre", false, 48);
        Animal s4 = new Squirrel(3, 6, "Ogge", true, 8);
        Animal s5 = new Squirrel(4, 7, "Urre", true, 12);

        Pine p1 = new Pine("Pinus", 200, 103, o1, 2.9, false);
        p1.addSquirrel(s1);
        p1.addSquirrel(s2);
        p1.addSquirrel(s3);
        p1.addSquirrel(s4);
        p1.addSquirrel(s5);

        Fungus sv1 = new Fungus("Chanterelle", 20, 5);
        Fungus sv2 = new Fungus("Karl-Johan", 12, 4);
        Fungus sv3 = new Fungus("Mushroom", 23, 6);

        p1.addFungus(sv1);
        p1.addFungus(sv2);
        p1.addFungus(sv3);

        Food v1 = new Plant("Blueberry", 188, 5);
        Food v2 = new Plant("Lingon", 232, 6);
        Food v3 = new Plant("Raspberry", 21, 12);

        Food r1 = new Rat(4, "rat");
        p1.addPlant(v1);
        p1.addPlant(v2);
        p1.addPlant(v3);

        System.out.println("Now the owl will try to eat a rat:");

        if (o1.eat(r1)) {
            r1.setNumber((r1.getNumber()) - 1);
            o1.setWeight(o1.getWeight()+1);
            System.out.println("The owl ate a rat! now there are only "+r1.getNumber()+" rats left");
        }
        else System.out.println("The rat escaped!");

        System.out.println("The squirrel is also hungry and will try to eat some plants:");

        Random rand = new Random();
        int whichplant = rand.nextInt(3);
        int nrOfPlants = rand.nextInt(5);
        if (whichplant == 0){
            if (s1.eat(v1)) {
                v1.setNumber((v1.getNumber()) - nrOfPlants);
                o1.setWeight(o1.getWeight()+1);
                System.out.println("He found the plants. He ate "+nrOfPlants+" "+v1.getType()+". Now there are only "+v1.getNumber()+" of these left. ");
            }
            else System.out.println("The squirrel didn't find any plants he liked....");
        }
        if (whichplant == 1){
            if (s1.eat(v2)) {
                v1.setNumber((v2.getNumber()) - nrOfPlants);
                o1.setWeight(o1.getWeight()+1);
                System.out.println("He found the plants. He ate "+nrOfPlants+" "+v2.getType()+". Now there are only "+v2.getNumber()+" of these left. ");
            }
            else System.out.println("The squirrel didn't find any plants he liked....");
        }
        if (whichplant == 2){
            if (s1.eat(v3)) {
                v1.setNumber((v1.getNumber()) - nrOfPlants);
                o1.setWeight(o1.getWeight()+1);
                System.out.println("He found the plants. He ate "+nrOfPlants+" "+v3.getType()+". Now there are only "+v3.getNumber()+" of these left. ");
            }
            else System.out.println("The squirrel didn't find any plants he liked....");
        }
        }

    }
