package az.iktlab.hackerrank.oop.animals;

import az.iktlab.hackerrank.oop.Pet;
import az.iktlab.hackerrank.oop.enums.Species;
import az.iktlab.hackerrank.oop.inter.Foul;

public class Dog extends Pet implements Foul {
    public Dog() {
        super.setSpecies(Species.DOG);
    }
    @Override
    public void respond() {
        System.out.println("Whof Whof!!!");
    }

    @Override
    public void foul() {
        System.out.println("I need to cover Dog's foul");
    }
}
