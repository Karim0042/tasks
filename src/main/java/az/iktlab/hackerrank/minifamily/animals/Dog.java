package az.iktlab.hackerrank.minifamily.animals;

import az.iktlab.hackerrank.minifamily.bean.Pet;
import az.iktlab.hackerrank.minifamily.enums.Species;
import az.iktlab.hackerrank.minifamily.inter.Foul;

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
