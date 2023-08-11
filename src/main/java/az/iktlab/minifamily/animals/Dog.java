package az.iktlab.minifamily.animals;

import az.iktlab.minifamily.enums.Species;
import az.iktlab.minifamily.inter.Foul;

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
