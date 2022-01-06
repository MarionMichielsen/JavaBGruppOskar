import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("Hello");
        Owl o1 = new Owl(3, 180, 230, true);
        Squirrel s1 = new Squirrel(1, 2, "Orre", false, 23);
        Squirrel s2 = new Squirrel(2, 4, "Korre", true, 56);
        Squirrel s3 = new Squirrel(1, 5, "Kurre", false, 48);
        Squirrel s4 = new Squirrel(3, 6, "Ogge", true, 8);
        Squirrel s5 = new Squirrel(4, 7, "Urre", true, 12);

        PineTree p1 = new PineTree(35, 200, "pinus", o1, 73);
        p1.squirrels.add(s1);
        p1.squirrels.add(s2);
        p1.squirrels.add(s3);
        p1.squirrels.add(s4);
        p1.squirrels.add(s5);


        System.out.println("The number of Cones in the nest: ");
        for (Squirrel s : p1.squirrels) {
            System.out.print(s.getName()+" "+s.getNumOfConesInNest()+", ");
            s.eat();
       }
        if (o1.eat()){
            p1.squirrels.remove((rand.nextInt(5)));
            System.out.println("After the owl ate one of the squirrels, these are left: ");
            for (Squirrel s : p1.squirrels) {
                System.out.print(s.getName()+" ");
        }

        }
    }
}
