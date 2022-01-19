package JavaBGruppOskarMarion.domain;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;

public class App {
    public static void main(String[] args) {

       JavaBGruppOskarMarion.domain.ForestMenu start = new JavaBGruppOskarMarion.domain.ForestMenu();
      start.run();

       // Uppgift2 uppgift2 = new Uppgift2();
       // Uppgift2.run();

    }

        /*
        Random rand = new Random();
        System.out.println("Hello");
        JavaBGruppOskarMarion.domain.Owl o1 = new JavaBGruppOskarMarion.domain.Owl(3, 5, 180, 230, true);
        JavaBGruppOskarMarion.domain.Squirrel s1 = new JavaBGruppOskarMarion.domain.Squirrel(1, 2, "Orre", false, 23);
        JavaBGruppOskarMarion.domain.Squirrel s2 = new JavaBGruppOskarMarion.domain.Squirrel(2, 4, "Korre", true, 56);
        JavaBGruppOskarMarion.domain.Squirrel s3 = new JavaBGruppOskarMarion.domain.Squirrel(1, 5, "Kurre", false, 48);
        JavaBGruppOskarMarion.domain.Squirrel s4 = new JavaBGruppOskarMarion.domain.Squirrel(3, 6, "Ogge", true, 8);
        JavaBGruppOskarMarion.domain.Squirrel s5 = new JavaBGruppOskarMarion.domain.Squirrel(4, 7, "Urre", true, 12);

        PineTree p1 = new PineTree(35, 200, "pinus", o1, 73);
        p1.addSquirrel(s1);
        p1.addSquirrel(s2);
        p1.addSquirrel(s3);
        p1.addSquirrel(s4);
        p1.addSquirrel(s5);

        Svamp sv1 = new Svamp("Kantarell", 20, 5);
        Svamp sv2 = new Svamp ("Karl-Johan", 12, 4);
        Svamp sv3 = new Svamp ("Kantkremla", 23, 6);

        p1.addSvamp(sv1);
        p1.addSvamp(sv2);
        p1.addSvamp(sv3);

        Växt v1 = new Växt("Blåbär", 188, 5);
        Växt v2 = new Växt("Lingon", 232, 6);
        Växt v3 = new Växt("Skogsstjärna", 21, 12);

        p1.addVäxt(v1);
        p1.addVäxt(v2);
        p1.addVäxt(v3);

        System.out.println("The number of Cones in the nest: ");
        for (JavaBGruppOskarMarion.domain.Squirrel s : p1.getSquirrels()) {
            System.out.print(s.getName()+" "+s.getNumOfConesInNest()+", ");
            s.eat();
       }
        System.out.println("Orre went out to collect cones before the winter was coming. " +
                "He got "+s1.collectCones()+" cones. " +
                "That made his total of cones in the nest: "+s1.getNumOfConesInNest());
        if (o1.eat()){
            p1.getSquirrels().remove((rand.nextInt(5)));
            System.out.println("After the owl ate one of the squirrels, these are left: ");
            for (JavaBGruppOskarMarion.domain.Squirrel s : p1.getSquirrels()) {
                System.out.print(s.getName()+" ");
        }

        }
    }*/
}
