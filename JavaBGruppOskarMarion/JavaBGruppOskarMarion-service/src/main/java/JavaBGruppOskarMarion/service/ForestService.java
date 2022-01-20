package JavaBGruppOskarMarion.service;

import JavaBGruppOskarMarion.domain.Animal;
import JavaBGruppOskarMarion.domain.Owl;
import JavaBGruppOskarMarion.domain.Squirrel;
import JavaBGruppOskarMarion.domain.Pine;
import JavaBGruppOskarMarion.domain.Rat;
import JavaBGruppOskarMarion.domain.Fungus;
import JavaBGruppOskarMarion.domain.Plant;


public interface ForestService {

    Owl createOwl(String latinName, int wingSpan, int heightAboveGround);
    Squirrel createSquirrel(int weight, int age, String name, boolean hungry, int numOfConesInNest);
    Pine createPine(String latinName, int height, int age, Animal owl, double windMpS, boolean forestFireTrueOrFalse);
    Rat createRat(int number, String type);
    Plant createPlant(String type, int number, int height);
    Fungus createFungus(String type, int number, int height);
}
