import java.util.Scanner;
import java.util.Random;

public class ForestMenu {

    public static void run() {
        Scanner userResponse = new Scanner(System.in);
        Owl o1 = new Owl(3, 5, 180, 230, true);
        Squirrel s1 = new Squirrel(1, 2, "Orre", false, 23);
        Squirrel s2 = new Squirrel(2, 4, "Korre", true, 56);
        Squirrel s3 = new Squirrel(1, 5, "Kurre", false, 48);
        Squirrel s4 = new Squirrel(3, 6, "Ogge", true, 8);
        Squirrel s5 = new Squirrel(4, 7, "Urre", true, 12);

        Pine p1 = new Pine(Pinus, 35, "75",  o1, 73);
        p1.addSquirrel(s1);
        p1.addSquirrel(s2);
        p1.addSquirrel(s3);
        p1.addSquirrel(s4);
        p1.addSquirrel(s5);

        Fungus sv1 = new Fungus("Kantarell", 20, 5);
        Fungus sv2 = new Fungus("Karl-Johan", 12, 4);
        Fungus sv3 = new Fungus("Kantkremla", 23, 6);

        p1.addFungus(sv1);
        p1.addFungus(sv2);
        p1.addFungus(sv3);

        Plant v1 = new Plant("Blåbär", 188, 5);
        Plant v2 = new Plant("Lingon", 232, 6);
        Plant v3 = new Plant("Skogsstjärna", 21, 12);

        p1.addPlant(v1);
        p1.addPlant(v2);
        p1.addPlant(v3);


        while (true) {
            System.out.println("Meny:");
            System.out.println("Vad vill du observera? Svara med 1, 2, 3, 4, 5.");
            System.out.println("1. Tallen \n2. Ekorrarna \n3. Ugglan \n4. Vill du höra en historia? \n5.Exit");
            int answer = userResponse.nextInt();

            if (answer == 1) {
                System.out.println("Hur många år är trädet?");
                int pineAge = userResponse.nextInt();
                if (pineAge >= 100) {
                    System.out.println("Det var ett gammalt träd.");
                } else {
                    System.out.println("Det var ett ungt träd.");
                }
                userResponse.nextLine();
                System.out.println("Vet du vad det latinska namnet på tall är? Ledtråd: Det börjar på P och slutar på inus.");
                String pineNameAnswer = userResponse.nextLine();
                System.out.println("Hur många sekundmeter blåser det?");
                double windMpS = userResponse.nextDouble();
                System.out.println("Sista frågan, förekommer det en skogsbrand? true eller false");
                boolean userResponseForestFire = userResponse.nextBoolean();
                Owl owl = new Owl(15, 180, 233, 255, true);
                Pine pine = new Pine(pineNameAnswer, 200, pineAge, owl, windMpS, userResponseForestFire);
                System.out.println("Kommer tallen att falla? " + pine.willPineFall(pineAge, windMpS, userResponseForestFire));
            } else if (answer == 2) {
                System.out.println("The number of Cones in the nest: ");
                for (Squirrel s : p1.getSquirrels()) {
                    System.out.print(s.getName() + " " + s.getNumOfConesInNest() + ", ");
                    s.eat();
                }


            } else if (answer == 3) {
                System.out.println("Let's see if the owl will eat some of the squirrels");
                if (o1.eat()) {
                    Random rand = new Random();
                    p1.getSquirrels().remove((rand.nextInt(5)));
                    System.out.println("After the owl ate one of the squirrels, these are left: ");
                    for (Squirrel s : p1.getSquirrels()) {
                        System.out.print(s.getName() + " ");
                    }
                    System.out.println();
                }
            } else if (answer == 4) {
                System.out.println("It was a beautiful day in the fall. " +
                        "There was a forrest with a large pine tree. In the pine tree these squirrels lived: ");
                for (Squirrel s : p1.getSquirrels()) {
                    System.out.print(s.getName() + " ");
                }
                System.out.println();
                System.out.println("There was also an owl named Uffe. Around the tree were these plants: ");
                for (Växt v : p1.getPlants()) {
                    System.out.print(v.getType() + " ");
                }
                System.out.println();
                System.out.println("and these mushrooms: ");
                for (Fungus s : p1.getFungus()) {
                    System.out.print(s.getType() + " ");
                }

                System.out.println();
                System.out.println("Squirrel Orre went to collect cones. " +
                        "He collected " + s1.collectCones() + " cones. That made his total: " + s1.getNumOfConesInNest());
                System.out.println("Uffe the owl was hungry and got his eyes on a squirrel");
                if (o1.eat()) {
                    Random rand = new Random();
                    p1.getSquirrels().remove((rand.nextInt(5)));
                    System.out.println("After the owl ate one of the squirrels, these are left: ");
                    for (Squirrel s : p1.getSquirrels()) {
                        System.out.print(s.getName() + " ");
                    }
                    System.out.println();
                }
            }
            else if (answer == 5){
                break;
            }
        }
    }
}