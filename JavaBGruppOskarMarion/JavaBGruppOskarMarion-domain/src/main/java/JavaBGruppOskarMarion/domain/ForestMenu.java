package JavaBGruppOskarMarion.domain;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class ForestMenu {

    public static void run() {
        boolean userResponseForestFire = true;
        double windMpS = 8.2;
        String pineNameAnswer = "pinus";
        int pineAge = 103;
        int answer = 0;
        boolean noDigit = true;


        Animal o1 = new Owl("Uggla", 5, 180);
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

        Scanner userResponse = new Scanner(System.in);


        int nrInput = 0;

        while (nrInput < 3) {
            try {
                System.out.println("Menu:");
                System.out.println("What would you like to observe? Answer 1, 2, 3, 4, 5.");
                System.out.println("1. Pine Tree \n2. Squirrels \n3. Owls \n4. " +
                        "Would you like to read a story? \n5. Exit");
                answer = userResponse.nextInt();
                if (answer >= 6) {
                    System.out.println("That number is too large. Please choose 1-5!");
                    nrInput++;
                    continue;
                }
                if (answer <= 0) {
                    System.out.println("That number is negative. Please choose 1-5!");
                    nrInput++;
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input.  Choose a number from 1-5");
                userResponse.nextLine();
                nrInput++;
                userResponse.nextLine(); // clears the buffer
            }

        }

        if (nrInput == 3) {
            System.out.println("You entered invalid input three times. Program quits.");
            System.exit(0);

        }
                  if (answer == 1) {
                System.out.println("How old is the tree?");
                noDigit = true;
                while (noDigit)
                try {
                    pineAge = userResponse.nextInt();
                    noDigit = false;
                }

                catch (InputMismatchException f){
                    System.out.println("You have to enter a digit");
                    userResponse.nextLine();
                }
                        if (pineAge >= 100) {
                        System.out.println("That's an old tree.");
                        }
                        else {
                        System.out.println("That's a young tree.");
                        }
                    userResponse.nextLine();
                    System.out.println("Do you know the latin name of the tree? Clue: It starts with P and end on inus.");
                    pineNameAnswer = userResponse.nextLine();

                    System.out.println("How many meters per second does the wind blow?");
                    boolean noDouble = true;
                    while (noDouble)
                        try {
                            windMpS = userResponse.nextDouble();
                            noDouble = false;
                        }

                        catch (InputMismatchException g){
                            System.out.println("Please enter a number. Could be with decimals");
                            userResponse.nextLine();
                        }

                    System.out.println("Last question: is there a forest fire? True or False.");
                    boolean noBoolean = true;
                    while (noBoolean)
                        try {
                            userResponseForestFire = userResponse.nextBoolean();
                            noBoolean = false;
                        }

                        catch (InputMismatchException h){
                            System.out.println("Please enter true or false");
                            userResponse.nextLine();
                        }

                    Owl owl = new Owl("Uggla", 180, 233);
                    Pine pine = new Pine(pineNameAnswer, 200, pineAge, owl, windMpS, userResponseForestFire);
                    System.out.println("Will the tree fall? " + pine.willPineFall(pineAge, windMpS, userResponseForestFire));
                    if (pine.willPineFall(pineAge, windMpS, userResponseForestFire) && (userResponseForestFire)) {
                        System.out.println("The tree burned in the fire!");
                        System.out.println("All the poor squirrels died....");
                    } else if (pine.willPineFall(pineAge, windMpS, userResponseForestFire) && (!userResponseForestFire)) {
                        System.out.println("The tree fell due to the strong wind");
                        System.out.println("The squirrels moved to another tree.");
                    } else if (!pine.willPineFall(pineAge, windMpS, userResponseForestFire)) {
                        System.out.println("The tree did not fall!");
                    }

                } else if (answer == 2) {
                    System.out.println("The number of Cones in the nest: ");
                    for (Animal s : p1.getSquirrels()) {
                        System.out.print(((Squirrel) s).getName() + " " + ((Squirrel) s).getNumOfConesInNest() + ", ");
                        s.eat(v1);
                    }

                } else if (answer == 3) {
                    System.out.println("Let's see if the owl will eat some of the squirrels");
                    ifEat(o1, p1, r1);
                } else if (answer == 4) {
                    System.out.println("It was a beautiful day in the fall. " +
                            "There was a forrest with a large pine tree. In the pine tree these squirrels lived: ");
                    for (Animal s : p1.getSquirrels()) {
                        System.out.print(((Squirrel) s).getName() + " ");
                    }
                    System.out.println();
                    System.out.println("There was also an owl named Uffe. Around the tree were these plants: ");
                    for (Food v : p1.getPlants()) {
                        System.out.print(v.getType() + " ");
                    }
                    System.out.println();
                    System.out.println("and these mushrooms: ");
                    for (Fungus s : p1.getFungus()) {
                        System.out.print(s.getType() + " ");
                    }

                    System.out.println();
                    System.out.println("JavaBGruppOskarMarion.domain.Squirrel Orre went to collect cones. " +
                            "He collected " + ((Squirrel) s1).collectCones() + " cones. That made his total: " + ((Squirrel) s1).getNumOfConesInNest());
                    System.out.println("Uffe the owl was hungry and got his eyes on a squirrel");
                    ifEat(o1, p1, r1);
                    Owl owl = new Owl("Owly", 180, 233);
                    Pine pine = new Pine(pineNameAnswer, 200, pineAge, owl, windMpS, userResponseForestFire);
                    System.out.println("The weather then turned around. But will the tree stand up? ");
                    System.out.println("How many meters per second does the wind blow?");
                    windMpS = userResponse.nextDouble();
                    System.out.println("Last question: is there a forest fire? True or False.");
                    userResponseForestFire = userResponse.nextBoolean();

                    if (pine.willPineFall(pineAge, windMpS, userResponseForestFire) && (userResponseForestFire)) {
                        System.out.println("The tree burned in the fire!");
                        System.out.println("All the poor squirrels died in the fire");
                    } else if (pine.willPineFall(pineAge, windMpS, userResponseForestFire) && (!userResponseForestFire)) {
                        System.out.println("The tree fell due to the strong wind");
                        System.out.println("The squirrels ran away to another tree.");
                    } else if (!pine.willPineFall(pineAge, windMpS, userResponseForestFire)) {
                        System.out.println("The tree did not fall!");
                    }

                } else if (answer == 5) {
                    System.out.println("Program quits.");
                    System.exit(0);
                } else {
                    System.out.println("You did not choose 1-5");
                }
            }


    private static void ifEat(Animal o1, Pine p1, Food r1) {
        if (o1.eat(r1)) {
            Random rand = new Random();
            p1.getSquirrels().remove((rand.nextInt(5)));
            System.out.println("After the owl ate one of the squirrels, these are left: ");
            for (Animal s : p1.getSquirrels()) {
                System.out.print(((Squirrel)s).getName() + " ");
            }
            System.out.println();
        }
    }
}